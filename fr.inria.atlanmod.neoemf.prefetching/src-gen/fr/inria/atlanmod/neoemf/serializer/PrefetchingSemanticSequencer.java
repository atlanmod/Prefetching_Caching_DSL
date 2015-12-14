package fr.inria.atlanmod.neoemf.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
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
			case PrefetchingPackage.PREFETCHING_RULE:
				if(context == grammarAccess.getLoadingRuleRule()) {
					sequence_LoadingRule(context, (PrefetchingRule) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStartingRuleRule()) {
					sequence_StartingRule(context, (PrefetchingRule) semanticObject); 
					return; 
				}
				else break;
			case PrefetchingPackage.SOURCE_PATTERN:
				if(context == grammarAccess.getSourcePatternRule()) {
					sequence_SourcePattern(context, (SourcePattern) semanticObject); 
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
	 *     size=INT
	 */
	protected void sequence_CacheProperties(EObject context, CacheProperties semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.CACHE_PROPERTIES__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.CACHE_PROPERTIES__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_2_0(), semanticObject.getSize());
		feeder.finish();
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
	 *     (sourcePattern=SourcePattern? targetPattern=TargetPattern probability=INT? subRules+=LoadingRule*)
	 */
	protected void sequence_LoadingRule(EObject context, PrefetchingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (metamodel=MetamodelImport cache=Cache plans+=Plan*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID after=AfterClause? (rules+=StartingRule | rules+=LoadingRule)*)
	 */
	protected void sequence_Plan(EObject context, Plan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=PatternExp filter=FilterPattern?)
	 */
	protected void sequence_SourcePattern(EObject context, SourcePattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (targetPattern=TargetPattern probability=INT? subRules+=LoadingRule*)
	 */
	protected void sequence_StartingRule(EObject context, PrefetchingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=PatternExp filter=FilterPattern?)
	 */
	protected void sequence_TargetPattern(EObject context, TargetPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
