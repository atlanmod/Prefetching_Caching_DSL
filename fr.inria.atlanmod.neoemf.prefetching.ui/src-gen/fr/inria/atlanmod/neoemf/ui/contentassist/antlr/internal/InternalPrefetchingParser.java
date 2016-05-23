package fr.inria.atlanmod.neoemf.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.inria.atlanmod.neoemf.services.PrefetchingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPrefetchingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LRU'", "'MRU'", "'import'", "'use cache'", "'['", "'size'", "']'", "'chunk'", "'plan'", "'{'", "'}'", "'after'", "'rule'", "':'", "'on starting'", "'fetch'", "'on access'", "'remove'", "'type'", "'.'", "'*'", "'()'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g"; }


     
     	private PrefetchingGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PrefetchingGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:61:1: ( ruleModel EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:76:1: ( rule__Model__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMetamodelImport"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:88:1: entryRuleMetamodelImport : ruleMetamodelImport EOF ;
    public final void entryRuleMetamodelImport() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:89:1: ( ruleMetamodelImport EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:90:1: ruleMetamodelImport EOF
            {
             before(grammarAccess.getMetamodelImportRule()); 
            pushFollow(FOLLOW_ruleMetamodelImport_in_entryRuleMetamodelImport121);
            ruleMetamodelImport();

            state._fsp--;

             after(grammarAccess.getMetamodelImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelImport"


    // $ANTLR start "ruleMetamodelImport"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:97:1: ruleMetamodelImport : ( ( rule__MetamodelImport__Group__0 ) ) ;
    public final void ruleMetamodelImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:101:2: ( ( ( rule__MetamodelImport__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:102:1: ( ( rule__MetamodelImport__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:102:1: ( ( rule__MetamodelImport__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:103:1: ( rule__MetamodelImport__Group__0 )
            {
             before(grammarAccess.getMetamodelImportAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:104:1: ( rule__MetamodelImport__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:104:2: rule__MetamodelImport__Group__0
            {
            pushFollow(FOLLOW_rule__MetamodelImport__Group__0_in_ruleMetamodelImport154);
            rule__MetamodelImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelImport"


    // $ANTLR start "entryRuleCache"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:116:1: entryRuleCache : ruleCache EOF ;
    public final void entryRuleCache() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:117:1: ( ruleCache EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:118:1: ruleCache EOF
            {
             before(grammarAccess.getCacheRule()); 
            pushFollow(FOLLOW_ruleCache_in_entryRuleCache181);
            ruleCache();

            state._fsp--;

             after(grammarAccess.getCacheRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCache188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCache"


    // $ANTLR start "ruleCache"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:125:1: ruleCache : ( ( rule__Cache__Group__0 ) ) ;
    public final void ruleCache() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:129:2: ( ( ( rule__Cache__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:130:1: ( ( rule__Cache__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:130:1: ( ( rule__Cache__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:131:1: ( rule__Cache__Group__0 )
            {
             before(grammarAccess.getCacheAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:132:1: ( rule__Cache__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:132:2: rule__Cache__Group__0
            {
            pushFollow(FOLLOW_rule__Cache__Group__0_in_ruleCache214);
            rule__Cache__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCacheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCache"


    // $ANTLR start "entryRuleCacheProperties"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:144:1: entryRuleCacheProperties : ruleCacheProperties EOF ;
    public final void entryRuleCacheProperties() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:145:1: ( ruleCacheProperties EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:146:1: ruleCacheProperties EOF
            {
             before(grammarAccess.getCachePropertiesRule()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties241);
            ruleCacheProperties();

            state._fsp--;

             after(grammarAccess.getCachePropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCacheProperties248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCacheProperties"


    // $ANTLR start "ruleCacheProperties"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:153:1: ruleCacheProperties : ( ( rule__CacheProperties__Group__0 ) ) ;
    public final void ruleCacheProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:157:2: ( ( ( rule__CacheProperties__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:158:1: ( ( rule__CacheProperties__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:158:1: ( ( rule__CacheProperties__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:159:1: ( rule__CacheProperties__Group__0 )
            {
             before(grammarAccess.getCachePropertiesAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:160:1: ( rule__CacheProperties__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:160:2: rule__CacheProperties__Group__0
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__0_in_ruleCacheProperties274);
            rule__CacheProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCachePropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCacheProperties"


    // $ANTLR start "entryRulePlan"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:172:1: entryRulePlan : rulePlan EOF ;
    public final void entryRulePlan() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:173:1: ( rulePlan EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:174:1: rulePlan EOF
            {
             before(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan301);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getPlanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:181:1: rulePlan : ( ( rule__Plan__Group__0 ) ) ;
    public final void rulePlan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:185:2: ( ( ( rule__Plan__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:186:1: ( ( rule__Plan__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:186:1: ( ( rule__Plan__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:187:1: ( rule__Plan__Group__0 )
            {
             before(grammarAccess.getPlanAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:188:1: ( rule__Plan__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:188:2: rule__Plan__Group__0
            {
            pushFollow(FOLLOW_rule__Plan__Group__0_in_rulePlan334);
            rule__Plan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleAfterClause"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:200:1: entryRuleAfterClause : ruleAfterClause EOF ;
    public final void entryRuleAfterClause() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:201:1: ( ruleAfterClause EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:202:1: ruleAfterClause EOF
            {
             before(grammarAccess.getAfterClauseRule()); 
            pushFollow(FOLLOW_ruleAfterClause_in_entryRuleAfterClause361);
            ruleAfterClause();

            state._fsp--;

             after(grammarAccess.getAfterClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterClause368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAfterClause"


    // $ANTLR start "ruleAfterClause"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:209:1: ruleAfterClause : ( ( rule__AfterClause__Group__0 ) ) ;
    public final void ruleAfterClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:213:2: ( ( ( rule__AfterClause__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:214:1: ( ( rule__AfterClause__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:214:1: ( ( rule__AfterClause__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:215:1: ( rule__AfterClause__Group__0 )
            {
             before(grammarAccess.getAfterClauseAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:216:1: ( rule__AfterClause__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:216:2: rule__AfterClause__Group__0
            {
            pushFollow(FOLLOW_rule__AfterClause__Group__0_in_ruleAfterClause394);
            rule__AfterClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfterClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAfterClause"


    // $ANTLR start "entryRuleStartingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:228:1: entryRuleStartingRule : ruleStartingRule EOF ;
    public final void entryRuleStartingRule() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:229:1: ( ruleStartingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:230:1: ruleStartingRule EOF
            {
             before(grammarAccess.getStartingRuleRule()); 
            pushFollow(FOLLOW_ruleStartingRule_in_entryRuleStartingRule421);
            ruleStartingRule();

            state._fsp--;

             after(grammarAccess.getStartingRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartingRule428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartingRule"


    // $ANTLR start "ruleStartingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:237:1: ruleStartingRule : ( ( rule__StartingRule__Group__0 ) ) ;
    public final void ruleStartingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:241:2: ( ( ( rule__StartingRule__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:242:1: ( ( rule__StartingRule__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:242:1: ( ( rule__StartingRule__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:243:1: ( rule__StartingRule__Group__0 )
            {
             before(grammarAccess.getStartingRuleAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:244:1: ( rule__StartingRule__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:244:2: rule__StartingRule__Group__0
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__0_in_ruleStartingRule454);
            rule__StartingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartingRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartingRule"


    // $ANTLR start "entryRuleAccessRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:256:1: entryRuleAccessRule : ruleAccessRule EOF ;
    public final void entryRuleAccessRule() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:257:1: ( ruleAccessRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:258:1: ruleAccessRule EOF
            {
             before(grammarAccess.getAccessRuleRule()); 
            pushFollow(FOLLOW_ruleAccessRule_in_entryRuleAccessRule481);
            ruleAccessRule();

            state._fsp--;

             after(grammarAccess.getAccessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessRule488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccessRule"


    // $ANTLR start "ruleAccessRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:265:1: ruleAccessRule : ( ( rule__AccessRule__Group__0 ) ) ;
    public final void ruleAccessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:269:2: ( ( ( rule__AccessRule__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__AccessRule__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__AccessRule__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:271:1: ( rule__AccessRule__Group__0 )
            {
             before(grammarAccess.getAccessRuleAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:1: ( rule__AccessRule__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:2: rule__AccessRule__Group__0
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__0_in_ruleAccessRule514);
            rule__AccessRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessRule"


    // $ANTLR start "entryRuleSourcePattern"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:284:1: entryRuleSourcePattern : ruleSourcePattern EOF ;
    public final void entryRuleSourcePattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:285:1: ( ruleSourcePattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:286:1: ruleSourcePattern EOF
            {
             before(grammarAccess.getSourcePatternRule()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern541);
            ruleSourcePattern();

            state._fsp--;

             after(grammarAccess.getSourcePatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourcePattern548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourcePattern"


    // $ANTLR start "ruleSourcePattern"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:293:1: ruleSourcePattern : ( ( rule__SourcePattern__Group__0 ) ) ;
    public final void ruleSourcePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:297:2: ( ( ( rule__SourcePattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:298:1: ( ( rule__SourcePattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:298:1: ( ( rule__SourcePattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:299:1: ( rule__SourcePattern__Group__0 )
            {
             before(grammarAccess.getSourcePatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:300:1: ( rule__SourcePattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:300:2: rule__SourcePattern__Group__0
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__0_in_ruleSourcePattern574);
            rule__SourcePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourcePatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourcePattern"


    // $ANTLR start "entryRuleFilterPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:312:1: entryRuleFilterPattern : ruleFilterPattern EOF ;
    public final void entryRuleFilterPattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:313:1: ( ruleFilterPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:314:1: ruleFilterPattern EOF
            {
             before(grammarAccess.getFilterPatternRule()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern601);
            ruleFilterPattern();

            state._fsp--;

             after(grammarAccess.getFilterPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterPattern"


    // $ANTLR start "ruleFilterPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:321:1: ruleFilterPattern : ( ( rule__FilterPattern__Group__0 ) ) ;
    public final void ruleFilterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:325:2: ( ( ( rule__FilterPattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:326:1: ( ( rule__FilterPattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:326:1: ( ( rule__FilterPattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:327:1: ( rule__FilterPattern__Group__0 )
            {
             before(grammarAccess.getFilterPatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:328:1: ( rule__FilterPattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:328:2: rule__FilterPattern__Group__0
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__0_in_ruleFilterPattern634);
            rule__FilterPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterPattern"


    // $ANTLR start "entryRuleTargetPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:340:1: entryRuleTargetPattern : ruleTargetPattern EOF ;
    public final void entryRuleTargetPattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:341:1: ( ruleTargetPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:342:1: ruleTargetPattern EOF
            {
             before(grammarAccess.getTargetPatternRule()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern661);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getTargetPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetPattern668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetPattern"


    // $ANTLR start "ruleTargetPattern"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:349:1: ruleTargetPattern : ( ( rule__TargetPattern__PatternAssignment ) ) ;
    public final void ruleTargetPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:353:2: ( ( ( rule__TargetPattern__PatternAssignment ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:354:1: ( ( rule__TargetPattern__PatternAssignment ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:354:1: ( ( rule__TargetPattern__PatternAssignment ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:355:1: ( rule__TargetPattern__PatternAssignment )
            {
             before(grammarAccess.getTargetPatternAccess().getPatternAssignment()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:356:1: ( rule__TargetPattern__PatternAssignment )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:356:2: rule__TargetPattern__PatternAssignment
            {
            pushFollow(FOLLOW_rule__TargetPattern__PatternAssignment_in_ruleTargetPattern694);
            rule__TargetPattern__PatternAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTargetPatternAccess().getPatternAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetPattern"


    // $ANTLR start "entryRulePatternExp2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:370:1: entryRulePatternExp2 : rulePatternExp2 EOF ;
    public final void entryRulePatternExp2() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:371:1: ( rulePatternExp2 EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:372:1: rulePatternExp2 EOF
            {
             before(grammarAccess.getPatternExp2Rule()); 
            pushFollow(FOLLOW_rulePatternExp2_in_entryRulePatternExp2723);
            rulePatternExp2();

            state._fsp--;

             after(grammarAccess.getPatternExp2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternExp2730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternExp2"


    // $ANTLR start "rulePatternExp2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:379:1: rulePatternExp2 : ( ( rule__PatternExp2__Group__0 ) ) ;
    public final void rulePatternExp2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:383:2: ( ( ( rule__PatternExp2__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:384:1: ( ( rule__PatternExp2__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:384:1: ( ( rule__PatternExp2__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:385:1: ( rule__PatternExp2__Group__0 )
            {
             before(grammarAccess.getPatternExp2Access().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:386:1: ( rule__PatternExp2__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:386:2: rule__PatternExp2__Group__0
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group__0_in_rulePatternExp2756);
            rule__PatternExp2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternExp2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternExp2"


    // $ANTLR start "entryRuleClassPatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:398:1: entryRuleClassPatternExp : ruleClassPatternExp EOF ;
    public final void entryRuleClassPatternExp() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:399:1: ( ruleClassPatternExp EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:400:1: ruleClassPatternExp EOF
            {
             before(grammarAccess.getClassPatternExpRule()); 
            pushFollow(FOLLOW_ruleClassPatternExp_in_entryRuleClassPatternExp783);
            ruleClassPatternExp();

            state._fsp--;

             after(grammarAccess.getClassPatternExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassPatternExp790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassPatternExp"


    // $ANTLR start "ruleClassPatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:407:1: ruleClassPatternExp : ( RULE_ID ) ;
    public final void ruleClassPatternExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:411:2: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:412:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:412:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:413:1: RULE_ID
            {
             before(grammarAccess.getClassPatternExpAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassPatternExp816); 
             after(grammarAccess.getClassPatternExpAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassPatternExp"


    // $ANTLR start "ruleCacheType"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:429:1: ruleCacheType : ( ( rule__CacheType__Alternatives ) ) ;
    public final void ruleCacheType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:433:1: ( ( ( rule__CacheType__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:434:1: ( ( rule__CacheType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:434:1: ( ( rule__CacheType__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:435:1: ( rule__CacheType__Alternatives )
            {
             before(grammarAccess.getCacheTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:436:1: ( rule__CacheType__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:436:2: rule__CacheType__Alternatives
            {
            pushFollow(FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType854);
            rule__CacheType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCacheTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCacheType"


    // $ANTLR start "rule__Plan__RulesAlternatives_5_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:449:1: rule__Plan__RulesAlternatives_5_0 : ( ( ruleStartingRule ) | ( ruleAccessRule ) );
    public final void rule__Plan__RulesAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:453:1: ( ( ruleStartingRule ) | ( ruleAccessRule ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==24) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==25) ) {
                            alt1=1;
                        }
                        else if ( (LA1_3==27) ) {
                            alt1=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:454:1: ( ruleStartingRule )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:454:1: ( ruleStartingRule )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:455:1: ruleStartingRule
                    {
                     before(grammarAccess.getPlanAccess().getRulesStartingRuleParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_ruleStartingRule_in_rule__Plan__RulesAlternatives_5_0891);
                    ruleStartingRule();

                    state._fsp--;

                     after(grammarAccess.getPlanAccess().getRulesStartingRuleParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:460:6: ( ruleAccessRule )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:460:6: ( ruleAccessRule )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:461:1: ruleAccessRule
                    {
                     before(grammarAccess.getPlanAccess().getRulesAccessRuleParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_ruleAccessRule_in_rule__Plan__RulesAlternatives_5_0908);
                    ruleAccessRule();

                    state._fsp--;

                     after(grammarAccess.getPlanAccess().getRulesAccessRuleParserRuleCall_5_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__RulesAlternatives_5_0"


    // $ANTLR start "rule__PatternExp2__Alternatives_1_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:471:1: rule__PatternExp2__Alternatives_1_1 : ( ( ( rule__PatternExp2__Group_1_1_0__0 ) ) | ( ( rule__PatternExp2__Group_1_1_1__0 ) ) );
    public final void rule__PatternExp2__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:475:1: ( ( ( rule__PatternExp2__Group_1_1_0__0 ) ) | ( ( rule__PatternExp2__Group_1_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==21||LA2_1==23||LA2_1==28||LA2_1==30||LA2_1==32) ) {
                    alt2=2;
                }
                else if ( (LA2_1==31) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:476:1: ( ( rule__PatternExp2__Group_1_1_0__0 ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:476:1: ( ( rule__PatternExp2__Group_1_1_0__0 ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:477:1: ( rule__PatternExp2__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getPatternExp2Access().getGroup_1_1_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:478:1: ( rule__PatternExp2__Group_1_1_0__0 )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:478:2: rule__PatternExp2__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_0__0_in_rule__PatternExp2__Alternatives_1_1940);
                    rule__PatternExp2__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternExp2Access().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:482:6: ( ( rule__PatternExp2__Group_1_1_1__0 ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:482:6: ( ( rule__PatternExp2__Group_1_1_1__0 ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:483:1: ( rule__PatternExp2__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getPatternExp2Access().getGroup_1_1_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:484:1: ( rule__PatternExp2__Group_1_1_1__0 )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:484:2: rule__PatternExp2__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_1__0_in_rule__PatternExp2__Alternatives_1_1958);
                    rule__PatternExp2__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternExp2Access().getGroup_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Alternatives_1_1"


    // $ANTLR start "rule__CacheType__Alternatives"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:493:1: rule__CacheType__Alternatives : ( ( ( 'LRU' ) ) | ( ( 'MRU' ) ) );
    public final void rule__CacheType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:497:1: ( ( ( 'LRU' ) ) | ( ( 'MRU' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:498:1: ( ( 'LRU' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:498:1: ( ( 'LRU' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:499:1: ( 'LRU' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:500:1: ( 'LRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:500:3: 'LRU'
                    {
                    match(input,11,FOLLOW_11_in_rule__CacheType__Alternatives992); 

                    }

                     after(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:505:6: ( ( 'MRU' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:505:6: ( ( 'MRU' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:506:1: ( 'MRU' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getMRUEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:507:1: ( 'MRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:507:3: 'MRU'
                    {
                    match(input,12,FOLLOW_12_in_rule__CacheType__Alternatives1013); 

                    }

                     after(grammarAccess.getCacheTypeAccess().getMRUEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:520:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:524:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:525:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01047);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01050);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:532:1: rule__Model__Group__0__Impl : ( ( rule__Model__MetamodelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:536:1: ( ( ( rule__Model__MetamodelAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:537:1: ( ( rule__Model__MetamodelAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:537:1: ( ( rule__Model__MetamodelAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:538:1: ( rule__Model__MetamodelAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:539:1: ( rule__Model__MetamodelAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:539:2: rule__Model__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_0_in_rule__Model__Group__0__Impl1077);
            rule__Model__MetamodelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMetamodelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:549:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:553:1: ( rule__Model__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:554:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11107);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:560:1: rule__Model__Group__1__Impl : ( ( rule__Model__PlansAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:564:1: ( ( ( rule__Model__PlansAssignment_1 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:565:1: ( ( rule__Model__PlansAssignment_1 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:565:1: ( ( rule__Model__PlansAssignment_1 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:566:1: ( rule__Model__PlansAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPlansAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:567:1: ( rule__Model__PlansAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:567:2: rule__Model__PlansAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__PlansAssignment_1_in_rule__Model__Group__1__Impl1134);
            	    rule__Model__PlansAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPlansAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__MetamodelImport__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:581:1: rule__MetamodelImport__Group__0 : rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1 ;
    public final void rule__MetamodelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:585:1: ( rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:586:2: rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelImport__Group__0__Impl_in_rule__MetamodelImport__Group__01169);
            rule__MetamodelImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelImport__Group__1_in_rule__MetamodelImport__Group__01172);
            rule__MetamodelImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelImport__Group__0"


    // $ANTLR start "rule__MetamodelImport__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:593:1: rule__MetamodelImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__MetamodelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:597:1: ( ( 'import' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:598:1: ( 'import' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:598:1: ( 'import' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:599:1: 'import'
            {
             before(grammarAccess.getMetamodelImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__MetamodelImport__Group__0__Impl1200); 
             after(grammarAccess.getMetamodelImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelImport__Group__0__Impl"


    // $ANTLR start "rule__MetamodelImport__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:612:1: rule__MetamodelImport__Group__1 : rule__MetamodelImport__Group__1__Impl ;
    public final void rule__MetamodelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:616:1: ( rule__MetamodelImport__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:617:2: rule__MetamodelImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelImport__Group__1__Impl_in_rule__MetamodelImport__Group__11231);
            rule__MetamodelImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelImport__Group__1"


    // $ANTLR start "rule__MetamodelImport__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:623:1: rule__MetamodelImport__Group__1__Impl : ( ( rule__MetamodelImport__NsURIAssignment_1 ) ) ;
    public final void rule__MetamodelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:627:1: ( ( ( rule__MetamodelImport__NsURIAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:628:1: ( ( rule__MetamodelImport__NsURIAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:628:1: ( ( rule__MetamodelImport__NsURIAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:629:1: ( rule__MetamodelImport__NsURIAssignment_1 )
            {
             before(grammarAccess.getMetamodelImportAccess().getNsURIAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:630:1: ( rule__MetamodelImport__NsURIAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:630:2: rule__MetamodelImport__NsURIAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelImport__NsURIAssignment_1_in_rule__MetamodelImport__Group__1__Impl1258);
            rule__MetamodelImport__NsURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelImportAccess().getNsURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelImport__Group__1__Impl"


    // $ANTLR start "rule__Cache__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:644:1: rule__Cache__Group__0 : rule__Cache__Group__0__Impl rule__Cache__Group__1 ;
    public final void rule__Cache__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:648:1: ( rule__Cache__Group__0__Impl rule__Cache__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:649:2: rule__Cache__Group__0__Impl rule__Cache__Group__1
            {
            pushFollow(FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01292);
            rule__Cache__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01295);
            rule__Cache__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__Group__0"


    // $ANTLR start "rule__Cache__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:656:1: rule__Cache__Group__0__Impl : ( 'use cache' ) ;
    public final void rule__Cache__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:660:1: ( ( 'use cache' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:661:1: ( 'use cache' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:661:1: ( 'use cache' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:662:1: 'use cache'
            {
             before(grammarAccess.getCacheAccess().getUseCacheKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Cache__Group__0__Impl1323); 
             after(grammarAccess.getCacheAccess().getUseCacheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__Group__0__Impl"


    // $ANTLR start "rule__Cache__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:675:1: rule__Cache__Group__1 : rule__Cache__Group__1__Impl rule__Cache__Group__2 ;
    public final void rule__Cache__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:679:1: ( rule__Cache__Group__1__Impl rule__Cache__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:680:2: rule__Cache__Group__1__Impl rule__Cache__Group__2
            {
            pushFollow(FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11354);
            rule__Cache__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11357);
            rule__Cache__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__Group__1"


    // $ANTLR start "rule__Cache__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:687:1: rule__Cache__Group__1__Impl : ( ( rule__Cache__TypeAssignment_1 ) ) ;
    public final void rule__Cache__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:691:1: ( ( ( rule__Cache__TypeAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:692:1: ( ( rule__Cache__TypeAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:692:1: ( ( rule__Cache__TypeAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:693:1: ( rule__Cache__TypeAssignment_1 )
            {
             before(grammarAccess.getCacheAccess().getTypeAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:694:1: ( rule__Cache__TypeAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:694:2: rule__Cache__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1384);
            rule__Cache__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCacheAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__Group__1__Impl"


    // $ANTLR start "rule__Cache__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:704:1: rule__Cache__Group__2 : rule__Cache__Group__2__Impl ;
    public final void rule__Cache__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:708:1: ( rule__Cache__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:709:2: rule__Cache__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21414);
            rule__Cache__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__Group__2"


    // $ANTLR start "rule__Cache__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:715:1: rule__Cache__Group__2__Impl : ( ( rule__Cache__PropertiesAssignment_2 )? ) ;
    public final void rule__Cache__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:719:1: ( ( ( rule__Cache__PropertiesAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:720:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:720:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:721:1: ( rule__Cache__PropertiesAssignment_2 )?
            {
             before(grammarAccess.getCacheAccess().getPropertiesAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:722:1: ( rule__Cache__PropertiesAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:722:2: rule__Cache__PropertiesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1441);
                    rule__Cache__PropertiesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCacheAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__Group__2__Impl"


    // $ANTLR start "rule__CacheProperties__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:738:1: rule__CacheProperties__Group__0 : rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 ;
    public final void rule__CacheProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:742:1: ( rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:743:2: rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01478);
            rule__CacheProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01481);
            rule__CacheProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__0"


    // $ANTLR start "rule__CacheProperties__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:750:1: rule__CacheProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__CacheProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:754:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:755:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:755:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:756:1: '['
            {
             before(grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__CacheProperties__Group__0__Impl1509); 
             after(grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__0__Impl"


    // $ANTLR start "rule__CacheProperties__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:769:1: rule__CacheProperties__Group__1 : rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 ;
    public final void rule__CacheProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:773:1: ( rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:774:2: rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11540);
            rule__CacheProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11543);
            rule__CacheProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__1"


    // $ANTLR start "rule__CacheProperties__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:781:1: rule__CacheProperties__Group__1__Impl : ( 'size' ) ;
    public final void rule__CacheProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:785:1: ( ( 'size' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:786:1: ( 'size' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:786:1: ( 'size' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:787:1: 'size'
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__CacheProperties__Group__1__Impl1571); 
             after(grammarAccess.getCachePropertiesAccess().getSizeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__1__Impl"


    // $ANTLR start "rule__CacheProperties__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:800:1: rule__CacheProperties__Group__2 : rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 ;
    public final void rule__CacheProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:804:1: ( rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:805:2: rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21602);
            rule__CacheProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21605);
            rule__CacheProperties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__2"


    // $ANTLR start "rule__CacheProperties__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:812:1: rule__CacheProperties__Group__2__Impl : ( ( rule__CacheProperties__SizeAssignment_2 ) ) ;
    public final void rule__CacheProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:816:1: ( ( ( rule__CacheProperties__SizeAssignment_2 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:817:1: ( ( rule__CacheProperties__SizeAssignment_2 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:817:1: ( ( rule__CacheProperties__SizeAssignment_2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:818:1: ( rule__CacheProperties__SizeAssignment_2 )
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:819:1: ( rule__CacheProperties__SizeAssignment_2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:819:2: rule__CacheProperties__SizeAssignment_2
            {
            pushFollow(FOLLOW_rule__CacheProperties__SizeAssignment_2_in_rule__CacheProperties__Group__2__Impl1632);
            rule__CacheProperties__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCachePropertiesAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__2__Impl"


    // $ANTLR start "rule__CacheProperties__Group__3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:829:1: rule__CacheProperties__Group__3 : rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4 ;
    public final void rule__CacheProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:833:1: ( rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:834:2: rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31662);
            rule__CacheProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__4_in_rule__CacheProperties__Group__31665);
            rule__CacheProperties__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__3"


    // $ANTLR start "rule__CacheProperties__Group__3__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:841:1: rule__CacheProperties__Group__3__Impl : ( ( rule__CacheProperties__Group_3__0 )? ) ;
    public final void rule__CacheProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:845:1: ( ( ( rule__CacheProperties__Group_3__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:846:1: ( ( rule__CacheProperties__Group_3__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:846:1: ( ( rule__CacheProperties__Group_3__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:847:1: ( rule__CacheProperties__Group_3__0 )?
            {
             before(grammarAccess.getCachePropertiesAccess().getGroup_3()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:848:1: ( rule__CacheProperties__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:848:2: rule__CacheProperties__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CacheProperties__Group_3__0_in_rule__CacheProperties__Group__3__Impl1692);
                    rule__CacheProperties__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCachePropertiesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__3__Impl"


    // $ANTLR start "rule__CacheProperties__Group__4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:858:1: rule__CacheProperties__Group__4 : rule__CacheProperties__Group__4__Impl ;
    public final void rule__CacheProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:862:1: ( rule__CacheProperties__Group__4__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:863:2: rule__CacheProperties__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__4__Impl_in_rule__CacheProperties__Group__41723);
            rule__CacheProperties__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__4"


    // $ANTLR start "rule__CacheProperties__Group__4__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:869:1: rule__CacheProperties__Group__4__Impl : ( ']' ) ;
    public final void rule__CacheProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:873:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:874:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:874:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:875:1: ']'
            {
             before(grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__CacheProperties__Group__4__Impl1751); 
             after(grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group__4__Impl"


    // $ANTLR start "rule__CacheProperties__Group_3__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:898:1: rule__CacheProperties__Group_3__0 : rule__CacheProperties__Group_3__0__Impl rule__CacheProperties__Group_3__1 ;
    public final void rule__CacheProperties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:902:1: ( rule__CacheProperties__Group_3__0__Impl rule__CacheProperties__Group_3__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:903:2: rule__CacheProperties__Group_3__0__Impl rule__CacheProperties__Group_3__1
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group_3__0__Impl_in_rule__CacheProperties__Group_3__01792);
            rule__CacheProperties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group_3__1_in_rule__CacheProperties__Group_3__01795);
            rule__CacheProperties__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group_3__0"


    // $ANTLR start "rule__CacheProperties__Group_3__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:910:1: rule__CacheProperties__Group_3__0__Impl : ( 'chunk' ) ;
    public final void rule__CacheProperties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:914:1: ( ( 'chunk' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:915:1: ( 'chunk' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:915:1: ( 'chunk' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:916:1: 'chunk'
            {
             before(grammarAccess.getCachePropertiesAccess().getChunkKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__CacheProperties__Group_3__0__Impl1823); 
             after(grammarAccess.getCachePropertiesAccess().getChunkKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group_3__0__Impl"


    // $ANTLR start "rule__CacheProperties__Group_3__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:929:1: rule__CacheProperties__Group_3__1 : rule__CacheProperties__Group_3__1__Impl ;
    public final void rule__CacheProperties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:933:1: ( rule__CacheProperties__Group_3__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:934:2: rule__CacheProperties__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group_3__1__Impl_in_rule__CacheProperties__Group_3__11854);
            rule__CacheProperties__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group_3__1"


    // $ANTLR start "rule__CacheProperties__Group_3__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:940:1: rule__CacheProperties__Group_3__1__Impl : ( ( rule__CacheProperties__ChunkAssignment_3_1 ) ) ;
    public final void rule__CacheProperties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:944:1: ( ( ( rule__CacheProperties__ChunkAssignment_3_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:945:1: ( ( rule__CacheProperties__ChunkAssignment_3_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:945:1: ( ( rule__CacheProperties__ChunkAssignment_3_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:946:1: ( rule__CacheProperties__ChunkAssignment_3_1 )
            {
             before(grammarAccess.getCachePropertiesAccess().getChunkAssignment_3_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:947:1: ( rule__CacheProperties__ChunkAssignment_3_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:947:2: rule__CacheProperties__ChunkAssignment_3_1
            {
            pushFollow(FOLLOW_rule__CacheProperties__ChunkAssignment_3_1_in_rule__CacheProperties__Group_3__1__Impl1881);
            rule__CacheProperties__ChunkAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCachePropertiesAccess().getChunkAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__Group_3__1__Impl"


    // $ANTLR start "rule__Plan__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:961:1: rule__Plan__Group__0 : rule__Plan__Group__0__Impl rule__Plan__Group__1 ;
    public final void rule__Plan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:965:1: ( rule__Plan__Group__0__Impl rule__Plan__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:966:2: rule__Plan__Group__0__Impl rule__Plan__Group__1
            {
            pushFollow(FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01915);
            rule__Plan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01918);
            rule__Plan__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__0"


    // $ANTLR start "rule__Plan__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:973:1: rule__Plan__Group__0__Impl : ( 'plan' ) ;
    public final void rule__Plan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:977:1: ( ( 'plan' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:978:1: ( 'plan' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:978:1: ( 'plan' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:979:1: 'plan'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Plan__Group__0__Impl1946); 
             after(grammarAccess.getPlanAccess().getPlanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__0__Impl"


    // $ANTLR start "rule__Plan__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:992:1: rule__Plan__Group__1 : rule__Plan__Group__1__Impl rule__Plan__Group__2 ;
    public final void rule__Plan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:996:1: ( rule__Plan__Group__1__Impl rule__Plan__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:997:2: rule__Plan__Group__1__Impl rule__Plan__Group__2
            {
            pushFollow(FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11977);
            rule__Plan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11980);
            rule__Plan__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__1"


    // $ANTLR start "rule__Plan__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1004:1: rule__Plan__Group__1__Impl : ( ( rule__Plan__NameAssignment_1 ) ) ;
    public final void rule__Plan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1008:1: ( ( ( rule__Plan__NameAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1009:1: ( ( rule__Plan__NameAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1009:1: ( ( rule__Plan__NameAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1010:1: ( rule__Plan__NameAssignment_1 )
            {
             before(grammarAccess.getPlanAccess().getNameAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1011:1: ( rule__Plan__NameAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1011:2: rule__Plan__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl2007);
            rule__Plan__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__1__Impl"


    // $ANTLR start "rule__Plan__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1021:1: rule__Plan__Group__2 : rule__Plan__Group__2__Impl rule__Plan__Group__3 ;
    public final void rule__Plan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1025:1: ( rule__Plan__Group__2__Impl rule__Plan__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1026:2: rule__Plan__Group__2__Impl rule__Plan__Group__3
            {
            pushFollow(FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__22037);
            rule__Plan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__22040);
            rule__Plan__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__2"


    // $ANTLR start "rule__Plan__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1033:1: rule__Plan__Group__2__Impl : ( ( rule__Plan__AfterAssignment_2 )? ) ;
    public final void rule__Plan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1037:1: ( ( ( rule__Plan__AfterAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1038:1: ( ( rule__Plan__AfterAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1038:1: ( ( rule__Plan__AfterAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1039:1: ( rule__Plan__AfterAssignment_2 )?
            {
             before(grammarAccess.getPlanAccess().getAfterAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1040:1: ( rule__Plan__AfterAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1040:2: rule__Plan__AfterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl2067);
                    rule__Plan__AfterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlanAccess().getAfterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__2__Impl"


    // $ANTLR start "rule__Plan__Group__3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1050:1: rule__Plan__Group__3 : rule__Plan__Group__3__Impl rule__Plan__Group__4 ;
    public final void rule__Plan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1054:1: ( rule__Plan__Group__3__Impl rule__Plan__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1055:2: rule__Plan__Group__3__Impl rule__Plan__Group__4
            {
            pushFollow(FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__32098);
            rule__Plan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__32101);
            rule__Plan__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__3"


    // $ANTLR start "rule__Plan__Group__3__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1062:1: rule__Plan__Group__3__Impl : ( '{' ) ;
    public final void rule__Plan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1066:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1067:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1067:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1068:1: '{'
            {
             before(grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Plan__Group__3__Impl2129); 
             after(grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__3__Impl"


    // $ANTLR start "rule__Plan__Group__4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1081:1: rule__Plan__Group__4 : rule__Plan__Group__4__Impl rule__Plan__Group__5 ;
    public final void rule__Plan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1085:1: ( rule__Plan__Group__4__Impl rule__Plan__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1086:2: rule__Plan__Group__4__Impl rule__Plan__Group__5
            {
            pushFollow(FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__42160);
            rule__Plan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__42163);
            rule__Plan__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__4"


    // $ANTLR start "rule__Plan__Group__4__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1093:1: rule__Plan__Group__4__Impl : ( ( rule__Plan__CacheAssignment_4 ) ) ;
    public final void rule__Plan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1097:1: ( ( ( rule__Plan__CacheAssignment_4 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1098:1: ( ( rule__Plan__CacheAssignment_4 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1098:1: ( ( rule__Plan__CacheAssignment_4 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1099:1: ( rule__Plan__CacheAssignment_4 )
            {
             before(grammarAccess.getPlanAccess().getCacheAssignment_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1100:1: ( rule__Plan__CacheAssignment_4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1100:2: rule__Plan__CacheAssignment_4
            {
            pushFollow(FOLLOW_rule__Plan__CacheAssignment_4_in_rule__Plan__Group__4__Impl2190);
            rule__Plan__CacheAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getCacheAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__4__Impl"


    // $ANTLR start "rule__Plan__Group__5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1110:1: rule__Plan__Group__5 : rule__Plan__Group__5__Impl rule__Plan__Group__6 ;
    public final void rule__Plan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1114:1: ( rule__Plan__Group__5__Impl rule__Plan__Group__6 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1115:2: rule__Plan__Group__5__Impl rule__Plan__Group__6
            {
            pushFollow(FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__52220);
            rule__Plan__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__6_in_rule__Plan__Group__52223);
            rule__Plan__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__5"


    // $ANTLR start "rule__Plan__Group__5__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1122:1: rule__Plan__Group__5__Impl : ( ( rule__Plan__RulesAssignment_5 )* ) ;
    public final void rule__Plan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1126:1: ( ( ( rule__Plan__RulesAssignment_5 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1127:1: ( ( rule__Plan__RulesAssignment_5 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1127:1: ( ( rule__Plan__RulesAssignment_5 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1128:1: ( rule__Plan__RulesAssignment_5 )*
            {
             before(grammarAccess.getPlanAccess().getRulesAssignment_5()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1129:1: ( rule__Plan__RulesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1129:2: rule__Plan__RulesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Plan__RulesAssignment_5_in_rule__Plan__Group__5__Impl2250);
            	    rule__Plan__RulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPlanAccess().getRulesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__5__Impl"


    // $ANTLR start "rule__Plan__Group__6"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1139:1: rule__Plan__Group__6 : rule__Plan__Group__6__Impl ;
    public final void rule__Plan__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1143:1: ( rule__Plan__Group__6__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1144:2: rule__Plan__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group__6__Impl_in_rule__Plan__Group__62281);
            rule__Plan__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__6"


    // $ANTLR start "rule__Plan__Group__6__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1150:1: rule__Plan__Group__6__Impl : ( '}' ) ;
    public final void rule__Plan__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1154:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1155:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1155:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1156:1: '}'
            {
             before(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Plan__Group__6__Impl2309); 
             after(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__6__Impl"


    // $ANTLR start "rule__AfterClause__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1183:1: rule__AfterClause__Group__0 : rule__AfterClause__Group__0__Impl rule__AfterClause__Group__1 ;
    public final void rule__AfterClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1187:1: ( rule__AfterClause__Group__0__Impl rule__AfterClause__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1188:2: rule__AfterClause__Group__0__Impl rule__AfterClause__Group__1
            {
            pushFollow(FOLLOW_rule__AfterClause__Group__0__Impl_in_rule__AfterClause__Group__02354);
            rule__AfterClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AfterClause__Group__1_in_rule__AfterClause__Group__02357);
            rule__AfterClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterClause__Group__0"


    // $ANTLR start "rule__AfterClause__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1195:1: rule__AfterClause__Group__0__Impl : ( 'after' ) ;
    public final void rule__AfterClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1199:1: ( ( 'after' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1200:1: ( 'after' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1200:1: ( 'after' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1201:1: 'after'
            {
             before(grammarAccess.getAfterClauseAccess().getAfterKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__AfterClause__Group__0__Impl2385); 
             after(grammarAccess.getAfterClauseAccess().getAfterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterClause__Group__0__Impl"


    // $ANTLR start "rule__AfterClause__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1214:1: rule__AfterClause__Group__1 : rule__AfterClause__Group__1__Impl ;
    public final void rule__AfterClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1218:1: ( rule__AfterClause__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1219:2: rule__AfterClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AfterClause__Group__1__Impl_in_rule__AfterClause__Group__12416);
            rule__AfterClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterClause__Group__1"


    // $ANTLR start "rule__AfterClause__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1225:1: rule__AfterClause__Group__1__Impl : ( ( rule__AfterClause__PlanAssignment_1 ) ) ;
    public final void rule__AfterClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1229:1: ( ( ( rule__AfterClause__PlanAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1230:1: ( ( rule__AfterClause__PlanAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1230:1: ( ( rule__AfterClause__PlanAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1231:1: ( rule__AfterClause__PlanAssignment_1 )
            {
             before(grammarAccess.getAfterClauseAccess().getPlanAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1232:1: ( rule__AfterClause__PlanAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1232:2: rule__AfterClause__PlanAssignment_1
            {
            pushFollow(FOLLOW_rule__AfterClause__PlanAssignment_1_in_rule__AfterClause__Group__1__Impl2443);
            rule__AfterClause__PlanAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAfterClauseAccess().getPlanAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterClause__Group__1__Impl"


    // $ANTLR start "rule__StartingRule__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1246:1: rule__StartingRule__Group__0 : rule__StartingRule__Group__0__Impl rule__StartingRule__Group__1 ;
    public final void rule__StartingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1250:1: ( rule__StartingRule__Group__0__Impl rule__StartingRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1251:2: rule__StartingRule__Group__0__Impl rule__StartingRule__Group__1
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__0__Impl_in_rule__StartingRule__Group__02477);
            rule__StartingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__1_in_rule__StartingRule__Group__02480);
            rule__StartingRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__0"


    // $ANTLR start "rule__StartingRule__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1258:1: rule__StartingRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__StartingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1262:1: ( ( 'rule' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1263:1: ( 'rule' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1263:1: ( 'rule' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1264:1: 'rule'
            {
             before(grammarAccess.getStartingRuleAccess().getRuleKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__StartingRule__Group__0__Impl2508); 
             after(grammarAccess.getStartingRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__0__Impl"


    // $ANTLR start "rule__StartingRule__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1277:1: rule__StartingRule__Group__1 : rule__StartingRule__Group__1__Impl rule__StartingRule__Group__2 ;
    public final void rule__StartingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1281:1: ( rule__StartingRule__Group__1__Impl rule__StartingRule__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1282:2: rule__StartingRule__Group__1__Impl rule__StartingRule__Group__2
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__1__Impl_in_rule__StartingRule__Group__12539);
            rule__StartingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__2_in_rule__StartingRule__Group__12542);
            rule__StartingRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__1"


    // $ANTLR start "rule__StartingRule__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1289:1: rule__StartingRule__Group__1__Impl : ( ( rule__StartingRule__NameAssignment_1 ) ) ;
    public final void rule__StartingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1293:1: ( ( ( rule__StartingRule__NameAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1294:1: ( ( rule__StartingRule__NameAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1294:1: ( ( rule__StartingRule__NameAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1295:1: ( rule__StartingRule__NameAssignment_1 )
            {
             before(grammarAccess.getStartingRuleAccess().getNameAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1296:1: ( rule__StartingRule__NameAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1296:2: rule__StartingRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StartingRule__NameAssignment_1_in_rule__StartingRule__Group__1__Impl2569);
            rule__StartingRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartingRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__1__Impl"


    // $ANTLR start "rule__StartingRule__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1306:1: rule__StartingRule__Group__2 : rule__StartingRule__Group__2__Impl rule__StartingRule__Group__3 ;
    public final void rule__StartingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1310:1: ( rule__StartingRule__Group__2__Impl rule__StartingRule__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1311:2: rule__StartingRule__Group__2__Impl rule__StartingRule__Group__3
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__2__Impl_in_rule__StartingRule__Group__22599);
            rule__StartingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__3_in_rule__StartingRule__Group__22602);
            rule__StartingRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__2"


    // $ANTLR start "rule__StartingRule__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1318:1: rule__StartingRule__Group__2__Impl : ( ':' ) ;
    public final void rule__StartingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1322:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1323:1: ( ':' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1323:1: ( ':' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1324:1: ':'
            {
             before(grammarAccess.getStartingRuleAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__StartingRule__Group__2__Impl2630); 
             after(grammarAccess.getStartingRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__2__Impl"


    // $ANTLR start "rule__StartingRule__Group__3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1337:1: rule__StartingRule__Group__3 : rule__StartingRule__Group__3__Impl rule__StartingRule__Group__4 ;
    public final void rule__StartingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1341:1: ( rule__StartingRule__Group__3__Impl rule__StartingRule__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1342:2: rule__StartingRule__Group__3__Impl rule__StartingRule__Group__4
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__3__Impl_in_rule__StartingRule__Group__32661);
            rule__StartingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__4_in_rule__StartingRule__Group__32664);
            rule__StartingRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__3"


    // $ANTLR start "rule__StartingRule__Group__3__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1349:1: rule__StartingRule__Group__3__Impl : ( 'on starting' ) ;
    public final void rule__StartingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1353:1: ( ( 'on starting' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1354:1: ( 'on starting' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1354:1: ( 'on starting' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1355:1: 'on starting'
            {
             before(grammarAccess.getStartingRuleAccess().getOnStartingKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__StartingRule__Group__3__Impl2692); 
             after(grammarAccess.getStartingRuleAccess().getOnStartingKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__3__Impl"


    // $ANTLR start "rule__StartingRule__Group__4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1368:1: rule__StartingRule__Group__4 : rule__StartingRule__Group__4__Impl rule__StartingRule__Group__5 ;
    public final void rule__StartingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1372:1: ( rule__StartingRule__Group__4__Impl rule__StartingRule__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1373:2: rule__StartingRule__Group__4__Impl rule__StartingRule__Group__5
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__4__Impl_in_rule__StartingRule__Group__42723);
            rule__StartingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__5_in_rule__StartingRule__Group__42726);
            rule__StartingRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__4"


    // $ANTLR start "rule__StartingRule__Group__4__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1380:1: rule__StartingRule__Group__4__Impl : ( 'fetch' ) ;
    public final void rule__StartingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1384:1: ( ( 'fetch' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1385:1: ( 'fetch' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1385:1: ( 'fetch' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1386:1: 'fetch'
            {
             before(grammarAccess.getStartingRuleAccess().getFetchKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__StartingRule__Group__4__Impl2754); 
             after(grammarAccess.getStartingRuleAccess().getFetchKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__4__Impl"


    // $ANTLR start "rule__StartingRule__Group__5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1399:1: rule__StartingRule__Group__5 : rule__StartingRule__Group__5__Impl ;
    public final void rule__StartingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1403:1: ( rule__StartingRule__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1404:2: rule__StartingRule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__5__Impl_in_rule__StartingRule__Group__52785);
            rule__StartingRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__5"


    // $ANTLR start "rule__StartingRule__Group__5__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1410:1: rule__StartingRule__Group__5__Impl : ( ( rule__StartingRule__TargetPatternAssignment_5 ) ) ;
    public final void rule__StartingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1414:1: ( ( ( rule__StartingRule__TargetPatternAssignment_5 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1415:1: ( ( rule__StartingRule__TargetPatternAssignment_5 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1415:1: ( ( rule__StartingRule__TargetPatternAssignment_5 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1416:1: ( rule__StartingRule__TargetPatternAssignment_5 )
            {
             before(grammarAccess.getStartingRuleAccess().getTargetPatternAssignment_5()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1417:1: ( rule__StartingRule__TargetPatternAssignment_5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1417:2: rule__StartingRule__TargetPatternAssignment_5
            {
            pushFollow(FOLLOW_rule__StartingRule__TargetPatternAssignment_5_in_rule__StartingRule__Group__5__Impl2812);
            rule__StartingRule__TargetPatternAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStartingRuleAccess().getTargetPatternAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__Group__5__Impl"


    // $ANTLR start "rule__AccessRule__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1439:1: rule__AccessRule__Group__0 : rule__AccessRule__Group__0__Impl rule__AccessRule__Group__1 ;
    public final void rule__AccessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1443:1: ( rule__AccessRule__Group__0__Impl rule__AccessRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1444:2: rule__AccessRule__Group__0__Impl rule__AccessRule__Group__1
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__0__Impl_in_rule__AccessRule__Group__02854);
            rule__AccessRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group__1_in_rule__AccessRule__Group__02857);
            rule__AccessRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__0"


    // $ANTLR start "rule__AccessRule__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1451:1: rule__AccessRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__AccessRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1455:1: ( ( 'rule' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1456:1: ( 'rule' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1456:1: ( 'rule' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1457:1: 'rule'
            {
             before(grammarAccess.getAccessRuleAccess().getRuleKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__AccessRule__Group__0__Impl2885); 
             after(grammarAccess.getAccessRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__0__Impl"


    // $ANTLR start "rule__AccessRule__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1470:1: rule__AccessRule__Group__1 : rule__AccessRule__Group__1__Impl rule__AccessRule__Group__2 ;
    public final void rule__AccessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1474:1: ( rule__AccessRule__Group__1__Impl rule__AccessRule__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1475:2: rule__AccessRule__Group__1__Impl rule__AccessRule__Group__2
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__1__Impl_in_rule__AccessRule__Group__12916);
            rule__AccessRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group__2_in_rule__AccessRule__Group__12919);
            rule__AccessRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__1"


    // $ANTLR start "rule__AccessRule__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1482:1: rule__AccessRule__Group__1__Impl : ( ( rule__AccessRule__NameAssignment_1 ) ) ;
    public final void rule__AccessRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1486:1: ( ( ( rule__AccessRule__NameAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1487:1: ( ( rule__AccessRule__NameAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1487:1: ( ( rule__AccessRule__NameAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1488:1: ( rule__AccessRule__NameAssignment_1 )
            {
             before(grammarAccess.getAccessRuleAccess().getNameAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1489:1: ( rule__AccessRule__NameAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1489:2: rule__AccessRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AccessRule__NameAssignment_1_in_rule__AccessRule__Group__1__Impl2946);
            rule__AccessRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__1__Impl"


    // $ANTLR start "rule__AccessRule__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1499:1: rule__AccessRule__Group__2 : rule__AccessRule__Group__2__Impl rule__AccessRule__Group__3 ;
    public final void rule__AccessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1503:1: ( rule__AccessRule__Group__2__Impl rule__AccessRule__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1504:2: rule__AccessRule__Group__2__Impl rule__AccessRule__Group__3
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__2__Impl_in_rule__AccessRule__Group__22976);
            rule__AccessRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group__3_in_rule__AccessRule__Group__22979);
            rule__AccessRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__2"


    // $ANTLR start "rule__AccessRule__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1511:1: rule__AccessRule__Group__2__Impl : ( ':' ) ;
    public final void rule__AccessRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1515:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1516:1: ( ':' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1516:1: ( ':' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1517:1: ':'
            {
             before(grammarAccess.getAccessRuleAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__AccessRule__Group__2__Impl3007); 
             after(grammarAccess.getAccessRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__2__Impl"


    // $ANTLR start "rule__AccessRule__Group__3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1530:1: rule__AccessRule__Group__3 : rule__AccessRule__Group__3__Impl rule__AccessRule__Group__4 ;
    public final void rule__AccessRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1534:1: ( rule__AccessRule__Group__3__Impl rule__AccessRule__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1535:2: rule__AccessRule__Group__3__Impl rule__AccessRule__Group__4
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__3__Impl_in_rule__AccessRule__Group__33038);
            rule__AccessRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group__4_in_rule__AccessRule__Group__33041);
            rule__AccessRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__3"


    // $ANTLR start "rule__AccessRule__Group__3__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1542:1: rule__AccessRule__Group__3__Impl : ( 'on access' ) ;
    public final void rule__AccessRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1546:1: ( ( 'on access' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1547:1: ( 'on access' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1547:1: ( 'on access' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1548:1: 'on access'
            {
             before(grammarAccess.getAccessRuleAccess().getOnAccessKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__AccessRule__Group__3__Impl3069); 
             after(grammarAccess.getAccessRuleAccess().getOnAccessKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__3__Impl"


    // $ANTLR start "rule__AccessRule__Group__4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1561:1: rule__AccessRule__Group__4 : rule__AccessRule__Group__4__Impl rule__AccessRule__Group__5 ;
    public final void rule__AccessRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1565:1: ( rule__AccessRule__Group__4__Impl rule__AccessRule__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1566:2: rule__AccessRule__Group__4__Impl rule__AccessRule__Group__5
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__4__Impl_in_rule__AccessRule__Group__43100);
            rule__AccessRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group__5_in_rule__AccessRule__Group__43103);
            rule__AccessRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__4"


    // $ANTLR start "rule__AccessRule__Group__4__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1573:1: rule__AccessRule__Group__4__Impl : ( ( rule__AccessRule__SourcePatternAssignment_4 ) ) ;
    public final void rule__AccessRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1577:1: ( ( ( rule__AccessRule__SourcePatternAssignment_4 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1578:1: ( ( rule__AccessRule__SourcePatternAssignment_4 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1578:1: ( ( rule__AccessRule__SourcePatternAssignment_4 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1579:1: ( rule__AccessRule__SourcePatternAssignment_4 )
            {
             before(grammarAccess.getAccessRuleAccess().getSourcePatternAssignment_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1580:1: ( rule__AccessRule__SourcePatternAssignment_4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1580:2: rule__AccessRule__SourcePatternAssignment_4
            {
            pushFollow(FOLLOW_rule__AccessRule__SourcePatternAssignment_4_in_rule__AccessRule__Group__4__Impl3130);
            rule__AccessRule__SourcePatternAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAccessRuleAccess().getSourcePatternAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__4__Impl"


    // $ANTLR start "rule__AccessRule__Group__5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1590:1: rule__AccessRule__Group__5 : rule__AccessRule__Group__5__Impl rule__AccessRule__Group__6 ;
    public final void rule__AccessRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1594:1: ( rule__AccessRule__Group__5__Impl rule__AccessRule__Group__6 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1595:2: rule__AccessRule__Group__5__Impl rule__AccessRule__Group__6
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__5__Impl_in_rule__AccessRule__Group__53160);
            rule__AccessRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group__6_in_rule__AccessRule__Group__53163);
            rule__AccessRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__5"


    // $ANTLR start "rule__AccessRule__Group__5__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1602:1: rule__AccessRule__Group__5__Impl : ( 'fetch' ) ;
    public final void rule__AccessRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1606:1: ( ( 'fetch' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1607:1: ( 'fetch' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1607:1: ( 'fetch' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1608:1: 'fetch'
            {
             before(grammarAccess.getAccessRuleAccess().getFetchKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__AccessRule__Group__5__Impl3191); 
             after(grammarAccess.getAccessRuleAccess().getFetchKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__5__Impl"


    // $ANTLR start "rule__AccessRule__Group__6"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1621:1: rule__AccessRule__Group__6 : rule__AccessRule__Group__6__Impl rule__AccessRule__Group__7 ;
    public final void rule__AccessRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1625:1: ( rule__AccessRule__Group__6__Impl rule__AccessRule__Group__7 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1626:2: rule__AccessRule__Group__6__Impl rule__AccessRule__Group__7
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__6__Impl_in_rule__AccessRule__Group__63222);
            rule__AccessRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group__7_in_rule__AccessRule__Group__63225);
            rule__AccessRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__6"


    // $ANTLR start "rule__AccessRule__Group__6__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1633:1: rule__AccessRule__Group__6__Impl : ( ( rule__AccessRule__TargetPatternAssignment_6 ) ) ;
    public final void rule__AccessRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1637:1: ( ( ( rule__AccessRule__TargetPatternAssignment_6 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1638:1: ( ( rule__AccessRule__TargetPatternAssignment_6 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1638:1: ( ( rule__AccessRule__TargetPatternAssignment_6 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1639:1: ( rule__AccessRule__TargetPatternAssignment_6 )
            {
             before(grammarAccess.getAccessRuleAccess().getTargetPatternAssignment_6()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1640:1: ( rule__AccessRule__TargetPatternAssignment_6 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1640:2: rule__AccessRule__TargetPatternAssignment_6
            {
            pushFollow(FOLLOW_rule__AccessRule__TargetPatternAssignment_6_in_rule__AccessRule__Group__6__Impl3252);
            rule__AccessRule__TargetPatternAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAccessRuleAccess().getTargetPatternAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__6__Impl"


    // $ANTLR start "rule__AccessRule__Group__7"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1650:1: rule__AccessRule__Group__7 : rule__AccessRule__Group__7__Impl ;
    public final void rule__AccessRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1654:1: ( rule__AccessRule__Group__7__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1655:2: rule__AccessRule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__AccessRule__Group__7__Impl_in_rule__AccessRule__Group__73282);
            rule__AccessRule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__7"


    // $ANTLR start "rule__AccessRule__Group__7__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1661:1: rule__AccessRule__Group__7__Impl : ( ( rule__AccessRule__Group_7__0 )? ) ;
    public final void rule__AccessRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1665:1: ( ( ( rule__AccessRule__Group_7__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1666:1: ( ( rule__AccessRule__Group_7__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1666:1: ( ( rule__AccessRule__Group_7__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1667:1: ( rule__AccessRule__Group_7__0 )?
            {
             before(grammarAccess.getAccessRuleAccess().getGroup_7()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1668:1: ( rule__AccessRule__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1668:2: rule__AccessRule__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AccessRule__Group_7__0_in_rule__AccessRule__Group__7__Impl3309);
                    rule__AccessRule__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessRuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group__7__Impl"


    // $ANTLR start "rule__AccessRule__Group_7__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1694:1: rule__AccessRule__Group_7__0 : rule__AccessRule__Group_7__0__Impl rule__AccessRule__Group_7__1 ;
    public final void rule__AccessRule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1698:1: ( rule__AccessRule__Group_7__0__Impl rule__AccessRule__Group_7__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1699:2: rule__AccessRule__Group_7__0__Impl rule__AccessRule__Group_7__1
            {
            pushFollow(FOLLOW_rule__AccessRule__Group_7__0__Impl_in_rule__AccessRule__Group_7__03356);
            rule__AccessRule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group_7__1_in_rule__AccessRule__Group_7__03359);
            rule__AccessRule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group_7__0"


    // $ANTLR start "rule__AccessRule__Group_7__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1706:1: rule__AccessRule__Group_7__0__Impl : ( 'remove' ) ;
    public final void rule__AccessRule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1710:1: ( ( 'remove' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1711:1: ( 'remove' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1711:1: ( 'remove' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1712:1: 'remove'
            {
             before(grammarAccess.getAccessRuleAccess().getRemoveKeyword_7_0()); 
            match(input,28,FOLLOW_28_in_rule__AccessRule__Group_7__0__Impl3387); 
             after(grammarAccess.getAccessRuleAccess().getRemoveKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group_7__0__Impl"


    // $ANTLR start "rule__AccessRule__Group_7__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1725:1: rule__AccessRule__Group_7__1 : rule__AccessRule__Group_7__1__Impl rule__AccessRule__Group_7__2 ;
    public final void rule__AccessRule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1729:1: ( rule__AccessRule__Group_7__1__Impl rule__AccessRule__Group_7__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1730:2: rule__AccessRule__Group_7__1__Impl rule__AccessRule__Group_7__2
            {
            pushFollow(FOLLOW_rule__AccessRule__Group_7__1__Impl_in_rule__AccessRule__Group_7__13418);
            rule__AccessRule__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessRule__Group_7__2_in_rule__AccessRule__Group_7__13421);
            rule__AccessRule__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group_7__1"


    // $ANTLR start "rule__AccessRule__Group_7__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1737:1: rule__AccessRule__Group_7__1__Impl : ( 'type' ) ;
    public final void rule__AccessRule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1741:1: ( ( 'type' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1742:1: ( 'type' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1742:1: ( 'type' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1743:1: 'type'
            {
             before(grammarAccess.getAccessRuleAccess().getTypeKeyword_7_1()); 
            match(input,29,FOLLOW_29_in_rule__AccessRule__Group_7__1__Impl3449); 
             after(grammarAccess.getAccessRuleAccess().getTypeKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group_7__1__Impl"


    // $ANTLR start "rule__AccessRule__Group_7__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1756:1: rule__AccessRule__Group_7__2 : rule__AccessRule__Group_7__2__Impl ;
    public final void rule__AccessRule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1760:1: ( rule__AccessRule__Group_7__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1761:2: rule__AccessRule__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__AccessRule__Group_7__2__Impl_in_rule__AccessRule__Group_7__23480);
            rule__AccessRule__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group_7__2"


    // $ANTLR start "rule__AccessRule__Group_7__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1767:1: rule__AccessRule__Group_7__2__Impl : ( ( rule__AccessRule__RemoveTypeAssignment_7_2 ) ) ;
    public final void rule__AccessRule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1771:1: ( ( ( rule__AccessRule__RemoveTypeAssignment_7_2 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1772:1: ( ( rule__AccessRule__RemoveTypeAssignment_7_2 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1772:1: ( ( rule__AccessRule__RemoveTypeAssignment_7_2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1773:1: ( rule__AccessRule__RemoveTypeAssignment_7_2 )
            {
             before(grammarAccess.getAccessRuleAccess().getRemoveTypeAssignment_7_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1774:1: ( rule__AccessRule__RemoveTypeAssignment_7_2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1774:2: rule__AccessRule__RemoveTypeAssignment_7_2
            {
            pushFollow(FOLLOW_rule__AccessRule__RemoveTypeAssignment_7_2_in_rule__AccessRule__Group_7__2__Impl3507);
            rule__AccessRule__RemoveTypeAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessRuleAccess().getRemoveTypeAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__Group_7__2__Impl"


    // $ANTLR start "rule__SourcePattern__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1790:1: rule__SourcePattern__Group__0 : rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 ;
    public final void rule__SourcePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1794:1: ( rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1795:2: rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__03543);
            rule__SourcePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__03546);
            rule__SourcePattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__Group__0"


    // $ANTLR start "rule__SourcePattern__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1802:1: rule__SourcePattern__Group__0__Impl : ( 'type' ) ;
    public final void rule__SourcePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1806:1: ( ( 'type' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1807:1: ( 'type' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1807:1: ( 'type' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1808:1: 'type'
            {
             before(grammarAccess.getSourcePatternAccess().getTypeKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__SourcePattern__Group__0__Impl3574); 
             after(grammarAccess.getSourcePatternAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__Group__0__Impl"


    // $ANTLR start "rule__SourcePattern__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1821:1: rule__SourcePattern__Group__1 : rule__SourcePattern__Group__1__Impl rule__SourcePattern__Group__2 ;
    public final void rule__SourcePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1825:1: ( rule__SourcePattern__Group__1__Impl rule__SourcePattern__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1826:2: rule__SourcePattern__Group__1__Impl rule__SourcePattern__Group__2
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__13605);
            rule__SourcePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SourcePattern__Group__2_in_rule__SourcePattern__Group__13608);
            rule__SourcePattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__Group__1"


    // $ANTLR start "rule__SourcePattern__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1833:1: rule__SourcePattern__Group__1__Impl : ( ( rule__SourcePattern__PatternAssignment_1 ) ) ;
    public final void rule__SourcePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1837:1: ( ( ( rule__SourcePattern__PatternAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1838:1: ( ( rule__SourcePattern__PatternAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1838:1: ( ( rule__SourcePattern__PatternAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1839:1: ( rule__SourcePattern__PatternAssignment_1 )
            {
             before(grammarAccess.getSourcePatternAccess().getPatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1840:1: ( rule__SourcePattern__PatternAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1840:2: rule__SourcePattern__PatternAssignment_1
            {
            pushFollow(FOLLOW_rule__SourcePattern__PatternAssignment_1_in_rule__SourcePattern__Group__1__Impl3635);
            rule__SourcePattern__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourcePatternAccess().getPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__Group__1__Impl"


    // $ANTLR start "rule__SourcePattern__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1850:1: rule__SourcePattern__Group__2 : rule__SourcePattern__Group__2__Impl ;
    public final void rule__SourcePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1854:1: ( rule__SourcePattern__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1855:2: rule__SourcePattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__2__Impl_in_rule__SourcePattern__Group__23665);
            rule__SourcePattern__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__Group__2"


    // $ANTLR start "rule__SourcePattern__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1861:1: rule__SourcePattern__Group__2__Impl : ( ( rule__SourcePattern__FilterAssignment_2 )? ) ;
    public final void rule__SourcePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1865:1: ( ( ( rule__SourcePattern__FilterAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1866:1: ( ( rule__SourcePattern__FilterAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1866:1: ( ( rule__SourcePattern__FilterAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1867:1: ( rule__SourcePattern__FilterAssignment_2 )?
            {
             before(grammarAccess.getSourcePatternAccess().getFilterAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1868:1: ( rule__SourcePattern__FilterAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1868:2: rule__SourcePattern__FilterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SourcePattern__FilterAssignment_2_in_rule__SourcePattern__Group__2__Impl3692);
                    rule__SourcePattern__FilterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourcePatternAccess().getFilterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__Group__2__Impl"


    // $ANTLR start "rule__FilterPattern__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1884:1: rule__FilterPattern__Group__0 : rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 ;
    public final void rule__FilterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1888:1: ( rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1889:2: rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__03729);
            rule__FilterPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__03732);
            rule__FilterPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPattern__Group__0"


    // $ANTLR start "rule__FilterPattern__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1896:1: rule__FilterPattern__Group__0__Impl : ( '[' ) ;
    public final void rule__FilterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1900:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1901:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1901:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1902:1: '['
            {
             before(grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__FilterPattern__Group__0__Impl3760); 
             after(grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPattern__Group__0__Impl"


    // $ANTLR start "rule__FilterPattern__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1915:1: rule__FilterPattern__Group__1 : rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 ;
    public final void rule__FilterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1919:1: ( rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1920:2: rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13791);
            rule__FilterPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13794);
            rule__FilterPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPattern__Group__1"


    // $ANTLR start "rule__FilterPattern__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1927:1: rule__FilterPattern__Group__1__Impl : ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) ;
    public final void rule__FilterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1931:1: ( ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1932:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1932:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1933:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1934:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1934:2: rule__FilterPattern__StringPatternAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3821);
            rule__FilterPattern__StringPatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterPatternAccess().getStringPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPattern__Group__1__Impl"


    // $ANTLR start "rule__FilterPattern__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1944:1: rule__FilterPattern__Group__2 : rule__FilterPattern__Group__2__Impl ;
    public final void rule__FilterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1948:1: ( rule__FilterPattern__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1949:2: rule__FilterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23851);
            rule__FilterPattern__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPattern__Group__2"


    // $ANTLR start "rule__FilterPattern__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1955:1: rule__FilterPattern__Group__2__Impl : ( ']' ) ;
    public final void rule__FilterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1959:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1960:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1960:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1961:1: ']'
            {
             before(grammarAccess.getFilterPatternAccess().getRightSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__FilterPattern__Group__2__Impl3879); 
             after(grammarAccess.getFilterPatternAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPattern__Group__2__Impl"


    // $ANTLR start "rule__PatternExp2__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1982:1: rule__PatternExp2__Group__0 : rule__PatternExp2__Group__0__Impl rule__PatternExp2__Group__1 ;
    public final void rule__PatternExp2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1986:1: ( rule__PatternExp2__Group__0__Impl rule__PatternExp2__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1987:2: rule__PatternExp2__Group__0__Impl rule__PatternExp2__Group__1
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group__0__Impl_in_rule__PatternExp2__Group__03918);
            rule__PatternExp2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternExp2__Group__1_in_rule__PatternExp2__Group__03921);
            rule__PatternExp2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group__0"


    // $ANTLR start "rule__PatternExp2__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1994:1: rule__PatternExp2__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PatternExp2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1998:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1999:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1999:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2000:1: RULE_ID
            {
             before(grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternExp2__Group__0__Impl3948); 
             after(grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group__0__Impl"


    // $ANTLR start "rule__PatternExp2__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2011:1: rule__PatternExp2__Group__1 : rule__PatternExp2__Group__1__Impl ;
    public final void rule__PatternExp2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2015:1: ( rule__PatternExp2__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2016:2: rule__PatternExp2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group__1__Impl_in_rule__PatternExp2__Group__13977);
            rule__PatternExp2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group__1"


    // $ANTLR start "rule__PatternExp2__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2022:1: rule__PatternExp2__Group__1__Impl : ( ( rule__PatternExp2__Group_1__0 )* ) ;
    public final void rule__PatternExp2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2026:1: ( ( ( rule__PatternExp2__Group_1__0 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2027:1: ( ( rule__PatternExp2__Group_1__0 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2027:1: ( ( rule__PatternExp2__Group_1__0 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2028:1: ( rule__PatternExp2__Group_1__0 )*
            {
             before(grammarAccess.getPatternExp2Access().getGroup_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2029:1: ( rule__PatternExp2__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2029:2: rule__PatternExp2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PatternExp2__Group_1__0_in_rule__PatternExp2__Group__1__Impl4004);
            	    rule__PatternExp2__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPatternExp2Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group__1__Impl"


    // $ANTLR start "rule__PatternExp2__Group_1__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2043:1: rule__PatternExp2__Group_1__0 : rule__PatternExp2__Group_1__0__Impl rule__PatternExp2__Group_1__1 ;
    public final void rule__PatternExp2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2047:1: ( rule__PatternExp2__Group_1__0__Impl rule__PatternExp2__Group_1__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2048:2: rule__PatternExp2__Group_1__0__Impl rule__PatternExp2__Group_1__1
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group_1__0__Impl_in_rule__PatternExp2__Group_1__04039);
            rule__PatternExp2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternExp2__Group_1__1_in_rule__PatternExp2__Group_1__04042);
            rule__PatternExp2__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1__0"


    // $ANTLR start "rule__PatternExp2__Group_1__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2055:1: rule__PatternExp2__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PatternExp2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2059:1: ( ( '.' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2060:1: ( '.' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2060:1: ( '.' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2061:1: '.'
            {
             before(grammarAccess.getPatternExp2Access().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__PatternExp2__Group_1__0__Impl4070); 
             after(grammarAccess.getPatternExp2Access().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1__0__Impl"


    // $ANTLR start "rule__PatternExp2__Group_1__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2074:1: rule__PatternExp2__Group_1__1 : rule__PatternExp2__Group_1__1__Impl ;
    public final void rule__PatternExp2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2078:1: ( rule__PatternExp2__Group_1__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2079:2: rule__PatternExp2__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group_1__1__Impl_in_rule__PatternExp2__Group_1__14101);
            rule__PatternExp2__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1__1"


    // $ANTLR start "rule__PatternExp2__Group_1__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2085:1: rule__PatternExp2__Group_1__1__Impl : ( ( rule__PatternExp2__Alternatives_1_1 ) ) ;
    public final void rule__PatternExp2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2089:1: ( ( ( rule__PatternExp2__Alternatives_1_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2090:1: ( ( rule__PatternExp2__Alternatives_1_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2090:1: ( ( rule__PatternExp2__Alternatives_1_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2091:1: ( rule__PatternExp2__Alternatives_1_1 )
            {
             before(grammarAccess.getPatternExp2Access().getAlternatives_1_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2092:1: ( rule__PatternExp2__Alternatives_1_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2092:2: rule__PatternExp2__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__PatternExp2__Alternatives_1_1_in_rule__PatternExp2__Group_1__1__Impl4128);
            rule__PatternExp2__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternExp2Access().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1__1__Impl"


    // $ANTLR start "rule__PatternExp2__Group_1_1_0__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2106:1: rule__PatternExp2__Group_1_1_0__0 : rule__PatternExp2__Group_1_1_0__0__Impl rule__PatternExp2__Group_1_1_0__1 ;
    public final void rule__PatternExp2__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2110:1: ( rule__PatternExp2__Group_1_1_0__0__Impl rule__PatternExp2__Group_1_1_0__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2111:2: rule__PatternExp2__Group_1_1_0__0__Impl rule__PatternExp2__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_0__0__Impl_in_rule__PatternExp2__Group_1_1_0__04162);
            rule__PatternExp2__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_0__1_in_rule__PatternExp2__Group_1_1_0__04165);
            rule__PatternExp2__Group_1_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_0__0"


    // $ANTLR start "rule__PatternExp2__Group_1_1_0__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2118:1: rule__PatternExp2__Group_1_1_0__0__Impl : ( RULE_ID ) ;
    public final void rule__PatternExp2__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2122:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2123:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2123:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2124:1: RULE_ID
            {
             before(grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternExp2__Group_1_1_0__0__Impl4192); 
             after(grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__PatternExp2__Group_1_1_0__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2135:1: rule__PatternExp2__Group_1_1_0__1 : rule__PatternExp2__Group_1_1_0__1__Impl ;
    public final void rule__PatternExp2__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2139:1: ( rule__PatternExp2__Group_1_1_0__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2140:2: rule__PatternExp2__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_0__1__Impl_in_rule__PatternExp2__Group_1_1_0__14221);
            rule__PatternExp2__Group_1_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_0__1"


    // $ANTLR start "rule__PatternExp2__Group_1_1_0__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2146:1: rule__PatternExp2__Group_1_1_0__1__Impl : ( '*' ) ;
    public final void rule__PatternExp2__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2150:1: ( ( '*' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2151:1: ( '*' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2151:1: ( '*' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2152:1: '*'
            {
             before(grammarAccess.getPatternExp2Access().getAsteriskKeyword_1_1_0_1()); 
            match(input,31,FOLLOW_31_in_rule__PatternExp2__Group_1_1_0__1__Impl4249); 
             after(grammarAccess.getPatternExp2Access().getAsteriskKeyword_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__PatternExp2__Group_1_1_1__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2169:1: rule__PatternExp2__Group_1_1_1__0 : rule__PatternExp2__Group_1_1_1__0__Impl rule__PatternExp2__Group_1_1_1__1 ;
    public final void rule__PatternExp2__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2173:1: ( rule__PatternExp2__Group_1_1_1__0__Impl rule__PatternExp2__Group_1_1_1__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2174:2: rule__PatternExp2__Group_1_1_1__0__Impl rule__PatternExp2__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_1__0__Impl_in_rule__PatternExp2__Group_1_1_1__04284);
            rule__PatternExp2__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_1__1_in_rule__PatternExp2__Group_1_1_1__04287);
            rule__PatternExp2__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_1__0"


    // $ANTLR start "rule__PatternExp2__Group_1_1_1__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2181:1: rule__PatternExp2__Group_1_1_1__0__Impl : ( RULE_ID ) ;
    public final void rule__PatternExp2__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2185:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2186:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2186:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2187:1: RULE_ID
            {
             before(grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternExp2__Group_1_1_1__0__Impl4314); 
             after(grammarAccess.getPatternExp2Access().getIDTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__PatternExp2__Group_1_1_1__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2198:1: rule__PatternExp2__Group_1_1_1__1 : rule__PatternExp2__Group_1_1_1__1__Impl ;
    public final void rule__PatternExp2__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2202:1: ( rule__PatternExp2__Group_1_1_1__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2203:2: rule__PatternExp2__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PatternExp2__Group_1_1_1__1__Impl_in_rule__PatternExp2__Group_1_1_1__14343);
            rule__PatternExp2__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_1__1"


    // $ANTLR start "rule__PatternExp2__Group_1_1_1__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2209:1: rule__PatternExp2__Group_1_1_1__1__Impl : ( ( '()' )? ) ;
    public final void rule__PatternExp2__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2213:1: ( ( ( '()' )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2214:1: ( ( '()' )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2214:1: ( ( '()' )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2215:1: ( '()' )?
            {
             before(grammarAccess.getPatternExp2Access().getLeftParenthesisRightParenthesisKeyword_1_1_1_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2216:1: ( '()' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2217:2: '()'
                    {
                    match(input,32,FOLLOW_32_in_rule__PatternExp2__Group_1_1_1__1__Impl4372); 

                    }
                    break;

            }

             after(grammarAccess.getPatternExp2Access().getLeftParenthesisRightParenthesisKeyword_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternExp2__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Model__MetamodelAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2235:1: rule__Model__MetamodelAssignment_0 : ( ruleMetamodelImport ) ;
    public final void rule__Model__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2239:1: ( ( ruleMetamodelImport ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2240:1: ( ruleMetamodelImport )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2240:1: ( ruleMetamodelImport )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2241:1: ruleMetamodelImport
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMetamodelImport_in_rule__Model__MetamodelAssignment_04416);
            ruleMetamodelImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMetamodelMetamodelImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MetamodelAssignment_0"


    // $ANTLR start "rule__Model__PlansAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2250:1: rule__Model__PlansAssignment_1 : ( rulePlan ) ;
    public final void rule__Model__PlansAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2254:1: ( ( rulePlan ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2255:1: ( rulePlan )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2255:1: ( rulePlan )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2256:1: rulePlan
            {
             before(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlan_in_rule__Model__PlansAssignment_14447);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PlansAssignment_1"


    // $ANTLR start "rule__MetamodelImport__NsURIAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2265:1: rule__MetamodelImport__NsURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MetamodelImport__NsURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2269:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2270:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2270:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2271:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelImportAccess().getNsURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetamodelImport__NsURIAssignment_14478); 
             after(grammarAccess.getMetamodelImportAccess().getNsURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelImport__NsURIAssignment_1"


    // $ANTLR start "rule__Cache__TypeAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2280:1: rule__Cache__TypeAssignment_1 : ( ruleCacheType ) ;
    public final void rule__Cache__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2284:1: ( ( ruleCacheType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2285:1: ( ruleCacheType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2285:1: ( ruleCacheType )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2286:1: ruleCacheType
            {
             before(grammarAccess.getCacheAccess().getTypeCacheTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_14509);
            ruleCacheType();

            state._fsp--;

             after(grammarAccess.getCacheAccess().getTypeCacheTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__TypeAssignment_1"


    // $ANTLR start "rule__Cache__PropertiesAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2295:1: rule__Cache__PropertiesAssignment_2 : ( ruleCacheProperties ) ;
    public final void rule__Cache__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2299:1: ( ( ruleCacheProperties ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2300:1: ( ruleCacheProperties )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2300:1: ( ruleCacheProperties )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2301:1: ruleCacheProperties
            {
             before(grammarAccess.getCacheAccess().getPropertiesCachePropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_24540);
            ruleCacheProperties();

            state._fsp--;

             after(grammarAccess.getCacheAccess().getPropertiesCachePropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cache__PropertiesAssignment_2"


    // $ANTLR start "rule__CacheProperties__SizeAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2310:1: rule__CacheProperties__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__CacheProperties__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2314:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2315:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2315:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2316:1: RULE_INT
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_24571); 
             after(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__SizeAssignment_2"


    // $ANTLR start "rule__CacheProperties__ChunkAssignment_3_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2325:1: rule__CacheProperties__ChunkAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__CacheProperties__ChunkAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2329:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2330:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2330:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2331:1: RULE_INT
            {
             before(grammarAccess.getCachePropertiesAccess().getChunkINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CacheProperties__ChunkAssignment_3_14602); 
             after(grammarAccess.getCachePropertiesAccess().getChunkINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CacheProperties__ChunkAssignment_3_1"


    // $ANTLR start "rule__Plan__NameAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2340:1: rule__Plan__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Plan__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2344:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2345:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2345:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2346:1: RULE_ID
            {
             before(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_14633); 
             after(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__NameAssignment_1"


    // $ANTLR start "rule__Plan__AfterAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2355:1: rule__Plan__AfterAssignment_2 : ( ruleAfterClause ) ;
    public final void rule__Plan__AfterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2359:1: ( ( ruleAfterClause ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2360:1: ( ruleAfterClause )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2360:1: ( ruleAfterClause )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2361:1: ruleAfterClause
            {
             before(grammarAccess.getPlanAccess().getAfterAfterClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAfterClause_in_rule__Plan__AfterAssignment_24664);
            ruleAfterClause();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getAfterAfterClauseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__AfterAssignment_2"


    // $ANTLR start "rule__Plan__CacheAssignment_4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2370:1: rule__Plan__CacheAssignment_4 : ( ruleCache ) ;
    public final void rule__Plan__CacheAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2374:1: ( ( ruleCache ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2375:1: ( ruleCache )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2375:1: ( ruleCache )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2376:1: ruleCache
            {
             before(grammarAccess.getPlanAccess().getCacheCacheParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCache_in_rule__Plan__CacheAssignment_44695);
            ruleCache();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getCacheCacheParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__CacheAssignment_4"


    // $ANTLR start "rule__Plan__RulesAssignment_5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2385:1: rule__Plan__RulesAssignment_5 : ( ( rule__Plan__RulesAlternatives_5_0 ) ) ;
    public final void rule__Plan__RulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2389:1: ( ( ( rule__Plan__RulesAlternatives_5_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2390:1: ( ( rule__Plan__RulesAlternatives_5_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2390:1: ( ( rule__Plan__RulesAlternatives_5_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2391:1: ( rule__Plan__RulesAlternatives_5_0 )
            {
             before(grammarAccess.getPlanAccess().getRulesAlternatives_5_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2392:1: ( rule__Plan__RulesAlternatives_5_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2392:2: rule__Plan__RulesAlternatives_5_0
            {
            pushFollow(FOLLOW_rule__Plan__RulesAlternatives_5_0_in_rule__Plan__RulesAssignment_54726);
            rule__Plan__RulesAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getRulesAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__RulesAssignment_5"


    // $ANTLR start "rule__AfterClause__PlanAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2401:1: rule__AfterClause__PlanAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AfterClause__PlanAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2405:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2406:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2406:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2407:1: ( RULE_ID )
            {
             before(grammarAccess.getAfterClauseAccess().getPlanPlanCrossReference_1_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2408:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2409:1: RULE_ID
            {
             before(grammarAccess.getAfterClauseAccess().getPlanPlanIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AfterClause__PlanAssignment_14763); 
             after(grammarAccess.getAfterClauseAccess().getPlanPlanIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAfterClauseAccess().getPlanPlanCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterClause__PlanAssignment_1"


    // $ANTLR start "rule__StartingRule__NameAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2420:1: rule__StartingRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StartingRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2424:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2425:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2425:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2426:1: RULE_ID
            {
             before(grammarAccess.getStartingRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartingRule__NameAssignment_14798); 
             after(grammarAccess.getStartingRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__NameAssignment_1"


    // $ANTLR start "rule__StartingRule__TargetPatternAssignment_5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2435:1: rule__StartingRule__TargetPatternAssignment_5 : ( ruleTargetPattern ) ;
    public final void rule__StartingRule__TargetPatternAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2439:1: ( ( ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2440:1: ( ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2440:1: ( ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2441:1: ruleTargetPattern
            {
             before(grammarAccess.getStartingRuleAccess().getTargetPatternTargetPatternParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_rule__StartingRule__TargetPatternAssignment_54829);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getStartingRuleAccess().getTargetPatternTargetPatternParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingRule__TargetPatternAssignment_5"


    // $ANTLR start "rule__AccessRule__NameAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2450:1: rule__AccessRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AccessRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2454:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2455:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2455:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2456:1: RULE_ID
            {
             before(grammarAccess.getAccessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AccessRule__NameAssignment_14860); 
             after(grammarAccess.getAccessRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__NameAssignment_1"


    // $ANTLR start "rule__AccessRule__SourcePatternAssignment_4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2465:1: rule__AccessRule__SourcePatternAssignment_4 : ( ruleSourcePattern ) ;
    public final void rule__AccessRule__SourcePatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2469:1: ( ( ruleSourcePattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2470:1: ( ruleSourcePattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2470:1: ( ruleSourcePattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2471:1: ruleSourcePattern
            {
             before(grammarAccess.getAccessRuleAccess().getSourcePatternSourcePatternParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_rule__AccessRule__SourcePatternAssignment_44891);
            ruleSourcePattern();

            state._fsp--;

             after(grammarAccess.getAccessRuleAccess().getSourcePatternSourcePatternParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__SourcePatternAssignment_4"


    // $ANTLR start "rule__AccessRule__TargetPatternAssignment_6"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2480:1: rule__AccessRule__TargetPatternAssignment_6 : ( ruleTargetPattern ) ;
    public final void rule__AccessRule__TargetPatternAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2484:1: ( ( ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2485:1: ( ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2485:1: ( ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2486:1: ruleTargetPattern
            {
             before(grammarAccess.getAccessRuleAccess().getTargetPatternTargetPatternParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_rule__AccessRule__TargetPatternAssignment_64922);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getAccessRuleAccess().getTargetPatternTargetPatternParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__TargetPatternAssignment_6"


    // $ANTLR start "rule__AccessRule__RemoveTypeAssignment_7_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2495:1: rule__AccessRule__RemoveTypeAssignment_7_2 : ( ruleClassPatternExp ) ;
    public final void rule__AccessRule__RemoveTypeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2499:1: ( ( ruleClassPatternExp ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2500:1: ( ruleClassPatternExp )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2500:1: ( ruleClassPatternExp )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2501:1: ruleClassPatternExp
            {
             before(grammarAccess.getAccessRuleAccess().getRemoveTypeClassPatternExpParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleClassPatternExp_in_rule__AccessRule__RemoveTypeAssignment_7_24953);
            ruleClassPatternExp();

            state._fsp--;

             after(grammarAccess.getAccessRuleAccess().getRemoveTypeClassPatternExpParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessRule__RemoveTypeAssignment_7_2"


    // $ANTLR start "rule__SourcePattern__PatternAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2510:1: rule__SourcePattern__PatternAssignment_1 : ( ruleClassPatternExp ) ;
    public final void rule__SourcePattern__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2514:1: ( ( ruleClassPatternExp ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2515:1: ( ruleClassPatternExp )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2515:1: ( ruleClassPatternExp )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2516:1: ruleClassPatternExp
            {
             before(grammarAccess.getSourcePatternAccess().getPatternClassPatternExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassPatternExp_in_rule__SourcePattern__PatternAssignment_14984);
            ruleClassPatternExp();

            state._fsp--;

             after(grammarAccess.getSourcePatternAccess().getPatternClassPatternExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__PatternAssignment_1"


    // $ANTLR start "rule__SourcePattern__FilterAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2525:1: rule__SourcePattern__FilterAssignment_2 : ( ruleFilterPattern ) ;
    public final void rule__SourcePattern__FilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2529:1: ( ( ruleFilterPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2530:1: ( ruleFilterPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2530:1: ( ruleFilterPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2531:1: ruleFilterPattern
            {
             before(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_25015);
            ruleFilterPattern();

            state._fsp--;

             after(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourcePattern__FilterAssignment_2"


    // $ANTLR start "rule__FilterPattern__StringPatternAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2540:1: rule__FilterPattern__StringPatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FilterPattern__StringPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2544:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2545:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2545:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2546:1: RULE_STRING
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_15046); 
             after(grammarAccess.getFilterPatternAccess().getStringPatternSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPattern__StringPatternAssignment_1"


    // $ANTLR start "rule__TargetPattern__PatternAssignment"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2555:1: rule__TargetPattern__PatternAssignment : ( rulePatternExp2 ) ;
    public final void rule__TargetPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2559:1: ( ( rulePatternExp2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2560:1: ( rulePatternExp2 )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2560:1: ( rulePatternExp2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2561:1: rulePatternExp2
            {
             before(grammarAccess.getTargetPatternAccess().getPatternPatternExp2ParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePatternExp2_in_rule__TargetPattern__PatternAssignment5077);
            rulePatternExp2();

            state._fsp--;

             after(grammarAccess.getTargetPatternAccess().getPatternPatternExp2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPattern__PatternAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_entryRuleMetamodelImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__0_in_ruleMetamodelImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_entryRuleCache181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCache188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__0_in_ruleCache214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCacheProperties248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__0_in_ruleCacheProperties274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0_in_rulePlan334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterClause_in_entryRuleAfterClause361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterClause368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterClause__Group__0_in_ruleAfterClause394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartingRule_in_entryRuleStartingRule421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartingRule428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__0_in_ruleStartingRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessRule_in_entryRuleAccessRule481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessRule488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__0_in_ruleAccessRule514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourcePattern548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0_in_ruleSourcePattern574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0_in_ruleFilterPattern634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPattern668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__PatternAssignment_in_ruleTargetPattern694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp2_in_entryRulePatternExp2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternExp2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group__0_in_rulePatternExp2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassPatternExp_in_entryRuleClassPatternExp783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassPatternExp790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassPatternExp816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartingRule_in_rule__Plan__RulesAlternatives_5_0891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessRule_in_rule__Plan__RulesAlternatives_5_0908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_0__0_in_rule__PatternExp2__Alternatives_1_1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_1__0_in_rule__PatternExp2__Alternatives_1_1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CacheType__Alternatives992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CacheType__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01047 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_0_in_rule__Model__Group__0__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlansAssignment_1_in_rule__Model__Group__1__Impl1134 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__0__Impl_in_rule__MetamodelImport__Group__01169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__1_in_rule__MetamodelImport__Group__01172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetamodelImport__Group__0__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__1__Impl_in_rule__MetamodelImport__Group__11231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__NsURIAssignment_1_in_rule__MetamodelImport__Group__1__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01292 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cache__Group__0__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11354 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01478 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CacheProperties__Group__0__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11540 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CacheProperties__Group__1__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21602 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__SizeAssignment_2_in_rule__CacheProperties__Group__2__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31662 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__4_in_rule__CacheProperties__Group__31665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group_3__0_in_rule__CacheProperties__Group__3__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__4__Impl_in_rule__CacheProperties__Group__41723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CacheProperties__Group__4__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group_3__0__Impl_in_rule__CacheProperties__Group_3__01792 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group_3__1_in_rule__CacheProperties__Group_3__01795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CacheProperties__Group_3__0__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group_3__1__Impl_in_rule__CacheProperties__Group_3__11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__ChunkAssignment_3_1_in_rule__CacheProperties__Group_3__1__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Plan__Group__0__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11977 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__22037 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__22040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__32098 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__32101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Plan__Group__3__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__42160 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__42163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__CacheAssignment_4_in_rule__Plan__Group__4__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__52220 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Plan__Group__6_in_rule__Plan__Group__52223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__RulesAssignment_5_in_rule__Plan__Group__5__Impl2250 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Plan__Group__6__Impl_in_rule__Plan__Group__62281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Plan__Group__6__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterClause__Group__0__Impl_in_rule__AfterClause__Group__02354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AfterClause__Group__1_in_rule__AfterClause__Group__02357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AfterClause__Group__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterClause__Group__1__Impl_in_rule__AfterClause__Group__12416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterClause__PlanAssignment_1_in_rule__AfterClause__Group__1__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__0__Impl_in_rule__StartingRule__Group__02477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__1_in_rule__StartingRule__Group__02480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StartingRule__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__1__Impl_in_rule__StartingRule__Group__12539 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__2_in_rule__StartingRule__Group__12542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__NameAssignment_1_in_rule__StartingRule__Group__1__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__2__Impl_in_rule__StartingRule__Group__22599 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__3_in_rule__StartingRule__Group__22602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StartingRule__Group__2__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__3__Impl_in_rule__StartingRule__Group__32661 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__4_in_rule__StartingRule__Group__32664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StartingRule__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__4__Impl_in_rule__StartingRule__Group__42723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__5_in_rule__StartingRule__Group__42726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StartingRule__Group__4__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__5__Impl_in_rule__StartingRule__Group__52785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__TargetPatternAssignment_5_in_rule__StartingRule__Group__5__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__0__Impl_in_rule__AccessRule__Group__02854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__1_in_rule__AccessRule__Group__02857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AccessRule__Group__0__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__1__Impl_in_rule__AccessRule__Group__12916 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__2_in_rule__AccessRule__Group__12919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__NameAssignment_1_in_rule__AccessRule__Group__1__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__2__Impl_in_rule__AccessRule__Group__22976 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__3_in_rule__AccessRule__Group__22979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AccessRule__Group__2__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__3__Impl_in_rule__AccessRule__Group__33038 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__4_in_rule__AccessRule__Group__33041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AccessRule__Group__3__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__4__Impl_in_rule__AccessRule__Group__43100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__5_in_rule__AccessRule__Group__43103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__SourcePatternAssignment_4_in_rule__AccessRule__Group__4__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__5__Impl_in_rule__AccessRule__Group__53160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__6_in_rule__AccessRule__Group__53163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AccessRule__Group__5__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__6__Impl_in_rule__AccessRule__Group__63222 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__7_in_rule__AccessRule__Group__63225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__TargetPatternAssignment_6_in_rule__AccessRule__Group__6__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group__7__Impl_in_rule__AccessRule__Group__73282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group_7__0_in_rule__AccessRule__Group__7__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group_7__0__Impl_in_rule__AccessRule__Group_7__03356 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AccessRule__Group_7__1_in_rule__AccessRule__Group_7__03359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AccessRule__Group_7__0__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group_7__1__Impl_in_rule__AccessRule__Group_7__13418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AccessRule__Group_7__2_in_rule__AccessRule__Group_7__13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AccessRule__Group_7__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__Group_7__2__Impl_in_rule__AccessRule__Group_7__23480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessRule__RemoveTypeAssignment_7_2_in_rule__AccessRule__Group_7__2__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__03543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__03546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SourcePattern__Group__0__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__13605 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__2_in_rule__SourcePattern__Group__13608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__PatternAssignment_1_in_rule__SourcePattern__Group__1__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__2__Impl_in_rule__SourcePattern__Group__23665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__FilterAssignment_2_in_rule__SourcePattern__Group__2__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__03729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__03732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FilterPattern__Group__0__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13791 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FilterPattern__Group__2__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group__0__Impl_in_rule__PatternExp2__Group__03918 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group__1_in_rule__PatternExp2__Group__03921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternExp2__Group__0__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group__1__Impl_in_rule__PatternExp2__Group__13977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1__0_in_rule__PatternExp2__Group__1__Impl4004 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1__0__Impl_in_rule__PatternExp2__Group_1__04039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1__1_in_rule__PatternExp2__Group_1__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PatternExp2__Group_1__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1__1__Impl_in_rule__PatternExp2__Group_1__14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Alternatives_1_1_in_rule__PatternExp2__Group_1__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_0__0__Impl_in_rule__PatternExp2__Group_1_1_0__04162 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_0__1_in_rule__PatternExp2__Group_1_1_0__04165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternExp2__Group_1_1_0__0__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_0__1__Impl_in_rule__PatternExp2__Group_1_1_0__14221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PatternExp2__Group_1_1_0__1__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_1__0__Impl_in_rule__PatternExp2__Group_1_1_1__04284 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_1__1_in_rule__PatternExp2__Group_1_1_1__04287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternExp2__Group_1_1_1__0__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp2__Group_1_1_1__1__Impl_in_rule__PatternExp2__Group_1_1_1__14343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PatternExp2__Group_1_1_1__1__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_rule__Model__MetamodelAssignment_04416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_rule__Model__PlansAssignment_14447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelImport__NsURIAssignment_14478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_14509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_24540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_24571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CacheProperties__ChunkAssignment_3_14602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_14633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterClause_in_rule__Plan__AfterAssignment_24664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_rule__Plan__CacheAssignment_44695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__RulesAlternatives_5_0_in_rule__Plan__RulesAssignment_54726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AfterClause__PlanAssignment_14763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartingRule__NameAssignment_14798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_rule__StartingRule__TargetPatternAssignment_54829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AccessRule__NameAssignment_14860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_rule__AccessRule__SourcePatternAssignment_44891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_rule__AccessRule__TargetPatternAssignment_64922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassPatternExp_in_rule__AccessRule__RemoveTypeAssignment_7_24953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassPatternExp_in_rule__SourcePattern__PatternAssignment_14984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_25015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_15046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp2_in_rule__TargetPattern__PatternAssignment5077 = new BitSet(new long[]{0x0000000000000002L});

}