package fr.inria.atlanmod.neoemf.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern;
import fr.inria.atlanmod.neoemf.services.PrefetchingGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PrefetchingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PrefetchingGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PrefetchingPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PrefetchingPackage.ACCESS_RULE:
				if(context == grammarAccess.getAccessRuleRule()) {
					sequence_AccessRule(context, (AccessRule) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.AFTER_CLAUSE:
				if(context == grammarAccess.getAfterClauseRule()) {
					sequence_AfterClause(context, (AfterClause) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.CACHE:
				if(context == grammarAccess.getCacheRule()) {
					sequence_Cache(context, (Cache) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.CACHE_PROPERTIES:
				if(context == grammarAccess.getCachePropertiesRule()) {
					sequence_CacheProperties(context, (CacheProperties) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.FILTER_PATTERN:
				if(context == grammarAccess.getFilterPatternRule()) {
					sequence_FilterPattern(context, (FilterPattern) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.METAMODEL_IMPORT:
				if(context == grammarAccess.getMetamodelImportRule()) {
					sequence_MetamodelImport(context, (MetamodelImport) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.PLAN:
				if(context == grammarAccess.getPlanRule()) {
					sequence_Plan(context, (Plan) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.SOURCE_PATTERN:
				if(context == grammarAccess.getSourcePatternRule()) {
					sequence_SourcePattern(context, (SourcePattern) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.STARTING_RULE:
				if(context == grammarAccess.getStartingRuleRule()) {
					sequence_StartingRule(context, (StartingRule) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.TARGET_PATTERN:
				if(context == grammarAccess.getTargetPatternRule()) {
					sequence_TargetPattern(context, (TargetPattern) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID sourcePattern=SourcePattern? targetPattern=TargetPattern removeType=ClassPatternExp?)
	 */
	protected void sequence_AccessRule(EObject context, AccessRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     plan=[Plan|ID]
	 */
	protected void sequence_AfterClause(EObject context, AfterClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.AFTER_CLAUSE__PLAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.AFTER_CLAUSE__PLAN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAfterClauseAccess().getPlanPlanIDTerminalRuleCall_1_0_1(), semanticObject.getPlan());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (size=INT chunk=INT?)
	 */
	protected void sequence_CacheProperties(EObject context, CacheProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=CacheType properties=CacheProperties?)
	 */
	protected void sequence_Cache(EObject context, Cache semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stringPattern=STRING
	 */
	protected void sequence_FilterPattern(EObject context, FilterPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.FILTER_PATTERN__STRING_PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.FILTER_PATTERN__STRING_PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterPatternAccess().getStringPatternSTRINGTerminalRuleCall_1_0(), semanticObject.getStringPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nsURI=STRING
	 */
	protected void sequence_MetamodelImport(EObject context, MetamodelImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.METAMODEL_IMPORT__NS_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.METAMODEL_IMPORT__NS_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetamodelImportAccess().getNsURISTRINGTerminalRuleCall_1_0(), semanticObject.getNsURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metamodel=MetamodelImport plans+=Plan*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID after=AfterClause? cache=Cache (rules+=StartingRule | rules+=AccessRule)*)
	 */
	protected void sequence_Plan(EObject context, Plan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=ClassPatternExp filter=FilterPattern?)
	 */
	protected void sequence_SourcePattern(EObject context, SourcePattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID targetPattern=TargetPattern)
	 */
	protected void sequence_StartingRule(EObject context, StartingRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.PREFETCHING_RULE__TARGET_PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.PREFETCHING_RULE__TARGET_PATTERN));
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.PREFETCHING_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.PREFETCHING_RULE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStartingRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStartingRuleAccess().getTargetPatternTargetPatternParserRuleCall_5_0(), semanticObject.getTargetPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pattern=PatternExp2
	 */
	protected void sequence_TargetPattern(EObject context, TargetPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
