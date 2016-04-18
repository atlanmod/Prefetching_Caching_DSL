package fr.inria.atlanmod.neoemf.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.atlanmod.neoemf.services.PrefetchingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPrefetchingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'use cache'", "'['", "'size'", "'chunk'", "']'", "'plan'", "'{'", "'}'", "'after'", "'rule'", "':'", "'on starting'", "'fetch'", "'on access'", "'remove'", "'type'", "'.'", "'*'", "'()'", "'LRU'", "'Predictive'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPrefetchingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPrefetchingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPrefetchingParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g"; }



     	private PrefetchingGrammarAccess grammarAccess;
     	
        public InternalPrefetchingParser(TokenStream input, PrefetchingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PrefetchingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_plans_1_0= rulePlan ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_metamodel_0_0 = null;

        EObject lv_plans_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:80:28: ( ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_plans_1_0= rulePlan ) )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:81:1: ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_plans_1_0= rulePlan ) )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:81:1: ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_plans_1_0= rulePlan ) )* )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:81:2: ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_plans_1_0= rulePlan ) )*
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:81:2: ( (lv_metamodel_0_0= ruleMetamodelImport ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:82:1: (lv_metamodel_0_0= ruleMetamodelImport )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:82:1: (lv_metamodel_0_0= ruleMetamodelImport )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:83:3: lv_metamodel_0_0= ruleMetamodelImport
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getMetamodelMetamodelImportParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMetamodelImport_in_ruleModel131);
            lv_metamodel_0_0=ruleMetamodelImport();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"metamodel",
                    		lv_metamodel_0_0, 
                    		"MetamodelImport");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:99:2: ( (lv_plans_1_0= rulePlan ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:100:1: (lv_plans_1_0= rulePlan )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:100:1: (lv_plans_1_0= rulePlan )
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:101:3: lv_plans_1_0= rulePlan
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlan_in_ruleModel152);
            	    lv_plans_1_0=rulePlan();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"plans",
            	            		lv_plans_1_0, 
            	            		"Plan");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMetamodelImport"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:125:1: entryRuleMetamodelImport returns [EObject current=null] : iv_ruleMetamodelImport= ruleMetamodelImport EOF ;
    public final EObject entryRuleMetamodelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelImport = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:126:2: (iv_ruleMetamodelImport= ruleMetamodelImport EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:127:2: iv_ruleMetamodelImport= ruleMetamodelImport EOF
            {
             newCompositeNode(grammarAccess.getMetamodelImportRule()); 
            pushFollow(FOLLOW_ruleMetamodelImport_in_entryRuleMetamodelImport189);
            iv_ruleMetamodelImport=ruleMetamodelImport();

            state._fsp--;

             current =iv_ruleMetamodelImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelImport199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelImport"


    // $ANTLR start "ruleMetamodelImport"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:134:1: ruleMetamodelImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nsURI_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:137:28: ( (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:138:1: (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:138:1: (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:138:3: otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMetamodelImport236); 

                	newLeafNode(otherlv_0, grammarAccess.getMetamodelImportAccess().getImportKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:142:1: ( (lv_nsURI_1_0= RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:143:1: (lv_nsURI_1_0= RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:143:1: (lv_nsURI_1_0= RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:144:3: lv_nsURI_1_0= RULE_STRING
            {
            lv_nsURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetamodelImport253); 

            			newLeafNode(lv_nsURI_1_0, grammarAccess.getMetamodelImportAccess().getNsURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nsURI",
                    		lv_nsURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelImport"


    // $ANTLR start "entryRuleCache"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:168:1: entryRuleCache returns [EObject current=null] : iv_ruleCache= ruleCache EOF ;
    public final EObject entryRuleCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCache = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:169:2: (iv_ruleCache= ruleCache EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:170:2: iv_ruleCache= ruleCache EOF
            {
             newCompositeNode(grammarAccess.getCacheRule()); 
            pushFollow(FOLLOW_ruleCache_in_entryRuleCache294);
            iv_ruleCache=ruleCache();

            state._fsp--;

             current =iv_ruleCache; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCache304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCache"


    // $ANTLR start "ruleCache"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:177:1: ruleCache returns [EObject current=null] : (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? ) ;
    public final EObject ruleCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:180:28: ( (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:181:1: (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:181:1: (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:181:3: otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleCache341); 

                	newLeafNode(otherlv_0, grammarAccess.getCacheAccess().getUseCacheKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:185:1: ( (lv_type_1_0= ruleCacheType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:186:1: (lv_type_1_0= ruleCacheType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:186:1: (lv_type_1_0= ruleCacheType )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:187:3: lv_type_1_0= ruleCacheType
            {
             
            	        newCompositeNode(grammarAccess.getCacheAccess().getTypeCacheTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCacheType_in_ruleCache362);
            lv_type_1_0=ruleCacheType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCacheRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"CacheType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:203:2: ( (lv_properties_2_0= ruleCacheProperties ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:204:1: (lv_properties_2_0= ruleCacheProperties )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:204:1: (lv_properties_2_0= ruleCacheProperties )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:205:3: lv_properties_2_0= ruleCacheProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getCacheAccess().getPropertiesCachePropertiesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCacheProperties_in_ruleCache383);
                    lv_properties_2_0=ruleCacheProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCacheRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_2_0, 
                            		"CacheProperties");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCache"


    // $ANTLR start "entryRuleCacheProperties"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:229:1: entryRuleCacheProperties returns [EObject current=null] : iv_ruleCacheProperties= ruleCacheProperties EOF ;
    public final EObject entryRuleCacheProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCacheProperties = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:230:2: (iv_ruleCacheProperties= ruleCacheProperties EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:231:2: iv_ruleCacheProperties= ruleCacheProperties EOF
            {
             newCompositeNode(grammarAccess.getCachePropertiesRule()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties420);
            iv_ruleCacheProperties=ruleCacheProperties();

            state._fsp--;

             current =iv_ruleCacheProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCacheProperties430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCacheProperties"


    // $ANTLR start "ruleCacheProperties"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:238:1: ruleCacheProperties returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) (otherlv_3= 'chunk' ( (lv_chunk_4_0= RULE_INT ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleCacheProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        Token lv_chunk_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:241:28: ( (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) (otherlv_3= 'chunk' ( (lv_chunk_4_0= RULE_INT ) ) )? otherlv_5= ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:242:1: (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) (otherlv_3= 'chunk' ( (lv_chunk_4_0= RULE_INT ) ) )? otherlv_5= ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:242:1: (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) (otherlv_3= 'chunk' ( (lv_chunk_4_0= RULE_INT ) ) )? otherlv_5= ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:242:3: otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) (otherlv_3= 'chunk' ( (lv_chunk_4_0= RULE_INT ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleCacheProperties467); 

                	newLeafNode(otherlv_0, grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCacheProperties479); 

                	newLeafNode(otherlv_1, grammarAccess.getCachePropertiesAccess().getSizeKeyword_1());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:250:1: ( (lv_size_2_0= RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:251:1: (lv_size_2_0= RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:251:1: (lv_size_2_0= RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:252:3: lv_size_2_0= RULE_INT
            {
            lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCacheProperties496); 

            			newLeafNode(lv_size_2_0, grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCachePropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_2_0, 
                    		"INT");
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:268:2: (otherlv_3= 'chunk' ( (lv_chunk_4_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:268:4: otherlv_3= 'chunk' ( (lv_chunk_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCacheProperties514); 

                        	newLeafNode(otherlv_3, grammarAccess.getCachePropertiesAccess().getChunkKeyword_3_0());
                        
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:272:1: ( (lv_chunk_4_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:273:1: (lv_chunk_4_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:273:1: (lv_chunk_4_0= RULE_INT )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:274:3: lv_chunk_4_0= RULE_INT
                    {
                    lv_chunk_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCacheProperties531); 

                    			newLeafNode(lv_chunk_4_0, grammarAccess.getCachePropertiesAccess().getChunkINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCachePropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"chunk",
                            		lv_chunk_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCacheProperties550); 

                	newLeafNode(otherlv_5, grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCacheProperties"


    // $ANTLR start "entryRulePlan"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:302:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:303:2: (iv_rulePlan= rulePlan EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:304:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan586);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan596); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:311:1: rulePlan returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( (lv_cache_4_0= ruleCache ) ) ( ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_after_2_0 = null;

        EObject lv_cache_4_0 = null;

        EObject lv_rules_5_1 = null;

        EObject lv_rules_5_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:314:28: ( (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( (lv_cache_4_0= ruleCache ) ) ( ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) ) )* otherlv_6= '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:315:1: (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( (lv_cache_4_0= ruleCache ) ) ( ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) ) )* otherlv_6= '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:315:1: (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( (lv_cache_4_0= ruleCache ) ) ( ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) ) )* otherlv_6= '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:315:3: otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( (lv_cache_4_0= ruleCache ) ) ( ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePlan633); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanAccess().getPlanKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:319:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:320:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:320:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:321:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlan650); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:337:2: ( (lv_after_2_0= ruleAfterClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:338:1: (lv_after_2_0= ruleAfterClause )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:338:1: (lv_after_2_0= ruleAfterClause )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:339:3: lv_after_2_0= ruleAfterClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlanAccess().getAfterAfterClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAfterClause_in_rulePlan676);
                    lv_after_2_0=ruleAfterClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlanRule());
                    	        }
                           		set(
                           			current, 
                           			"after",
                            		lv_after_2_0, 
                            		"AfterClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePlan689); 

                	newLeafNode(otherlv_3, grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:359:1: ( (lv_cache_4_0= ruleCache ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:360:1: (lv_cache_4_0= ruleCache )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:360:1: (lv_cache_4_0= ruleCache )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:361:3: lv_cache_4_0= ruleCache
            {
             
            	        newCompositeNode(grammarAccess.getPlanAccess().getCacheCacheParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleCache_in_rulePlan710);
            lv_cache_4_0=ruleCache();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	        }
                   		set(
                   			current, 
                   			"cache",
                    		lv_cache_4_0, 
                    		"Cache");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:377:2: ( ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:378:1: ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:378:1: ( (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule ) )
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:379:1: (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:379:1: (lv_rules_5_1= ruleStartingRule | lv_rules_5_2= ruleAccessRule )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==21) ) {
            	        int LA5_1 = input.LA(2);

            	        if ( (LA5_1==RULE_ID) ) {
            	            int LA5_2 = input.LA(3);

            	            if ( (LA5_2==22) ) {
            	                int LA5_3 = input.LA(4);

            	                if ( (LA5_3==25) ) {
            	                    alt5=2;
            	                }
            	                else if ( (LA5_3==23) ) {
            	                    alt5=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 5, 3, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 5, 2, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 5, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:380:3: lv_rules_5_1= ruleStartingRule
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPlanAccess().getRulesStartingRuleParserRuleCall_5_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStartingRule_in_rulePlan733);
            	            lv_rules_5_1=ruleStartingRule();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"rules",
            	                    		lv_rules_5_1, 
            	                    		"StartingRule");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:395:8: lv_rules_5_2= ruleAccessRule
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPlanAccess().getRulesAccessRuleParserRuleCall_5_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAccessRule_in_rulePlan752);
            	            lv_rules_5_2=ruleAccessRule();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"rules",
            	                    		lv_rules_5_2, 
            	                    		"AccessRule");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_rulePlan768); 

                	newLeafNode(otherlv_6, grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleAfterClause"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:425:1: entryRuleAfterClause returns [EObject current=null] : iv_ruleAfterClause= ruleAfterClause EOF ;
    public final EObject entryRuleAfterClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterClause = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:426:2: (iv_ruleAfterClause= ruleAfterClause EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:427:2: iv_ruleAfterClause= ruleAfterClause EOF
            {
             newCompositeNode(grammarAccess.getAfterClauseRule()); 
            pushFollow(FOLLOW_ruleAfterClause_in_entryRuleAfterClause804);
            iv_ruleAfterClause=ruleAfterClause();

            state._fsp--;

             current =iv_ruleAfterClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterClause814); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAfterClause"


    // $ANTLR start "ruleAfterClause"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:434:1: ruleAfterClause returns [EObject current=null] : (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAfterClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:437:28: ( (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:438:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:438:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:438:3: otherlv_0= 'after' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAfterClause851); 

                	newLeafNode(otherlv_0, grammarAccess.getAfterClauseAccess().getAfterKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:442:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:443:1: (otherlv_1= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:443:1: (otherlv_1= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:444:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAfterClauseRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAfterClause871); 

            		newLeafNode(otherlv_1, grammarAccess.getAfterClauseAccess().getPlanPlanCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAfterClause"


    // $ANTLR start "entryRuleStartingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:463:1: entryRuleStartingRule returns [EObject current=null] : iv_ruleStartingRule= ruleStartingRule EOF ;
    public final EObject entryRuleStartingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingRule = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:464:2: (iv_ruleStartingRule= ruleStartingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:465:2: iv_ruleStartingRule= ruleStartingRule EOF
            {
             newCompositeNode(grammarAccess.getStartingRuleRule()); 
            pushFollow(FOLLOW_ruleStartingRule_in_entryRuleStartingRule907);
            iv_ruleStartingRule=ruleStartingRule();

            state._fsp--;

             current =iv_ruleStartingRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartingRule917); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartingRule"


    // $ANTLR start "ruleStartingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:472:1: ruleStartingRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on starting' otherlv_4= 'fetch' ( (lv_targetPattern_5_0= ruleTargetPattern ) ) ) ;
    public final EObject ruleStartingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_targetPattern_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:475:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on starting' otherlv_4= 'fetch' ( (lv_targetPattern_5_0= ruleTargetPattern ) ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:476:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on starting' otherlv_4= 'fetch' ( (lv_targetPattern_5_0= ruleTargetPattern ) ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:476:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on starting' otherlv_4= 'fetch' ( (lv_targetPattern_5_0= ruleTargetPattern ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:476:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on starting' otherlv_4= 'fetch' ( (lv_targetPattern_5_0= ruleTargetPattern ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStartingRule954); 

                	newLeafNode(otherlv_0, grammarAccess.getStartingRuleAccess().getRuleKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:480:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:481:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:481:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:482:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartingRule971); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStartingRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStartingRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleStartingRule988); 

                	newLeafNode(otherlv_2, grammarAccess.getStartingRuleAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleStartingRule1000); 

                	newLeafNode(otherlv_3, grammarAccess.getStartingRuleAccess().getOnStartingKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleStartingRule1012); 

                	newLeafNode(otherlv_4, grammarAccess.getStartingRuleAccess().getFetchKeyword_4());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:510:1: ( (lv_targetPattern_5_0= ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:511:1: (lv_targetPattern_5_0= ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:511:1: (lv_targetPattern_5_0= ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:512:3: lv_targetPattern_5_0= ruleTargetPattern
            {
             
            	        newCompositeNode(grammarAccess.getStartingRuleAccess().getTargetPatternTargetPatternParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetPattern_in_ruleStartingRule1033);
            lv_targetPattern_5_0=ruleTargetPattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartingRuleRule());
            	        }
                   		set(
                   			current, 
                   			"targetPattern",
                    		lv_targetPattern_5_0, 
                    		"TargetPattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartingRule"


    // $ANTLR start "entryRuleAccessRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:536:1: entryRuleAccessRule returns [EObject current=null] : iv_ruleAccessRule= ruleAccessRule EOF ;
    public final EObject entryRuleAccessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessRule = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:537:2: (iv_ruleAccessRule= ruleAccessRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:538:2: iv_ruleAccessRule= ruleAccessRule EOF
            {
             newCompositeNode(grammarAccess.getAccessRuleRule()); 
            pushFollow(FOLLOW_ruleAccessRule_in_entryRuleAccessRule1069);
            iv_ruleAccessRule=ruleAccessRule();

            state._fsp--;

             current =iv_ruleAccessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessRule1079); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessRule"


    // $ANTLR start "ruleAccessRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:545:1: ruleAccessRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on access' ( (lv_sourcePattern_4_0= ruleSourcePattern ) )? otherlv_5= 'fetch' ( (lv_targetPattern_6_0= ruleTargetPattern ) ) (otherlv_7= 'remove' otherlv_8= 'type' ( (lv_removeType_9_0= ruleClassPatternExp ) ) )? ) ;
    public final EObject ruleAccessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_sourcePattern_4_0 = null;

        EObject lv_targetPattern_6_0 = null;

        AntlrDatatypeRuleToken lv_removeType_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:548:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on access' ( (lv_sourcePattern_4_0= ruleSourcePattern ) )? otherlv_5= 'fetch' ( (lv_targetPattern_6_0= ruleTargetPattern ) ) (otherlv_7= 'remove' otherlv_8= 'type' ( (lv_removeType_9_0= ruleClassPatternExp ) ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:549:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on access' ( (lv_sourcePattern_4_0= ruleSourcePattern ) )? otherlv_5= 'fetch' ( (lv_targetPattern_6_0= ruleTargetPattern ) ) (otherlv_7= 'remove' otherlv_8= 'type' ( (lv_removeType_9_0= ruleClassPatternExp ) ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:549:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on access' ( (lv_sourcePattern_4_0= ruleSourcePattern ) )? otherlv_5= 'fetch' ( (lv_targetPattern_6_0= ruleTargetPattern ) ) (otherlv_7= 'remove' otherlv_8= 'type' ( (lv_removeType_9_0= ruleClassPatternExp ) ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:549:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on access' ( (lv_sourcePattern_4_0= ruleSourcePattern ) )? otherlv_5= 'fetch' ( (lv_targetPattern_6_0= ruleTargetPattern ) ) (otherlv_7= 'remove' otherlv_8= 'type' ( (lv_removeType_9_0= ruleClassPatternExp ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAccessRule1116); 

                	newLeafNode(otherlv_0, grammarAccess.getAccessRuleAccess().getRuleKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:553:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:554:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:554:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:555:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessRule1133); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAccessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAccessRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAccessRule1150); 

                	newLeafNode(otherlv_2, grammarAccess.getAccessRuleAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAccessRule1162); 

                	newLeafNode(otherlv_3, grammarAccess.getAccessRuleAccess().getOnAccessKeyword_3());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:579:1: ( (lv_sourcePattern_4_0= ruleSourcePattern ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:580:1: (lv_sourcePattern_4_0= ruleSourcePattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:580:1: (lv_sourcePattern_4_0= ruleSourcePattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:581:3: lv_sourcePattern_4_0= ruleSourcePattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessRuleAccess().getSourcePatternSourcePatternParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSourcePattern_in_ruleAccessRule1183);
                    lv_sourcePattern_4_0=ruleSourcePattern();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccessRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"sourcePattern",
                            		lv_sourcePattern_4_0, 
                            		"SourcePattern");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleAccessRule1196); 

                	newLeafNode(otherlv_5, grammarAccess.getAccessRuleAccess().getFetchKeyword_5());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:601:1: ( (lv_targetPattern_6_0= ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:602:1: (lv_targetPattern_6_0= ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:602:1: (lv_targetPattern_6_0= ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:603:3: lv_targetPattern_6_0= ruleTargetPattern
            {
             
            	        newCompositeNode(grammarAccess.getAccessRuleAccess().getTargetPatternTargetPatternParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetPattern_in_ruleAccessRule1217);
            lv_targetPattern_6_0=ruleTargetPattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccessRuleRule());
            	        }
                   		set(
                   			current, 
                   			"targetPattern",
                    		lv_targetPattern_6_0, 
                    		"TargetPattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:619:2: (otherlv_7= 'remove' otherlv_8= 'type' ( (lv_removeType_9_0= ruleClassPatternExp ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:619:4: otherlv_7= 'remove' otherlv_8= 'type' ( (lv_removeType_9_0= ruleClassPatternExp ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleAccessRule1230); 

                        	newLeafNode(otherlv_7, grammarAccess.getAccessRuleAccess().getRemoveKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleAccessRule1242); 

                        	newLeafNode(otherlv_8, grammarAccess.getAccessRuleAccess().getTypeKeyword_7_1());
                        
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:627:1: ( (lv_removeType_9_0= ruleClassPatternExp ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:628:1: (lv_removeType_9_0= ruleClassPatternExp )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:628:1: (lv_removeType_9_0= ruleClassPatternExp )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:629:3: lv_removeType_9_0= ruleClassPatternExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessRuleAccess().getRemoveTypeClassPatternExpParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassPatternExp_in_ruleAccessRule1263);
                    lv_removeType_9_0=ruleClassPatternExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccessRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"removeType",
                            		lv_removeType_9_0, 
                            		"ClassPatternExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessRule"


    // $ANTLR start "entryRuleSourcePattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:653:1: entryRuleSourcePattern returns [EObject current=null] : iv_ruleSourcePattern= ruleSourcePattern EOF ;
    public final EObject entryRuleSourcePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourcePattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:654:2: (iv_ruleSourcePattern= ruleSourcePattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:655:2: iv_ruleSourcePattern= ruleSourcePattern EOF
            {
             newCompositeNode(grammarAccess.getSourcePatternRule()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern1301);
            iv_ruleSourcePattern=ruleSourcePattern();

            state._fsp--;

             current =iv_ruleSourcePattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourcePattern1311); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourcePattern"


    // $ANTLR start "ruleSourcePattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:662:1: ruleSourcePattern returns [EObject current=null] : (otherlv_0= 'type' ( (lv_pattern_1_0= ruleClassPatternExp ) ) ( (lv_filter_2_0= ruleFilterPattern ) )? ) ;
    public final EObject ruleSourcePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_pattern_1_0 = null;

        EObject lv_filter_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:665:28: ( (otherlv_0= 'type' ( (lv_pattern_1_0= ruleClassPatternExp ) ) ( (lv_filter_2_0= ruleFilterPattern ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:666:1: (otherlv_0= 'type' ( (lv_pattern_1_0= ruleClassPatternExp ) ) ( (lv_filter_2_0= ruleFilterPattern ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:666:1: (otherlv_0= 'type' ( (lv_pattern_1_0= ruleClassPatternExp ) ) ( (lv_filter_2_0= ruleFilterPattern ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:666:3: otherlv_0= 'type' ( (lv_pattern_1_0= ruleClassPatternExp ) ) ( (lv_filter_2_0= ruleFilterPattern ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSourcePattern1348); 

                	newLeafNode(otherlv_0, grammarAccess.getSourcePatternAccess().getTypeKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:670:1: ( (lv_pattern_1_0= ruleClassPatternExp ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:671:1: (lv_pattern_1_0= ruleClassPatternExp )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:671:1: (lv_pattern_1_0= ruleClassPatternExp )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:672:3: lv_pattern_1_0= ruleClassPatternExp
            {
             
            	        newCompositeNode(grammarAccess.getSourcePatternAccess().getPatternClassPatternExpParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassPatternExp_in_ruleSourcePattern1369);
            lv_pattern_1_0=ruleClassPatternExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourcePatternRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_1_0, 
                    		"ClassPatternExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:688:2: ( (lv_filter_2_0= ruleFilterPattern ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:689:1: (lv_filter_2_0= ruleFilterPattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:689:1: (lv_filter_2_0= ruleFilterPattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:690:3: lv_filter_2_0= ruleFilterPattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterPattern_in_ruleSourcePattern1390);
                    lv_filter_2_0=ruleFilterPattern();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSourcePatternRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_2_0, 
                            		"FilterPattern");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourcePattern"


    // $ANTLR start "entryRuleFilterPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:714:1: entryRuleFilterPattern returns [EObject current=null] : iv_ruleFilterPattern= ruleFilterPattern EOF ;
    public final EObject entryRuleFilterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterPattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:715:2: (iv_ruleFilterPattern= ruleFilterPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:716:2: iv_ruleFilterPattern= ruleFilterPattern EOF
            {
             newCompositeNode(grammarAccess.getFilterPatternRule()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern1427);
            iv_ruleFilterPattern=ruleFilterPattern();

            state._fsp--;

             current =iv_ruleFilterPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern1437); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterPattern"


    // $ANTLR start "ruleFilterPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:723:1: ruleFilterPattern returns [EObject current=null] : (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' ) ;
    public final EObject ruleFilterPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringPattern_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:726:28: ( (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:727:1: (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:727:1: (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:727:3: otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFilterPattern1474); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:731:1: ( (lv_stringPattern_1_0= RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:732:1: (lv_stringPattern_1_0= RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:732:1: (lv_stringPattern_1_0= RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:733:3: lv_stringPattern_1_0= RULE_STRING
            {
            lv_stringPattern_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFilterPattern1491); 

            			newLeafNode(lv_stringPattern_1_0, grammarAccess.getFilterPatternAccess().getStringPatternSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"stringPattern",
                    		lv_stringPattern_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFilterPattern1508); 

                	newLeafNode(otherlv_2, grammarAccess.getFilterPatternAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterPattern"


    // $ANTLR start "entryRuleTargetPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:761:1: entryRuleTargetPattern returns [EObject current=null] : iv_ruleTargetPattern= ruleTargetPattern EOF ;
    public final EObject entryRuleTargetPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:762:2: (iv_ruleTargetPattern= ruleTargetPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:763:2: iv_ruleTargetPattern= ruleTargetPattern EOF
            {
             newCompositeNode(grammarAccess.getTargetPatternRule()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern1544);
            iv_ruleTargetPattern=ruleTargetPattern();

            state._fsp--;

             current =iv_ruleTargetPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetPattern1554); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetPattern"


    // $ANTLR start "ruleTargetPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:770:1: ruleTargetPattern returns [EObject current=null] : ( (lv_pattern_0_0= rulePatternExp2 ) ) ;
    public final EObject ruleTargetPattern() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_pattern_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:773:28: ( ( (lv_pattern_0_0= rulePatternExp2 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:774:1: ( (lv_pattern_0_0= rulePatternExp2 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:774:1: ( (lv_pattern_0_0= rulePatternExp2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:775:1: (lv_pattern_0_0= rulePatternExp2 )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:775:1: (lv_pattern_0_0= rulePatternExp2 )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:776:3: lv_pattern_0_0= rulePatternExp2
            {
             
            	        newCompositeNode(grammarAccess.getTargetPatternAccess().getPatternPatternExp2ParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePatternExp2_in_ruleTargetPattern1599);
            lv_pattern_0_0=rulePatternExp2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetPatternRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_0_0, 
                    		"PatternExp2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetPattern"


    // $ANTLR start "entryRulePatternExp2"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:802:1: entryRulePatternExp2 returns [String current=null] : iv_rulePatternExp2= rulePatternExp2 EOF ;
    public final String entryRulePatternExp2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePatternExp2 = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:803:2: (iv_rulePatternExp2= rulePatternExp2 EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:804:2: iv_rulePatternExp2= rulePatternExp2 EOF
            {
             newCompositeNode(grammarAccess.getPatternExp2Rule()); 
            pushFollow(FOLLOW_rulePatternExp2_in_entryRulePatternExp21637);
            iv_rulePatternExp2=rulePatternExp2();

            state._fsp--;

             current =iv_rulePatternExp2.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternExp21648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternExp2"


    // $ANTLR start "rulePatternExp2"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:811:1: rulePatternExp2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) ) )* ) ;
    public final AntlrDatatypeRuleToken rulePatternExp2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:814:28: ( (this_ID_0= RULE_ID (kw= '.' ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) ) )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:815:1: (this_ID_0= RULE_ID (kw= '.' ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) ) )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:815:1: (this_ID_0= RULE_ID (kw= '.' ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) ) )* )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:815:6: this_ID_0= RULE_ID (kw= '.' ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternExp21688); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_0()); 
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:822:1: (kw= '.' ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:823:2: kw= '.' ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) )
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_rulePatternExp21707); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPatternExp2Access().getFullStopKeyword_1_0()); 
            	        
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:828:1: ( (this_ID_2= RULE_ID kw= '*' ) | (this_ID_4= RULE_ID (kw= '()' )? ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_ID) ) {
            	        int LA11_1 = input.LA(2);

            	        if ( (LA11_1==EOF||LA11_1==19||LA11_1==21||LA11_1==26||LA11_1==28||LA11_1==30) ) {
            	            alt11=2;
            	        }
            	        else if ( (LA11_1==29) ) {
            	            alt11=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:828:2: (this_ID_2= RULE_ID kw= '*' )
            	            {
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:828:2: (this_ID_2= RULE_ID kw= '*' )
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:828:7: this_ID_2= RULE_ID kw= '*'
            	            {
            	            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternExp21724); 

            	            		current.merge(this_ID_2);
            	                
            	             
            	                newLeafNode(this_ID_2, grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_1_1_0_0()); 
            	                
            	            kw=(Token)match(input,29,FOLLOW_29_in_rulePatternExp21742); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getPatternExp2Access().getAsteriskKeyword_1_1_0_1()); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:842:6: (this_ID_4= RULE_ID (kw= '()' )? )
            	            {
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:842:6: (this_ID_4= RULE_ID (kw= '()' )? )
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:842:11: this_ID_4= RULE_ID (kw= '()' )?
            	            {
            	            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternExp21765); 

            	            		current.merge(this_ID_4);
            	                
            	             
            	                newLeafNode(this_ID_4, grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_1_1_1_0()); 
            	                
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:849:1: (kw= '()' )?
            	            int alt10=2;
            	            int LA10_0 = input.LA(1);

            	            if ( (LA10_0==30) ) {
            	                alt10=1;
            	            }
            	            switch (alt10) {
            	                case 1 :
            	                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:850:2: kw= '()'
            	                    {
            	                    kw=(Token)match(input,30,FOLLOW_30_in_rulePatternExp21784); 

            	                            current.merge(kw);
            	                            newLeafNode(kw, grammarAccess.getPatternExp2Access().getLeftParenthesisRightParenthesisKeyword_1_1_1_1()); 
            	                        

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternExp2"


    // $ANTLR start "entryRuleClassPatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:863:1: entryRuleClassPatternExp returns [String current=null] : iv_ruleClassPatternExp= ruleClassPatternExp EOF ;
    public final String entryRuleClassPatternExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassPatternExp = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:864:2: (iv_ruleClassPatternExp= ruleClassPatternExp EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:865:2: iv_ruleClassPatternExp= ruleClassPatternExp EOF
            {
             newCompositeNode(grammarAccess.getClassPatternExpRule()); 
            pushFollow(FOLLOW_ruleClassPatternExp_in_entryRuleClassPatternExp1831);
            iv_ruleClassPatternExp=ruleClassPatternExp();

            state._fsp--;

             current =iv_ruleClassPatternExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassPatternExp1842); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassPatternExp"


    // $ANTLR start "ruleClassPatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:872:1: ruleClassPatternExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClassPatternExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:875:28: (this_ID_0= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:876:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassPatternExp1881); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getClassPatternExpAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassPatternExp"


    // $ANTLR start "ruleCacheType"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:893:1: ruleCacheType returns [Enumerator current=null] : ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) ) ;
    public final Enumerator ruleCacheType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:895:28: ( ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:896:1: ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:896:1: ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:896:2: (enumLiteral_0= 'LRU' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:896:2: (enumLiteral_0= 'LRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:896:4: enumLiteral_0= 'LRU'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleCacheType1941); 

                            current = grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:902:6: (enumLiteral_1= 'Predictive' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:902:6: (enumLiteral_1= 'Predictive' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:902:8: enumLiteral_1= 'Predictive'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleCacheType1958); 

                            current = grammarAccess.getCacheTypeAccess().getPREDICTIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCacheTypeAccess().getPREDICTIVEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCacheType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulePlan_in_ruleModel152 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_entryRuleMetamodelImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMetamodelImport236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelImport253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_entryRuleCache294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCache304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCache341 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleCacheType_in_ruleCache362 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_ruleCache383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCacheProperties430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCacheProperties467 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCacheProperties479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCacheProperties496 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCacheProperties514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCacheProperties531 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCacheProperties550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePlan633 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlan650 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ruleAfterClause_in_rulePlan676 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePlan689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleCache_in_rulePlan710 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_ruleStartingRule_in_rulePlan733 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_ruleAccessRule_in_rulePlan752 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_rulePlan768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterClause_in_entryRuleAfterClause804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterClause814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAfterClause851 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAfterClause871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartingRule_in_entryRuleStartingRule907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartingRule917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStartingRule954 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartingRule971 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStartingRule988 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStartingRule1000 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStartingRule1012 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_ruleStartingRule1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessRule_in_entryRuleAccessRule1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessRule1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAccessRule1116 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessRule1133 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAccessRule1150 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAccessRule1162 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_ruleAccessRule1183 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAccessRule1196 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_ruleAccessRule1217 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleAccessRule1230 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAccessRule1242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleClassPatternExp_in_ruleAccessRule1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern1301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourcePattern1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSourcePattern1348 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleClassPatternExp_in_ruleSourcePattern1369 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_ruleSourcePattern1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFilterPattern1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFilterPattern1491 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterPattern1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPattern1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp2_in_ruleTargetPattern1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp2_in_entryRulePatternExp21637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternExp21648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternExp21688 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rulePatternExp21707 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternExp21724 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePatternExp21742 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternExp21765 = new BitSet(new long[]{0x0000000050000002L});
    public static final BitSet FOLLOW_30_in_rulePatternExp21784 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleClassPatternExp_in_entryRuleClassPatternExp1831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassPatternExp1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassPatternExp1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCacheType1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCacheType1958 = new BitSet(new long[]{0x0000000000000002L});

}