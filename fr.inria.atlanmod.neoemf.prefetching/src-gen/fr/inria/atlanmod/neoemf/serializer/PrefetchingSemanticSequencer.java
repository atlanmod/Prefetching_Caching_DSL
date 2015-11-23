package fr.inria.atlanmod.neoemf.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.atlanmod.neoemf.prefetching.AfterRule;
import fr.inria.atlanmod.neoemf.prefetching.Cache;
import fr.inria.atlanmod.neoemf.prefetching.CacheProperties;
import fr.inria.atlanmod.neoemf.prefetching.FilterPattern;
import fr.inria.atlanmod.neoemf.prefetching.Model;
import fr.inria.atlanmod.neoemf.prefetching.Plan;
import fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage;
import fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule;
import fr.inria.atlanmod.neoemf.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.TargetPattern;
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
			case PrefetchingPackage.AFTER_RULE:
				if(context == grammarAccess.getAfterRuleRule()) {
					sequence_AfterRule(context, (AfterRule) semanticObject); 
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
				if(context == grammarAccess.getPrefetchingRuleRule()) {
					sequence_PrefetchingRule(context, (PrefetchingRule) semanticObject); 
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
	 *     planId=[Plan|ID]
	 */
	protected void sequence_AfterRule(EObject context, AfterRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.AFTER_RULE__PLAN_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.AFTER_RULE__PLAN_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAfterRuleAccess().getPlanIdPlanIDTerminalRuleCall_1_0_1(), semanticObject.getPlanId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (refType=RefType size=INT)
	 */
	protected void sequence_CacheProperties(EObject context, CacheProperties semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.CACHE_PROPERTIES__REF_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.CACHE_PROPERTIES__REF_TYPE));
			if(transientValues.isValueTransient(semanticObject, PrefetchingPackage.Literals.CACHE_PROPERTIES__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrefetchingPackage.Literals.CACHE_PROPERTIES__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCachePropertiesAccess().getRefTypeRefTypeEnumRuleCall_2_0(), semanticObject.getRefType());
		feeder.accept(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_4_0(), semanticObject.getSize());
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
	 *     (cache=Cache plans+=Plan*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (planId=ID after=AfterRule? rules+=PrefetchingRule*)
	 */
	protected void sequence_Plan(EObject context, Plan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (moment=Moment sourcePattern=SourcePattern? targetPattern=TargetPattern probability=INT? subRules+=PrefetchingRule*)
	 */
	protected void sequence_PrefetchingRule(EObject context, PrefetchingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=QualifiedName filter=FilterPattern?)
	 */
	protected void sequence_SourcePattern(EObject context, SourcePattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=QualifiedName filter=FilterPattern?)
	 */
	protected void sequence_TargetPattern(EObject context, TargetPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
