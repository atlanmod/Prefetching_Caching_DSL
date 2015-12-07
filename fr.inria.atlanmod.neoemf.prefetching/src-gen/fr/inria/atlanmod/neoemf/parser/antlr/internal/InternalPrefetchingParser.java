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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'use cache'", "'['", "'type'", "'size'", "']'", "'plan'", "'{'", "'}'", "'after'", "'fetch'", "'%'", "'.'", "'LRU'", "'Predictive'", "'strong'", "'soft'", "'weak'", "'on starting'", "'on loading'"
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

                if ( (LA1_0==17) ) {
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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:256:1: ruleCacheProperties returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'type' ( (lv_refType_2_0= ruleRefType ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' ) ;
    public final EObject ruleCacheProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_size_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_refType_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:259:28: ( (otherlv_0= '[' otherlv_1= 'type' ( (lv_refType_2_0= ruleRefType ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:260:1: (otherlv_0= '[' otherlv_1= 'type' ( (lv_refType_2_0= ruleRefType ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:260:1: (otherlv_0= '[' otherlv_1= 'type' ( (lv_refType_2_0= ruleRefType ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:260:3: otherlv_0= '[' otherlv_1= 'type' ( (lv_refType_2_0= ruleRefType ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleCacheProperties488); 

                	newLeafNode(otherlv_0, grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCacheProperties500); 

                	newLeafNode(otherlv_1, grammarAccess.getCachePropertiesAccess().getTypeKeyword_1());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:268:1: ( (lv_refType_2_0= ruleRefType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:269:1: (lv_refType_2_0= ruleRefType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:269:1: (lv_refType_2_0= ruleRefType )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:270:3: lv_refType_2_0= ruleRefType
            {
             
            	        newCompositeNode(grammarAccess.getCachePropertiesAccess().getRefTypeRefTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefType_in_ruleCacheProperties521);
            lv_refType_2_0=ruleRefType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCachePropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"refType",
                    		lv_refType_2_0, 
                    		"RefType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCacheProperties533); 

                	newLeafNode(otherlv_3, grammarAccess.getCachePropertiesAccess().getSizeKeyword_3());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:290:1: ( (lv_size_4_0= RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:291:1: (lv_size_4_0= RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:291:1: (lv_size_4_0= RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:292:3: lv_size_4_0= RULE_INT
            {
            lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCacheProperties550); 

            			newLeafNode(lv_size_4_0, grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCachePropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCacheProperties567); 

                	newLeafNode(otherlv_5, grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_5());
                

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:320:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:321:2: (iv_rulePlan= rulePlan EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:322:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan603);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan613); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:329:1: rulePlan returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_planId_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterRule ) )? otherlv_3= '{' ( (lv_rules_4_0= rulePrefetchingRule ) )* otherlv_5= '}' ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_planId_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_after_2_0 = null;

        EObject lv_rules_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:332:28: ( (otherlv_0= 'plan' ( (lv_planId_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterRule ) )? otherlv_3= '{' ( (lv_rules_4_0= rulePrefetchingRule ) )* otherlv_5= '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:333:1: (otherlv_0= 'plan' ( (lv_planId_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterRule ) )? otherlv_3= '{' ( (lv_rules_4_0= rulePrefetchingRule ) )* otherlv_5= '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:333:1: (otherlv_0= 'plan' ( (lv_planId_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterRule ) )? otherlv_3= '{' ( (lv_rules_4_0= rulePrefetchingRule ) )* otherlv_5= '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:333:3: otherlv_0= 'plan' ( (lv_planId_1_0= RULE_ID ) ) ( (lv_after_2_0= ruleAfterRule ) )? otherlv_3= '{' ( (lv_rules_4_0= rulePrefetchingRule ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePlan650); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanAccess().getPlanKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:337:1: ( (lv_planId_1_0= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:338:1: (lv_planId_1_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:338:1: (lv_planId_1_0= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:339:3: lv_planId_1_0= RULE_ID
            {
            lv_planId_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlan667); 

            			newLeafNode(lv_planId_1_0, grammarAccess.getPlanAccess().getPlanIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"planId",
                    		lv_planId_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:355:2: ( (lv_after_2_0= ruleAfterRule ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:356:1: (lv_after_2_0= ruleAfterRule )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:356:1: (lv_after_2_0= ruleAfterRule )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:357:3: lv_after_2_0= ruleAfterRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlanAccess().getAfterAfterRuleParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAfterRule_in_rulePlan693);
                    lv_after_2_0=ruleAfterRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlanRule());
                    	        }
                           		set(
                           			current, 
                           			"after",
                            		lv_after_2_0, 
                            		"AfterRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePlan706); 

                	newLeafNode(otherlv_3, grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:377:1: ( (lv_rules_4_0= rulePrefetchingRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=29 && LA4_0<=30)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:378:1: (lv_rules_4_0= rulePrefetchingRule )
            	    {
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:378:1: (lv_rules_4_0= rulePrefetchingRule )
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:379:3: lv_rules_4_0= rulePrefetchingRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlanAccess().getRulesPrefetchingRuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrefetchingRule_in_rulePlan727);
            	    lv_rules_4_0=rulePrefetchingRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_4_0, 
            	            		"PrefetchingRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePlan740); 

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


    // $ANTLR start "entryRuleAfterRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:407:1: entryRuleAfterRule returns [EObject current=null] : iv_ruleAfterRule= ruleAfterRule EOF ;
    public final EObject entryRuleAfterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterRule = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:408:2: (iv_ruleAfterRule= ruleAfterRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:409:2: iv_ruleAfterRule= ruleAfterRule EOF
            {
             newCompositeNode(grammarAccess.getAfterRuleRule()); 
            pushFollow(FOLLOW_ruleAfterRule_in_entryRuleAfterRule776);
            iv_ruleAfterRule=ruleAfterRule();

            state._fsp--;

             current =iv_ruleAfterRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterRule786); 

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
    // $ANTLR end "entryRuleAfterRule"


    // $ANTLR start "ruleAfterRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:416:1: ruleAfterRule returns [EObject current=null] : (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAfterRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:419:28: ( (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:420:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:420:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:420:3: otherlv_0= 'after' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAfterRule823); 

                	newLeafNode(otherlv_0, grammarAccess.getAfterRuleAccess().getAfterKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:424:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:425:1: (otherlv_1= RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:425:1: (otherlv_1= RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:426:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAfterRuleRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAfterRule843); 

            		newLeafNode(otherlv_1, grammarAccess.getAfterRuleAccess().getPlanIdPlanCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleAfterRule"


    // $ANTLR start "entryRulePrefetchingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:445:1: entryRulePrefetchingRule returns [EObject current=null] : iv_rulePrefetchingRule= rulePrefetchingRule EOF ;
    public final EObject entryRulePrefetchingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefetchingRule = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:446:2: (iv_rulePrefetchingRule= rulePrefetchingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:447:2: iv_rulePrefetchingRule= rulePrefetchingRule EOF
            {
             newCompositeNode(grammarAccess.getPrefetchingRuleRule()); 
            pushFollow(FOLLOW_rulePrefetchingRule_in_entryRulePrefetchingRule879);
            iv_rulePrefetchingRule=rulePrefetchingRule();

            state._fsp--;

             current =iv_rulePrefetchingRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefetchingRule889); 

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
    // $ANTLR end "entryRulePrefetchingRule"


    // $ANTLR start "rulePrefetchingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:454:1: rulePrefetchingRule returns [EObject current=null] : ( ( (lv_moment_0_0= ruleMoment ) ) ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= rulePrefetchingRule ) )* otherlv_8= '}' )? ) ;
    public final EObject rulePrefetchingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_probability_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_moment_0_0 = null;

        EObject lv_sourcePattern_1_0 = null;

        EObject lv_targetPattern_3_0 = null;

        EObject lv_subRules_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:457:28: ( ( ( (lv_moment_0_0= ruleMoment ) ) ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= rulePrefetchingRule ) )* otherlv_8= '}' )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:458:1: ( ( (lv_moment_0_0= ruleMoment ) ) ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= rulePrefetchingRule ) )* otherlv_8= '}' )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:458:1: ( ( (lv_moment_0_0= ruleMoment ) ) ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= rulePrefetchingRule ) )* otherlv_8= '}' )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:458:2: ( (lv_moment_0_0= ruleMoment ) ) ( (lv_sourcePattern_1_0= ruleSourcePattern ) )? otherlv_2= 'fetch' ( (lv_targetPattern_3_0= ruleTargetPattern ) ) ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )? (otherlv_6= '{' ( (lv_subRules_7_0= rulePrefetchingRule ) )* otherlv_8= '}' )?
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:458:2: ( (lv_moment_0_0= ruleMoment ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:459:1: (lv_moment_0_0= ruleMoment )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:459:1: (lv_moment_0_0= ruleMoment )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:460:3: lv_moment_0_0= ruleMoment
            {
             
            	        newCompositeNode(grammarAccess.getPrefetchingRuleAccess().getMomentMomentEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMoment_in_rulePrefetchingRule935);
            lv_moment_0_0=ruleMoment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefetchingRuleRule());
            	        }
                   		set(
                   			current, 
                   			"moment",
                    		lv_moment_0_0, 
                    		"Moment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:476:2: ( (lv_sourcePattern_1_0= ruleSourcePattern ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:477:1: (lv_sourcePattern_1_0= ruleSourcePattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:477:1: (lv_sourcePattern_1_0= ruleSourcePattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:478:3: lv_sourcePattern_1_0= ruleSourcePattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrefetchingRuleAccess().getSourcePatternSourcePatternParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSourcePattern_in_rulePrefetchingRule956);
                    lv_sourcePattern_1_0=ruleSourcePattern();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrefetchingRuleRule());
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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePrefetchingRule969); 

                	newLeafNode(otherlv_2, grammarAccess.getPrefetchingRuleAccess().getFetchKeyword_2());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:498:1: ( (lv_targetPattern_3_0= ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:499:1: (lv_targetPattern_3_0= ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:499:1: (lv_targetPattern_3_0= ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:500:3: lv_targetPattern_3_0= ruleTargetPattern
            {
             
            	        newCompositeNode(grammarAccess.getPrefetchingRuleAccess().getTargetPatternTargetPatternParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetPattern_in_rulePrefetchingRule990);
            lv_targetPattern_3_0=ruleTargetPattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefetchingRuleRule());
            	        }
                   		set(
                   			current, 
                   			"targetPattern",
                    		lv_targetPattern_3_0, 
                    		"TargetPattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:516:2: ( ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:516:3: ( (lv_probability_4_0= RULE_INT ) ) otherlv_5= '%'
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:516:3: ( (lv_probability_4_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:517:1: (lv_probability_4_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:517:1: (lv_probability_4_0= RULE_INT )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:518:3: lv_probability_4_0= RULE_INT
                    {
                    lv_probability_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrefetchingRule1008); 

                    			newLeafNode(lv_probability_4_0, grammarAccess.getPrefetchingRuleAccess().getProbabilityINTTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrefetchingRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"probability",
                            		lv_probability_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulePrefetchingRule1025); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrefetchingRuleAccess().getPercentSignKeyword_4_1());
                        

                    }
                    break;

            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:538:3: (otherlv_6= '{' ( (lv_subRules_7_0= rulePrefetchingRule ) )* otherlv_8= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:538:5: otherlv_6= '{' ( (lv_subRules_7_0= rulePrefetchingRule ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePrefetchingRule1040); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrefetchingRuleAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:542:1: ( (lv_subRules_7_0= rulePrefetchingRule ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=29 && LA7_0<=30)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:543:1: (lv_subRules_7_0= rulePrefetchingRule )
                    	    {
                    	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:543:1: (lv_subRules_7_0= rulePrefetchingRule )
                    	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:544:3: lv_subRules_7_0= rulePrefetchingRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrefetchingRuleAccess().getSubRulesPrefetchingRuleParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrefetchingRule_in_rulePrefetchingRule1061);
                    	    lv_subRules_7_0=rulePrefetchingRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrefetchingRuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subRules",
                    	            		lv_subRules_7_0, 
                    	            		"PrefetchingRule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePrefetchingRule1074); 

                        	newLeafNode(otherlv_8, grammarAccess.getPrefetchingRuleAccess().getRightCurlyBracketKeyword_5_2());
                        

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
    // $ANTLR end "rulePrefetchingRule"


    // $ANTLR start "entryRuleSourcePattern"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:572:1: entryRuleSourcePattern returns [EObject current=null] : iv_ruleSourcePattern= ruleSourcePattern EOF ;
    public final EObject entryRuleSourcePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourcePattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:573:2: (iv_ruleSourcePattern= ruleSourcePattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:574:2: iv_ruleSourcePattern= ruleSourcePattern EOF
            {
             newCompositeNode(grammarAccess.getSourcePatternRule()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern1112);
            iv_ruleSourcePattern=ruleSourcePattern();

            state._fsp--;

             current =iv_ruleSourcePattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourcePattern1122); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:581:1: ruleSourcePattern returns [EObject current=null] : ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) ;
    public final EObject ruleSourcePattern() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_pattern_0_0 = null;

        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:584:28: ( ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:585:1: ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:585:1: ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:585:2: ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )?
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:585:2: ( (lv_pattern_0_0= ruleQualifiedName ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:586:1: (lv_pattern_0_0= ruleQualifiedName )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:586:1: (lv_pattern_0_0= ruleQualifiedName )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:587:3: lv_pattern_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSourcePatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSourcePattern1168);
            lv_pattern_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourcePatternRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:603:2: ( (lv_filter_1_0= ruleFilterPattern ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:604:1: (lv_filter_1_0= ruleFilterPattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:604:1: (lv_filter_1_0= ruleFilterPattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:605:3: lv_filter_1_0= ruleFilterPattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterPattern_in_ruleSourcePattern1189);
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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:629:1: entryRuleFilterPattern returns [EObject current=null] : iv_ruleFilterPattern= ruleFilterPattern EOF ;
    public final EObject entryRuleFilterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterPattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:630:2: (iv_ruleFilterPattern= ruleFilterPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:631:2: iv_ruleFilterPattern= ruleFilterPattern EOF
            {
             newCompositeNode(grammarAccess.getFilterPatternRule()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern1226);
            iv_ruleFilterPattern=ruleFilterPattern();

            state._fsp--;

             current =iv_ruleFilterPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern1236); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:638:1: ruleFilterPattern returns [EObject current=null] : (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' ) ;
    public final EObject ruleFilterPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringPattern_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:641:28: ( (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:642:1: (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:642:1: (otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:642:3: otherlv_0= '[' ( (lv_stringPattern_1_0= RULE_STRING ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFilterPattern1273); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:646:1: ( (lv_stringPattern_1_0= RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:647:1: (lv_stringPattern_1_0= RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:647:1: (lv_stringPattern_1_0= RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:648:3: lv_stringPattern_1_0= RULE_STRING
            {
            lv_stringPattern_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFilterPattern1290); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFilterPattern1307); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:676:1: entryRuleTargetPattern returns [EObject current=null] : iv_ruleTargetPattern= ruleTargetPattern EOF ;
    public final EObject entryRuleTargetPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPattern = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:677:2: (iv_ruleTargetPattern= ruleTargetPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:678:2: iv_ruleTargetPattern= ruleTargetPattern EOF
            {
             newCompositeNode(grammarAccess.getTargetPatternRule()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern1343);
            iv_ruleTargetPattern=ruleTargetPattern();

            state._fsp--;

             current =iv_ruleTargetPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetPattern1353); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:685:1: ruleTargetPattern returns [EObject current=null] : ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) ;
    public final EObject ruleTargetPattern() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_pattern_0_0 = null;

        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:688:28: ( ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:689:1: ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:689:1: ( ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )? )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:689:2: ( (lv_pattern_0_0= ruleQualifiedName ) ) ( (lv_filter_1_0= ruleFilterPattern ) )?
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:689:2: ( (lv_pattern_0_0= ruleQualifiedName ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:690:1: (lv_pattern_0_0= ruleQualifiedName )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:690:1: (lv_pattern_0_0= ruleQualifiedName )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:691:3: lv_pattern_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getTargetPatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTargetPattern1399);
            lv_pattern_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetPatternRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:707:2: ( (lv_filter_1_0= ruleFilterPattern ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:708:1: (lv_filter_1_0= ruleFilterPattern )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:708:1: (lv_filter_1_0= ruleFilterPattern )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:709:3: lv_filter_1_0= ruleFilterPattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getTargetPatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterPattern_in_ruleTargetPattern1420);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:733:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:734:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:735:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1458);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1469); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:742:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:745:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:746:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:746:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:746:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1509); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:753:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:754:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedName1528); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1543); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCacheType"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:774:1: ruleCacheType returns [Enumerator current=null] : ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) ) ;
    public final Enumerator ruleCacheType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:776:28: ( ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:777:1: ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:777:1: ( (enumLiteral_0= 'LRU' ) | (enumLiteral_1= 'Predictive' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:777:2: (enumLiteral_0= 'LRU' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:777:2: (enumLiteral_0= 'LRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:777:4: enumLiteral_0= 'LRU'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleCacheType1604); 

                            current = grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:783:6: (enumLiteral_1= 'Predictive' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:783:6: (enumLiteral_1= 'Predictive' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:783:8: enumLiteral_1= 'Predictive'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleCacheType1621); 

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


    // $ANTLR start "ruleRefType"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:793:1: ruleRefType returns [Enumerator current=null] : ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'soft' ) | (enumLiteral_2= 'weak' ) ) ;
    public final Enumerator ruleRefType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:795:28: ( ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'soft' ) | (enumLiteral_2= 'weak' ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:796:1: ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'soft' ) | (enumLiteral_2= 'weak' ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:796:1: ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'soft' ) | (enumLiteral_2= 'weak' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:796:2: (enumLiteral_0= 'strong' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:796:2: (enumLiteral_0= 'strong' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:796:4: enumLiteral_0= 'strong'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleRefType1666); 

                            current = grammarAccess.getRefTypeAccess().getSTRONGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRefTypeAccess().getSTRONGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:802:6: (enumLiteral_1= 'soft' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:802:6: (enumLiteral_1= 'soft' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:802:8: enumLiteral_1= 'soft'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleRefType1683); 

                            current = grammarAccess.getRefTypeAccess().getSOFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRefTypeAccess().getSOFTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:808:6: (enumLiteral_2= 'weak' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:808:6: (enumLiteral_2= 'weak' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:808:8: enumLiteral_2= 'weak'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleRefType1700); 

                            current = grammarAccess.getRefTypeAccess().getWEAKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRefTypeAccess().getWEAKEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleRefType"


    // $ANTLR start "ruleMoment"
    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:818:1: ruleMoment returns [Enumerator current=null] : ( (enumLiteral_0= 'on starting' ) | (enumLiteral_1= 'on loading' ) ) ;
    public final Enumerator ruleMoment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:820:28: ( ( (enumLiteral_0= 'on starting' ) | (enumLiteral_1= 'on loading' ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:821:1: ( (enumLiteral_0= 'on starting' ) | (enumLiteral_1= 'on loading' ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:821:1: ( (enumLiteral_0= 'on starting' ) | (enumLiteral_1= 'on loading' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:821:2: (enumLiteral_0= 'on starting' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:821:2: (enumLiteral_0= 'on starting' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:821:4: enumLiteral_0= 'on starting'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleMoment1745); 

                            current = grammarAccess.getMomentAccess().getON_STARTINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMomentAccess().getON_STARTINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:827:6: (enumLiteral_1= 'on loading' )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:827:6: (enumLiteral_1= 'on loading' )
                    // ../fr.inria.atlanmod.neoemf.prefetching/src-gen/fr/inria/atlanmod/neoemf/parser/antlr/internal/InternalPrefetching.g:827:8: enumLiteral_1= 'on loading'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleMoment1762); 

                            current = grammarAccess.getMomentAccess().getON_LOADINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMomentAccess().getON_LOADINGEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleMoment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleCache_in_ruleModel152 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulePlan_in_ruleModel173 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_entryRuleMetamodelImport210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelImport220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMetamodelImport257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_entryRuleCache315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCache325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCache362 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleCacheType_in_ruleCache383 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_ruleCache404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCacheProperties451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCacheProperties488 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCacheProperties500 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleRefType_in_ruleCacheProperties521 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCacheProperties533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCacheProperties550 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCacheProperties567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePlan650 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlan667 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ruleAfterRule_in_rulePlan693 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePlan706 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_rulePlan727 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_19_in_rulePlan740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterRule_in_entryRuleAfterRule776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterRule786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAfterRule823 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAfterRule843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_entryRulePrefetchingRule879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefetchingRule889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoment_in_rulePrefetchingRule935 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_rulePrefetchingRule956 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrefetchingRule969 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_rulePrefetchingRule990 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrefetchingRule1008 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePrefetchingRule1025 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rulePrefetchingRule1040 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_rulePrefetchingRule1061 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_19_in_rulePrefetchingRule1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourcePattern1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSourcePattern1168 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_ruleSourcePattern1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern1226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFilterPattern1273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFilterPattern1290 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterPattern1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPattern1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTargetPattern1399 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_ruleTargetPattern1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1509 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedName1528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1543 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24_in_ruleCacheType1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCacheType1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRefType1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRefType1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRefType1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMoment1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMoment1762 = new BitSet(new long[]{0x0000000000000002L});

}