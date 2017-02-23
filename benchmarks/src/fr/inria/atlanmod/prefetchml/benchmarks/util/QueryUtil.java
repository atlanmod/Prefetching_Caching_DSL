package fr.inria.atlanmod.prefetchml.benchmarks.util;

public class QueryUtil {

    public static String getBlockStatementsQuery() {
        return "self.statements";
    }
    
    public static String getClassToUnitQuery() {
        return "if(self.typeParameters->size() = 0) then "
                + " if(not(self.originalCompilationUnit.oclIsUndefined())) then "
                + "     let res : Set(ASTNode) = self.originalCompilationUnit.imports in "
                + "         res->union(self.originalCompilationUnit.comments) "
                + "         ->union(self.comments) "
                + "         ->union(self.commentsBeforeBody) "
                + "         ->union(self.commentsAfterBody) "
                + "         ->union(self.bodyDeclarations->select(e | e.oclIsTypeOf(FieldDeclaration)) "
                + "             ->collect( f |  "
                + "                 if(f.oclAsType(AbstractVariablesContainer).fragments->size() = 0) then "
                + "                     null "
                + "                 else "
                + "                     f.oclAsType(AbstractVariablesContainer).fragments "
                + "                 endif "
                + "             )->oclAsSet()->flatten())"
                + "         ->union(self.bodyDeclarations->select(e | not(e.oclIsTypeOf(FieldDeclaration)))) "
                + "         ->including(self.modifier) "
                + "         ->including(self.superClass) "
                + " else "
                + "     Set(ASTNode){} "
                + " endif "
                + "else "
                + " Set(ASTNode){} "
                + "endif";
    }
    
    public static String getTypeToUnitQuery() {
        return "if(not(self.originalCompilationUnit.oclIsUndefined())) then"
                + " let res : Set(ASTNode) = self.originalCompilationUnit.imports in "
                + "     res->union(self.originalCompilationUnit.comments)"
                + "     ->union(self.comments)"
                + "     ->union(self.commentsBeforeBody)"
                + "     ->union(self.commentsAfterBody)"
                + "else "
                + " Set(ASTNode){}"
                + "endif";
    }
    
    public static String getConnectedSegmentsQuery() {
        return "self.monitors"
                + " ->collect(segment1 | segment1.connectsTo"
                + "     ->select(segment2 | segment2.monitoredBy"
                + "         ->includes(self)))";
    }
    
    public static String getRouteSensorsQuery() {
        return "self.follows->collect( "
                + "    swP | swP.target->collect("
                + "        sw | sw.monitoredBy->select("
                + "            sensor | self.gathers->excludes(sensor)"
                + "        )"
                + "    )"
                + ")";
    }
    
    public static String getSemaphoreNeighborQuery() {
        return "self.exit->collect("
                + "    semaphore | self.gathers->collect("
                + "        sensor1 | sensor1.monitors->collect("
                + "            te1 | te1.connectsTo->collect("
                + "                te2 | te2.monitoredBy->collect("
                + "                    sensor2 | Route.allInstances()->select(route2 | route2.gathers->includes(sensor2) and route2.entry->excludes(semaphore) and self <> route2)"
                + "                )"
                + "            )"
                + "        )"
                + "    )"
                + ")";
    }
    
    public static String getSwitchSetQuery() {
        return "self.entry->select(signal = Signal::GO)->collect("
                + "    semaphore | self.follows->collect("
                + "        swP | swP.target->select(sw | sw.currentPosition <> swP.position)"
                + "    )"
                + ")";
    }
}
