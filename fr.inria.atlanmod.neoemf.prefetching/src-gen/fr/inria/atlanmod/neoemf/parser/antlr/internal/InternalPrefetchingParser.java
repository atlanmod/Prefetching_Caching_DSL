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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'use cache'", "'['", "'size'", "']'", "'plan'", "'{'", "'}'", "'after'", "'on starting'", "'fetch'", "'%'", "'on loading'", "'.'", "'LRU'", "'Predictive'"
    };
    public static final int RULE_ID=6;
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
    public static final int T__19=19;
    public static final int RULE_STRING=4;
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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_cache_1_0= ruleCache ) ) ( (lv_plans_2_0= rulePlan ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_metamodel_0_0 = null;

        EObject lv_cache_1_0 = null;

        EObject lv_plans_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:80:28: ( ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_cache_1_0= ruleCache ) ) ( (lv_plans_2_0= rulePlan ) )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:81:1: ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_cache_1_0= ruleCache ) ) ( (lv_plans_2_0= rulePlan ) )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:81:1: ( ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_cache_1_0= ruleCache ) ) ( (lv_plans_2_0= rulePlan ) )* )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:81:2: ( (lv_metamodel_0_0= ruleMetamodelImport ) ) ( (lv_cache_1_0= ruleCache ) ) ( (lv_plans_2_0= rulePlan ) )*
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

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:99:2: ( (lv_cache_1_0= ruleCache ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:100:1: (lv_cache_1_0= ruleCache )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:100:1: (lv_cache_1_0= ruleCache )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:101:3: lv_cache_1_0= ruleCache
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getCacheCacheParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCache_in_ruleModel152);
            lv_cache_1_0=ruleCache();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"cache",
                    		lv_cache_1_0, 
                    		"Cache");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:117:2: ( (lv_plans_2_0= rulePlan ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:118:1: (lv_plans_2_0= rulePlan )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:118:1: (lv_plans_2_0= rulePlan )
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:119:3: lv_plans_2_0= rulePlan
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlan_in_ruleModel173);
            	    lv_plans_2_0=rulePlan();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"plans",
            	            		lv_plans_2_0, 
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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:143:1: entryRuleMetamodelImport returns [EObject current=null] : iv_ruleMetamodelImport= ruleMetamodelImport EOF ;
    public final EObject entryRuleMetamodelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelImport = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:144:2: (iv_ruleMetamodelImport= ruleMetamodelImport EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:145:2: iv_ruleMetamodelImport= ruleMetamodelImport EOF
            {
             newCompositeNode(grammarAccess.getMetamodelImportRule()); 
            pushFollow(FOLLOW_ruleMetamodelImport_in_entryRuleMetamodelImport210);
            iv_ruleMetamodelImport=ruleMetamodelImport();

            state._fsp--;

             current =iv_ruleMetamodelImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelImport220); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:152:1: ruleMetamodelImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nsURI_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:155:28: ( (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:156:1: (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:156:1: (otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:156:3: otherlv_0= 'import' ( (lv_nsURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMetamodelImport257); 

                	newLeafNode(otherlv_0, grammarAccess.getMetamodelImportAccess().getImportKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:160:1: ( (lv_nsURI_1_0= RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:161:1: (lv_nsURI_1_0= RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:161:1: (lv_nsURI_1_0= RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:162:3: lv_nsURI_1_0= RULE_STRING
            {
            lv_nsURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetamodelImport274); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:186:1: entryRuleCache returns [EObject current=null] : iv_ruleCache= ruleCache EOF ;
    public final EObject entryRuleCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCache = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:187:2: (iv_ruleCache= ruleCache EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:188:2: iv_ruleCache= ruleCache EOF
            {
             newCompositeNode(grammarAccess.getCacheRule()); 
            pushFollow(FOLLOW_ruleCache_in_entryRuleCache315);
            iv_ruleCache=ruleCache();

            state._fsp--;

             current =iv_ruleCache; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCache325); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:195:1: ruleCache returns [EObject current=null] : (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? ) ;
    public final EObject ruleCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:198:28: ( (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:199:1: (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:199:1: (otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:199:3: otherlv_0= 'use cache' ( (lv_type_1_0= ruleCacheType ) ) ( (lv_properties_2_0= ruleCacheProperties ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleCache362); 

                	newLeafNode(otherlv_0, grammarAccess.getCacheAccess().getUseCacheKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:203:1: ( (lv_type_1_0= ruleCacheType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:204:1: (lv_type_1_0= ruleCacheType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:204:1: (lv_type_1_0= ruleCacheType )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:205:3: lv_type_1_0= ruleCacheType
            {
             
            	        newCompositeNode(grammarAccess.getCacheAccess().getTypeCacheTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCacheType_in_ruleCache383);
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

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:221:2: ( (lv_properties_2_0= ruleCacheProperties ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:222:1: (lv_properties_2_0= ruleCacheProperties )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:222:1: (lv_properties_2_0= ruleCacheProperties )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:223:3: lv_properties_2_0= ruleCacheProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getCacheAccess().getPropertiesCachePropertiesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCacheProperties_in_ruleCache404);
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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:247:1: entryRuleCacheProperties returns [EObject current=null] : iv_ruleCacheProperties= ruleCacheProperties EOF ;
    public final EObject entryRuleCacheProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCacheProperties = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:248:2: (iv_ruleCacheProperties= ruleCacheProperties EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:249:2: iv_ruleCacheProperties= ruleCacheProperties EOF
            {
             newCompositeNode(grammarAccess.getCachePropertiesRule()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties441);
            iv_ruleCacheProperties=ruleCacheProperties();

            state._fsp--;

             current =iv_ruleCacheProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCacheProperties451); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:256:1: ruleCacheProperties returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' ) ;
    public final EObject ruleCacheProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:259:28: ( (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:260:1: (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:260:1: (otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:260:3: otherlv_0= '[' otherlv_1= 'size' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleCacheProperties488); 

                	newLeafNode(otherlv_0, grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCacheProperties500); 

                	newLeafNode(otherlv_1, grammarAccess.getCachePropertiesAccess().getSizeKeyword_1());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:268:1: ( (lv_size_2_0= RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:269:1: (lv_size_2_0= RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:269:1: (lv_size_2_0= RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:270:3: lv_size_2_0= RULE_INT
            {
            lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCacheProperties517); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCacheProperties534); 

                	newLeafNode(otherlv_3, grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_3());
                

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:298:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:299:2: (iv_rulePlan= rulePlan EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:300:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan570);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan580); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:307:1: rulePlan returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_after_2_0 = null;

        EObject lv_rules_4_1 = null;

        EObject lv_rules_4_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:310:28: ( (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) ) )* otherlv_5= '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:311:1: (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) ) )* otherlv_5= '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:311:1: (otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) ) )* otherlv_5= '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:311:3: otherlv_0= 'plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterClause ) )? otherlv_3= '{' ( ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePlan617); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanAccess().getPlanKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:315:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:316:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:316:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:317:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlan634); 

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

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:333:2: ( (lv_after_2_0= ruleAfterClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:334:1: (lv_after_2_0= ruleAfterClause )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:334:1: (lv_after_2_0= ruleAfterClause )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:335:3: lv_after_2_0= ruleAfterClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlanAccess().getAfterAfterClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAfterClause_in_rulePlan660);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePlan673); 

                	newLeafNode(otherlv_3, grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:355:1: ( ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:356:1: ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:356:1: ( (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule ) )
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:357:1: (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:357:1: (lv_rules_4_1= ruleStartingRule | lv_rules_4_2= ruleLoadingRule )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==20) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==23) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:358:3: lv_rules_4_1= ruleStartingRule
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPlanAccess().getRulesStartingRuleParserRuleCall_4_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStartingRule_in_rulePlan696);
            	            lv_rules_4_1=ruleStartingRule();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"rules",
            	                    		lv_rules_4_1, 
            	                    		"StartingRule");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:373:8: lv_rules_4_2= ruleLoadingRule
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPlanAccess().getRulesLoadingRuleParserRuleCall_4_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLoadingRule_in_rulePlan715);
            	            lv_rules_4_2=ruleLoadingRule();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"rules",
            	                    		lv_rules_4_2, 
            	                    		"LoadingRule");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePlan731); 

                	newLeafNode(otherlv_5, grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:403:1: entryRuleAfterClause returns [EObject current=null] : iv_ruleAfterClause= ruleAfterClause EOF ;
    public final EObject entryRuleAfterClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterClause = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:404:2: (iv_ruleAfterClause= ruleAfterClause EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:405:2: iv_ruleAfterClause= ruleAfterClause EOF
            {
             newCompositeNode(grammarAccess.getAfterClauseRule()); 
            pushFollow(FOLLOW_ruleAfterClause_in_entryRuleAfterClause767);
            iv_ruleAfterClause=ruleAfterClause();

            state._fsp--;

             current =iv_ruleAfterClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterClause777); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:412:1: ruleAfterClause returns [EObject current=null] : (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAfterClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:415:28: ( (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:416:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:416:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:416:3: otherlv_0= 'after' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAfterClause814); 

                	newLeafNode(otherlv_0, grammarAccess.getAfterClauseAccess().getAfterKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:420:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:421:1: (otherlv_1= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:421:1: (otherlv_1= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:422:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAfterClauseRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAfterClause834); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:441:1: entryRuleStartingRule returns [EObject current=null] : iv_ruleStartingRule= ruleStartingRule EOF ;
    public final EObject entryRuleStartingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingRule = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:442:2: (iv_ruleStartingRule= ruleStartingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:443:2: iv_ruleStartingRule= ruleStartingRule EOF
            {
             newCompositeNode(grammarAccess.getStartingRuleRule()); 
            pushFollow(FOLLOW_ruleStartingRule_in_entryRuleStartingRule870);
            iv_ruleStartingRule=ruleStartingRule();

            state._fsp--;

             current =iv_ruleStartingRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartingRule880); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:450:1: ruleStartingRule returns [EObject current=null] : (otherlv_0= 'on starting' otherlv_1= 'fetch' ( (lv_targetPattern_2_0= ruleTargetPattern ) ) ( ( (lv_probability_3_0= RULE_INT ) ) otherlv_4= '%' )? (otherlv_5= '{' ( (lv_subRules_6_0= ruleLoadingRule ) )* otherlv_7= '}' ) ) ;
    public final EObject ruleStartingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_probability_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_targetPattern_2_0 = null;

        EObject lv_subRules_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:453:28: ( (otherlv_0= 'on starting' otherlv_1= 'fetch' ( (lv_targetPattern_2_0= ruleTargetPattern ) ) ( ( (lv_probability_3_0= RULE_INT ) ) otherlv_4= '%' )? (otherlv_5= '{' ( (lv_subRules_6_0= ruleLoadingRule ) )* otherlv_7= '}' ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:454:1: (otherlv_0= 'on starting' otherlv_1= 'fetch' ( (lv_targetPattern_2_0= ruleTargetPattern ) ) ( ( (lv_probability_3_0= RULE_INT ) ) otherlv_4= '%' )? (otherlv_5= '{' ( (lv_subRules_6_0= ruleLoadingRule ) )* otherlv_7= '}' ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:454:1: (otherlv_0= 'on starting' otherlv_1= 'fetch' ( (lv_targetPattern_2_0= ruleTargetPattern ) ) ( ( (lv_probability_3_0= RULE_INT ) ) otherlv_4= '%' )? (otherlv_5= '{' ( (lv_subRules_6_0= ruleLoadingRule ) )* otherlv_7= '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:454:3: otherlv_0= 'on starting' otherlv_1= 'fetch' ( (lv_targetPattern_2_0= ruleTargetPattern ) ) ( ( (lv_probability_3_0= RULE_INT ) ) otherlv_4= '%' )? (otherlv_5= '{' ( (lv_subRules_6_0= ruleLoadingRule ) )* otherlv_7= '}' )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleStartingRule917); 

                	newLeafNode(otherlv_0, grammarAccess.getStartingRuleAccess().getOnStartingKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleStartingRule929); 

                	newLeafNode(otherlv_1, grammarAccess.getStartingRuleAccess().getFetchKeyword_1());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:462:1: ( (lv_targetPattern_2_0= ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:463:1: (lv_targetPattern_2_0= ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:463:1: (lv_targetPattern_2_0= ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:464:3: lv_targetPattern_2_0= ruleTargetPattern
            {
             
            	        newCompositeNode(grammarAccess.getStartingRuleAccess().getTargetPatternTargetPatternParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetPattern_in_ruleStartingRule950);
            lv_targetPattern_2_0=ruleTargetPattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartingRuleRule());
            	        }
                   		set(
                   			current, 
                   			"targetPattern",
                    		lv_targetPattern_2_0, 
                    		"TargetPattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:480:2: ( ( (lv_probability_3_0= RULE_INT ) ) otherlv_4= '%' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:480:3: ( (lv_probability_3_0= RULE_INT ) ) otherlv_4= '%'
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:480:3: ( (lv_probability_3_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:481:1: (lv_probability_3_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:481:1: (lv_probability_3_0= RULE_INT )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:482:3: lv_probability_3_0= RULE_INT
                    {
                    lv_probability_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStartingRule968); 

                    			newLeafNode(lv_probability_3_0, grammarAccess.getStartingRuleAccess().getProbabilityINTTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStartingRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"probability",
                            		lv_probability_3_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleStartingRule985); 

                        	newLeafNode(otherlv_4, grammarAccess.getStartingRuleAccess().getPercentSignKeyword_3_1());
                        

                    }
                    break;

            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:502:3: (otherlv_5= '{' ( (lv_subRules_6_0= ruleLoadingRule ) )* otherlv_7= '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:502:5: otherlv_5= '{' ( (lv_subRules_6_0= ruleLoadingRule ) )* otherlv_7= '}'
            {
            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleStartingRule1000); 

                	newLeafNode(otherlv_5, grammarAccess.getStartingRuleAccess().getLeftCurlyBracketKeyword_4_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:506:1: ( (lv_subRules_6_0= ruleLoadingRule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:507:1: (lv_subRules_6_0= ruleLoadingRule )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:507:1: (lv_subRules_6_0= ruleLoadingRule )
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:508:3: lv_subRules_6_0= ruleLoadingRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartingRuleAccess().getSubRulesLoadingRuleParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLoadingRule_in_ruleStartingRule1021);
            	    lv_subRules_6_0=ruleLoadingRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStartingRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subRules",
            	            		lv_subRules_6_0, 
            	            		"LoadingRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleStartingRule1034); 

                	newLeafNode(otherlv_7, grammarAccess.getStartingRuleAccess().getRightCurlyBracketKeyword_4_2());
                

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


    // $ANTLR start "entryRuleLoadingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:536:1: entryRuleLoadingRule returns [EObject current=null] : iv_ruleLoadingRule= ruleLoadingRule EOF ;
    public final EObject entryRuleLoadingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadingRule = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:537:2: (iv_ruleLoadingRule= ruleLoadingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:538:2: iv_ruleLoadingRule= ruleLoadingRule EOF
            {
             newCompositeNode(grammarAccess.getLoadingRuleRule()); 
            pushFollow(FOLLOW_ruleLoadingRule_in_entryRuleLoadingRule1071);
            iv_ruleLoadingRule=ruleLoadingRule();

            state._fsp--;

             current =iv_ruleLoadingRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadingRule1081); 

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
    // $ANTLR end "entryRuleLoadingRule"


    // $ANTLR start "ruleLoadingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:545:1: ruleLoadingRule returns [EObject current=null] : (otherlv_0= 'on loading' ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= ruleLoadingRule ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleLoadingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_probability_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sourcePattern_1_0 = null;

        EObject lv_targetPattern_3_0 = null;

        EObject lv_subRules_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:548:28: ( (otherlv_0= 'on loading' ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= ruleLoadingRule ) )* otherlv_8= '}' )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:549:1: (otherlv_0= 'on loading' ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= ruleLoadingRule ) )* otherlv_8= '}' )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:549:1: (otherlv_0= 'on loading' ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= ruleLoadingRule ) )* otherlv_8= '}' )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:549:3: otherlv_0= 'on loading' ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= ruleLoadingRule ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleLoadingRule1118); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadingRuleAccess().getOnLoadingKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:553:1: ( (lv_sourcePattern_1_0= ruleSourcePattern ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:554:1: (lv_sourcePattern_1_0= ruleSourcePattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:554:1: (lv_sourcePattern_1_0= ruleSourcePattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:555:3: lv_sourcePattern_1_0= ruleSourcePattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadingRuleAccess().getSourcePatternSourcePatternParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSourcePattern_in_ruleLoadingRule1139);
                    lv_sourcePattern_1_0=ruleSourcePattern();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadingRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"sourcePattern",
                            		lv_sourcePattern_1_0, 
                            		"SourcePattern");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleLoadingRule1152); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadingRuleAccess().getFetchKeyword_2());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:575:1: ( (lv_targetPattern_3_0= ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:576:1: (lv_targetPattern_3_0= ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:576:1: (lv_targetPattern_3_0= ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:577:3: lv_targetPattern_3_0= ruleTargetPattern
            {
             
            	        newCompositeNode(grammarAccess.getLoadingRuleAccess().getTargetPatternTargetPatternParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetPattern_in_ruleLoadingRule1173);
            lv_targetPattern_3_0=ruleTargetPattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadingRuleRule());
            	        }
                   		set(
                   			current, 
                   			"targetPattern",
                    		lv_targetPattern_3_0, 
                    		"TargetPattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:593:2: ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:593:3: ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%'
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:593:3: ( (lv_probability_4_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:594:1: (lv_probability_4_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:594:1: (lv_probability_4_0= RULE_INT )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:595:3: lv_probability_4_0= RULE_INT
                    {
                    lv_probability_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoadingRule1191); 

                    			newLeafNode(lv_probability_4_0, grammarAccess.getLoadingRuleAccess().getProbabilityINTTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoadingRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"probability",
                            		lv_probability_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleLoadingRule1208); 

                        	newLeafNode(otherlv_5, grammarAccess.getLoadingRuleAccess().getPercentSignKeyword_4_1());
                        

                    }
                    break;

            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:615:3: (otherlv_6= '{' ( (lv_subRules_7_0= ruleLoadingRule ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:615:5: otherlv_6= '{' ( (lv_subRules_7_0= ruleLoadingRule ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleLoadingRule1223); 

                        	newLeafNode(otherlv_6, grammarAccess.getLoadingRuleAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:619:1: ( (lv_subRules_7_0= ruleLoadingRule ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:620:1: (lv_subRules_7_0= ruleLoadingRule )
                    	    {
                    	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:620:1: (lv_subRules_7_0= ruleLoadingRule )
                    	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:621:3: lv_subRules_7_0= ruleLoadingRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLoadingRuleAccess().getSubRulesLoadingRuleParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLoadingRule_in_ruleLoadingRule1244);
                    	    lv_subRules_7_0=ruleLoadingRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLoadingRuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subRules",
                    	            		lv_subRules_7_0, 
                    	            		"LoadingRule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleLoadingRule1257); 

                        	newLeafNode(otherlv_8, grammarAccess.getLoadingRuleAccess().getRightCurlyBracketKeyword_5_2());
                        

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
    // $ANTLR end "ruleLoadingRule"


    // $ANTLR start "entryRuleSourcePattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:649:1: entryRuleSourcePattern returns [EObject current=null] : iv_ruleSourcePattern= ruleSourcePattern EOF ;
    public final EObject entryRuleSourcePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourcePattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:650:2: (iv_ruleSourcePattern= ruleSourcePattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:651:2: iv_ruleSourcePattern= ruleSourcePattern EOF
            {
             newCompositeNode(grammarAccess.getSourcePatternRule()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern1295);
            iv_ruleSourcePattern=ruleSourcePattern();

            state._fsp--;

             current =iv_ruleSourcePattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourcePattern1305); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:658:1: ruleSourcePattern returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) ;
    public final EObject ruleSourcePattern() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_pattern_0_0 = null;

        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:661:28: ( ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:662:1: ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:662:1: ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:662:2: ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )?
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:662:2: ( (lv_pattern_0_0= rulePatternExp ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:663:1: (lv_pattern_0_0= rulePatternExp )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:663:1: (lv_pattern_0_0= rulePatternExp )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:664:3: lv_pattern_0_0= rulePatternExp
            {
             
            	        newCompositeNode(grammarAccess.getSourcePatternAccess().getPatternPatternExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePatternExp_in_ruleSourcePattern1351);
            lv_pattern_0_0=rulePatternExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourcePatternRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_0_0, 
                    		"PatternExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:680:2: ( (lv_filter_1_0= ruleFilterPattern ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:681:1: (lv_filter_1_0= ruleFilterPattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:681:1: (lv_filter_1_0= ruleFilterPattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:682:3: lv_filter_1_0= ruleFilterPattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterPattern_in_ruleSourcePattern1372);
                    lv_filter_1_0=ruleFilterPattern();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSourcePatternRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_1_0, 
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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:706:1: entryRuleFilterPattern returns [EObject current=null] : iv_ruleFilterPattern= ruleFilterPattern EOF ;
    public final EObject entryRuleFilterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterPattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:707:2: (iv_ruleFilterPattern= ruleFilterPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:708:2: iv_ruleFilterPattern= ruleFilterPattern EOF
            {
             newCompositeNode(grammarAccess.getFilterPatternRule()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern1409);
            iv_ruleFilterPattern=ruleFilterPattern();

            state._fsp--;

             current =iv_ruleFilterPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern1419); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:715:1: ruleFilterPattern returns [EObject current=null] : (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' ) ;
    public final EObject ruleFilterPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringPattern_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:718:28: ( (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:719:1: (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:719:1: (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:719:3: otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFilterPattern1456); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:723:1: ( (lv_stringPattern_1_0= RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:724:1: (lv_stringPattern_1_0= RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:724:1: (lv_stringPattern_1_0= RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:725:3: lv_stringPattern_1_0= RULE_STRING
            {
            lv_stringPattern_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFilterPattern1473); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFilterPattern1490); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:753:1: entryRuleTargetPattern returns [EObject current=null] : iv_ruleTargetPattern= ruleTargetPattern EOF ;
    public final EObject entryRuleTargetPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:754:2: (iv_ruleTargetPattern= ruleTargetPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:755:2: iv_ruleTargetPattern= ruleTargetPattern EOF
            {
             newCompositeNode(grammarAccess.getTargetPatternRule()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern1526);
            iv_ruleTargetPattern=ruleTargetPattern();

            state._fsp--;

             current =iv_ruleTargetPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetPattern1536); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:762:1: ruleTargetPattern returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) ;
    public final EObject ruleTargetPattern() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_pattern_0_0 = null;

        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:765:28: ( ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:766:1: ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:766:1: ( ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:766:2: ( (lv_pattern_0_0= rulePatternExp ) ) ( (lv_filter_1_0= ruleFilterPattern ) )?
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:766:2: ( (lv_pattern_0_0= rulePatternExp ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:767:1: (lv_pattern_0_0= rulePatternExp )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:767:1: (lv_pattern_0_0= rulePatternExp )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:768:3: lv_pattern_0_0= rulePatternExp
            {
             
            	        newCompositeNode(grammarAccess.getTargetPatternAccess().getPatternPatternExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePatternExp_in_ruleTargetPattern1582);
            lv_pattern_0_0=rulePatternExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetPatternRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_0_0, 
                    		"PatternExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:784:2: ( (lv_filter_1_0= ruleFilterPattern ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:785:1: (lv_filter_1_0= ruleFilterPattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:785:1: (lv_filter_1_0= ruleFilterPattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:786:3: lv_filter_1_0= ruleFilterPattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getTargetPatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterPattern_in_ruleTargetPattern1603);
                    lv_filter_1_0=ruleFilterPattern();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTargetPatternRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_1_0, 
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
    // $ANTLR end "ruleTargetPattern"


    // $ANTLR start "entryRulePatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:810:1: entryRulePatternExp returns [String current=null] : iv_rulePatternExp= rulePatternExp EOF ;
    public final String entryRulePatternExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePatternExp = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:811:2: (iv_rulePatternExp= rulePatternExp EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:812:2: iv_rulePatternExp= rulePatternExp EOF
            {
             newCompositeNode(grammarAccess.getPatternExpRule()); 
            pushFollow(FOLLOW_rulePatternExp_in_entryRulePatternExp1641);
            iv_rulePatternExp=rulePatternExp();

            state._fsp--;

             current =iv_rulePatternExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternExp1652); 

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
    // $ANTLR end "entryRulePatternExp"


    // $ANTLR start "rulePatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:819:1: rulePatternExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePatternExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:822:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:823:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:823:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:823:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternExp1692); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPatternExpAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:830:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:831:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_rulePatternExp1711); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPatternExpAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternExp1726); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPatternExpAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "rulePatternExp"


    // $ANTLR start "ruleCacheType"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:853:1: ruleCacheType returns [Enumerator current=null] : ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) ) ;
    public final Enumerator ruleCacheType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:855:28: ( ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:856:1: ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:856:1: ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:856:2: (enumLiteral_0= 'LRU' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:856:2: (enumLiteral_0= 'LRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:856:4: enumLiteral_0= 'LRU'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleCacheType1789); 

                            current = grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:862:6: (enumLiteral_1= 'Predictive' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:862:6: (enumLiteral_1= 'Predictive' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:862:8: enumLiteral_1= 'Predictive'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleCacheType1806); 

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
    public static final BitSet FOLLOW_ruleMetamodelImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleCache_in_ruleModel152 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rulePlan_in_ruleModel173 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_entryRuleMetamodelImport210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelImport220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMetamodelImport257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_entryRuleCache315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCache325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCache362 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleCacheType_in_ruleCache383 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_ruleCache404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCacheProperties451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCacheProperties488 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCacheProperties500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCacheProperties517 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCacheProperties534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePlan617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlan634 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_ruleAfterClause_in_rulePlan660 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlan673 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_ruleStartingRule_in_rulePlan696 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_ruleLoadingRule_in_rulePlan715 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_18_in_rulePlan731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterClause_in_entryRuleAfterClause767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterClause777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAfterClause814 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAfterClause834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartingRule_in_entryRuleStartingRule870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartingRule880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStartingRule917 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStartingRule929 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_ruleStartingRule950 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStartingRule968 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStartingRule985 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStartingRule1000 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_ruleLoadingRule_in_ruleStartingRule1021 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_18_in_ruleStartingRule1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadingRule_in_entryRuleLoadingRule1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadingRule1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLoadingRule1118 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_ruleLoadingRule1139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLoadingRule1152 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_ruleLoadingRule1173 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoadingRule1191 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLoadingRule1208 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLoadingRule1223 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_ruleLoadingRule_in_ruleLoadingRule1244 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_18_in_ruleLoadingRule1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourcePattern1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp_in_ruleSourcePattern1351 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_ruleSourcePattern1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern1409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFilterPattern1456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFilterPattern1473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFilterPattern1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPattern1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp_in_ruleTargetPattern1582 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_ruleTargetPattern1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp_in_entryRulePatternExp1641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternExp1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternExp1692 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulePatternExp1711 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternExp1726 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25_in_ruleCacheType1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCacheType1806 = new BitSet(new long[]{0x0000000000000002L});

}