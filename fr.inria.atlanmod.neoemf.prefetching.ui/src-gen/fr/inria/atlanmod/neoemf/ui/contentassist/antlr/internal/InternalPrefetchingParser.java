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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LRU'", "'Predictive'", "'import'", "'use cache'", "'['", "'size'", "']'", "'plan'", "'{'", "'}'", "'after'", "'on starting'", "'fetch'", "'%'", "'on loading'", "'.'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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


    // $ANTLR start "entryRuleLoadingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:256:1: entryRuleLoadingRule : ruleLoadingRule EOF ;
    public final void entryRuleLoadingRule() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:257:1: ( ruleLoadingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:258:1: ruleLoadingRule EOF
            {
             before(grammarAccess.getLoadingRuleRule()); 
            pushFollow(FOLLOW_ruleLoadingRule_in_entryRuleLoadingRule481);
            ruleLoadingRule();

            state._fsp--;

             after(grammarAccess.getLoadingRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadingRule488); 

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
    // $ANTLR end "entryRuleLoadingRule"


    // $ANTLR start "ruleLoadingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:265:1: ruleLoadingRule : ( ( rule__LoadingRule__Group__0 ) ) ;
    public final void ruleLoadingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:269:2: ( ( ( rule__LoadingRule__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__LoadingRule__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__LoadingRule__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:271:1: ( rule__LoadingRule__Group__0 )
            {
             before(grammarAccess.getLoadingRuleAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:1: ( rule__LoadingRule__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:2: rule__LoadingRule__Group__0
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group__0_in_ruleLoadingRule514);
            rule__LoadingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadingRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleLoadingRule"


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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:349:1: ruleTargetPattern : ( ( rule__TargetPattern__Group__0 ) ) ;
    public final void ruleTargetPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:353:2: ( ( ( rule__TargetPattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:354:1: ( ( rule__TargetPattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:354:1: ( ( rule__TargetPattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:355:1: ( rule__TargetPattern__Group__0 )
            {
             before(grammarAccess.getTargetPatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:356:1: ( rule__TargetPattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:356:2: rule__TargetPattern__Group__0
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__0_in_ruleTargetPattern694);
            rule__TargetPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetPatternAccess().getGroup()); 

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


    // $ANTLR start "entryRulePatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:368:1: entryRulePatternExp : rulePatternExp EOF ;
    public final void entryRulePatternExp() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:369:1: ( rulePatternExp EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:370:1: rulePatternExp EOF
            {
             before(grammarAccess.getPatternExpRule()); 
            pushFollow(FOLLOW_rulePatternExp_in_entryRulePatternExp721);
            rulePatternExp();

            state._fsp--;

             after(grammarAccess.getPatternExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternExp728); 

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
    // $ANTLR end "entryRulePatternExp"


    // $ANTLR start "rulePatternExp"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:377:1: rulePatternExp : ( ( rule__PatternExp__Group__0 ) ) ;
    public final void rulePatternExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:381:2: ( ( ( rule__PatternExp__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:382:1: ( ( rule__PatternExp__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:382:1: ( ( rule__PatternExp__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:383:1: ( rule__PatternExp__Group__0 )
            {
             before(grammarAccess.getPatternExpAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:384:1: ( rule__PatternExp__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:384:2: rule__PatternExp__Group__0
            {
            pushFollow(FOLLOW_rule__PatternExp__Group__0_in_rulePatternExp754);
            rule__PatternExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternExpAccess().getGroup()); 

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
    // $ANTLR end "rulePatternExp"


    // $ANTLR start "ruleCacheType"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:399:1: ruleCacheType : ( ( rule__CacheType__Alternatives ) ) ;
    public final void ruleCacheType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:403:1: ( ( ( rule__CacheType__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:404:1: ( ( rule__CacheType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:404:1: ( ( rule__CacheType__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:405:1: ( rule__CacheType__Alternatives )
            {
             before(grammarAccess.getCacheTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:406:1: ( rule__CacheType__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:406:2: rule__CacheType__Alternatives
            {
            pushFollow(FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType793);
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


    // $ANTLR start "rule__Plan__RulesAlternatives_4_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:421:1: rule__Plan__RulesAlternatives_4_0 : ( ( ruleStartingRule ) | ( ruleLoadingRule ) );
    public final void rule__Plan__RulesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:425:1: ( ( ruleStartingRule ) | ( ruleLoadingRule ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:426:1: ( ruleStartingRule )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:426:1: ( ruleStartingRule )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:427:1: ruleStartingRule
                    {
                     before(grammarAccess.getPlanAccess().getRulesStartingRuleParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_ruleStartingRule_in_rule__Plan__RulesAlternatives_4_0832);
                    ruleStartingRule();

                    state._fsp--;

                     after(grammarAccess.getPlanAccess().getRulesStartingRuleParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:432:6: ( ruleLoadingRule )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:432:6: ( ruleLoadingRule )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:433:1: ruleLoadingRule
                    {
                     before(grammarAccess.getPlanAccess().getRulesLoadingRuleParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_ruleLoadingRule_in_rule__Plan__RulesAlternatives_4_0849);
                    ruleLoadingRule();

                    state._fsp--;

                     after(grammarAccess.getPlanAccess().getRulesLoadingRuleParserRuleCall_4_0_1()); 

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
    // $ANTLR end "rule__Plan__RulesAlternatives_4_0"


    // $ANTLR start "rule__CacheType__Alternatives"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:443:1: rule__CacheType__Alternatives : ( ( ( 'LRU' ) ) | ( ( 'Predictive' ) ) );
    public final void rule__CacheType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:447:1: ( ( ( 'LRU' ) ) | ( ( 'Predictive' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:448:1: ( ( 'LRU' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:448:1: ( ( 'LRU' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:449:1: ( 'LRU' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:450:1: ( 'LRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:450:3: 'LRU'
                    {
                    match(input,11,FOLLOW_11_in_rule__CacheType__Alternatives882); 

                    }

                     after(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:455:6: ( ( 'Predictive' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:455:6: ( ( 'Predictive' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:456:1: ( 'Predictive' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getPREDICTIVEEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:457:1: ( 'Predictive' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:457:3: 'Predictive'
                    {
                    match(input,12,FOLLOW_12_in_rule__CacheType__Alternatives903); 

                    }

                     after(grammarAccess.getCacheTypeAccess().getPREDICTIVEEnumLiteralDeclaration_1()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:471:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:475:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:476:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0938);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0941);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:483:1: rule__Model__Group__0__Impl : ( ( rule__Model__MetamodelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:487:1: ( ( ( rule__Model__MetamodelAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:488:1: ( ( rule__Model__MetamodelAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:488:1: ( ( rule__Model__MetamodelAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:489:1: ( rule__Model__MetamodelAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:490:1: ( rule__Model__MetamodelAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:490:2: rule__Model__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_0_in_rule__Model__Group__0__Impl968);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:500:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:504:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:505:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1998);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11001);
            rule__Model__Group__2();

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:512:1: rule__Model__Group__1__Impl : ( ( rule__Model__CacheAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:516:1: ( ( ( rule__Model__CacheAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:517:1: ( ( rule__Model__CacheAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:517:1: ( ( rule__Model__CacheAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:518:1: ( rule__Model__CacheAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getCacheAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:519:1: ( rule__Model__CacheAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:519:2: rule__Model__CacheAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__CacheAssignment_1_in_rule__Model__Group__1__Impl1028);
            rule__Model__CacheAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getCacheAssignment_1()); 

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


    // $ANTLR start "rule__Model__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:529:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:533:1: ( rule__Model__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:534:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21058);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:540:1: rule__Model__Group__2__Impl : ( ( rule__Model__PlansAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:544:1: ( ( ( rule__Model__PlansAssignment_2 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:545:1: ( ( rule__Model__PlansAssignment_2 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:545:1: ( ( rule__Model__PlansAssignment_2 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:546:1: ( rule__Model__PlansAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getPlansAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:547:1: ( rule__Model__PlansAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:547:2: rule__Model__PlansAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PlansAssignment_2_in_rule__Model__Group__2__Impl1085);
            	    rule__Model__PlansAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPlansAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__MetamodelImport__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:563:1: rule__MetamodelImport__Group__0 : rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1 ;
    public final void rule__MetamodelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:567:1: ( rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:568:2: rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelImport__Group__0__Impl_in_rule__MetamodelImport__Group__01122);
            rule__MetamodelImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelImport__Group__1_in_rule__MetamodelImport__Group__01125);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:575:1: rule__MetamodelImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__MetamodelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:579:1: ( ( 'import' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:580:1: ( 'import' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:580:1: ( 'import' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:581:1: 'import'
            {
             before(grammarAccess.getMetamodelImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__MetamodelImport__Group__0__Impl1153); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:594:1: rule__MetamodelImport__Group__1 : rule__MetamodelImport__Group__1__Impl ;
    public final void rule__MetamodelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:598:1: ( rule__MetamodelImport__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:599:2: rule__MetamodelImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelImport__Group__1__Impl_in_rule__MetamodelImport__Group__11184);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:605:1: rule__MetamodelImport__Group__1__Impl : ( ( rule__MetamodelImport__NsURIAssignment_1 ) ) ;
    public final void rule__MetamodelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:609:1: ( ( ( rule__MetamodelImport__NsURIAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:610:1: ( ( rule__MetamodelImport__NsURIAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:610:1: ( ( rule__MetamodelImport__NsURIAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:611:1: ( rule__MetamodelImport__NsURIAssignment_1 )
            {
             before(grammarAccess.getMetamodelImportAccess().getNsURIAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:612:1: ( rule__MetamodelImport__NsURIAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:612:2: rule__MetamodelImport__NsURIAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelImport__NsURIAssignment_1_in_rule__MetamodelImport__Group__1__Impl1211);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:626:1: rule__Cache__Group__0 : rule__Cache__Group__0__Impl rule__Cache__Group__1 ;
    public final void rule__Cache__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:630:1: ( rule__Cache__Group__0__Impl rule__Cache__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:631:2: rule__Cache__Group__0__Impl rule__Cache__Group__1
            {
            pushFollow(FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01245);
            rule__Cache__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01248);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:638:1: rule__Cache__Group__0__Impl : ( 'use cache' ) ;
    public final void rule__Cache__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:642:1: ( ( 'use cache' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:643:1: ( 'use cache' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:643:1: ( 'use cache' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:644:1: 'use cache'
            {
             before(grammarAccess.getCacheAccess().getUseCacheKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Cache__Group__0__Impl1276); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:657:1: rule__Cache__Group__1 : rule__Cache__Group__1__Impl rule__Cache__Group__2 ;
    public final void rule__Cache__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:661:1: ( rule__Cache__Group__1__Impl rule__Cache__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:662:2: rule__Cache__Group__1__Impl rule__Cache__Group__2
            {
            pushFollow(FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11307);
            rule__Cache__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11310);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:669:1: rule__Cache__Group__1__Impl : ( ( rule__Cache__TypeAssignment_1 ) ) ;
    public final void rule__Cache__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:673:1: ( ( ( rule__Cache__TypeAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:674:1: ( ( rule__Cache__TypeAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:674:1: ( ( rule__Cache__TypeAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:675:1: ( rule__Cache__TypeAssignment_1 )
            {
             before(grammarAccess.getCacheAccess().getTypeAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:676:1: ( rule__Cache__TypeAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:676:2: rule__Cache__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1337);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:686:1: rule__Cache__Group__2 : rule__Cache__Group__2__Impl ;
    public final void rule__Cache__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:690:1: ( rule__Cache__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:691:2: rule__Cache__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21367);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:697:1: rule__Cache__Group__2__Impl : ( ( rule__Cache__PropertiesAssignment_2 )? ) ;
    public final void rule__Cache__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:701:1: ( ( ( rule__Cache__PropertiesAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:702:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:702:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:703:1: ( rule__Cache__PropertiesAssignment_2 )?
            {
             before(grammarAccess.getCacheAccess().getPropertiesAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:704:1: ( rule__Cache__PropertiesAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:704:2: rule__Cache__PropertiesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1394);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:720:1: rule__CacheProperties__Group__0 : rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 ;
    public final void rule__CacheProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:724:1: ( rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:725:2: rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01431);
            rule__CacheProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01434);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:732:1: rule__CacheProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__CacheProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:736:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:737:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:737:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:738:1: '['
            {
             before(grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__CacheProperties__Group__0__Impl1462); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:751:1: rule__CacheProperties__Group__1 : rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 ;
    public final void rule__CacheProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:755:1: ( rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:756:2: rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11493);
            rule__CacheProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11496);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:763:1: rule__CacheProperties__Group__1__Impl : ( 'size' ) ;
    public final void rule__CacheProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:767:1: ( ( 'size' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:768:1: ( 'size' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:768:1: ( 'size' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:769:1: 'size'
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__CacheProperties__Group__1__Impl1524); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:782:1: rule__CacheProperties__Group__2 : rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 ;
    public final void rule__CacheProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:786:1: ( rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:787:2: rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21555);
            rule__CacheProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21558);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:794:1: rule__CacheProperties__Group__2__Impl : ( ( rule__CacheProperties__SizeAssignment_2 ) ) ;
    public final void rule__CacheProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:798:1: ( ( ( rule__CacheProperties__SizeAssignment_2 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:799:1: ( ( rule__CacheProperties__SizeAssignment_2 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:799:1: ( ( rule__CacheProperties__SizeAssignment_2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:800:1: ( rule__CacheProperties__SizeAssignment_2 )
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:801:1: ( rule__CacheProperties__SizeAssignment_2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:801:2: rule__CacheProperties__SizeAssignment_2
            {
            pushFollow(FOLLOW_rule__CacheProperties__SizeAssignment_2_in_rule__CacheProperties__Group__2__Impl1585);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:811:1: rule__CacheProperties__Group__3 : rule__CacheProperties__Group__3__Impl ;
    public final void rule__CacheProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:815:1: ( rule__CacheProperties__Group__3__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:816:2: rule__CacheProperties__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31615);
            rule__CacheProperties__Group__3__Impl();

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:822:1: rule__CacheProperties__Group__3__Impl : ( ']' ) ;
    public final void rule__CacheProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:826:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:827:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:827:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:828:1: ']'
            {
             before(grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__CacheProperties__Group__3__Impl1643); 
             after(grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_3()); 

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


    // $ANTLR start "rule__Plan__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:849:1: rule__Plan__Group__0 : rule__Plan__Group__0__Impl rule__Plan__Group__1 ;
    public final void rule__Plan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:853:1: ( rule__Plan__Group__0__Impl rule__Plan__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:854:2: rule__Plan__Group__0__Impl rule__Plan__Group__1
            {
            pushFollow(FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01682);
            rule__Plan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01685);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:861:1: rule__Plan__Group__0__Impl : ( 'plan' ) ;
    public final void rule__Plan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:865:1: ( ( 'plan' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:866:1: ( 'plan' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:866:1: ( 'plan' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:867:1: 'plan'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Plan__Group__0__Impl1713); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:880:1: rule__Plan__Group__1 : rule__Plan__Group__1__Impl rule__Plan__Group__2 ;
    public final void rule__Plan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:884:1: ( rule__Plan__Group__1__Impl rule__Plan__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:885:2: rule__Plan__Group__1__Impl rule__Plan__Group__2
            {
            pushFollow(FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11744);
            rule__Plan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11747);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:892:1: rule__Plan__Group__1__Impl : ( ( rule__Plan__NameAssignment_1 ) ) ;
    public final void rule__Plan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:896:1: ( ( ( rule__Plan__NameAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:897:1: ( ( rule__Plan__NameAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:897:1: ( ( rule__Plan__NameAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:898:1: ( rule__Plan__NameAssignment_1 )
            {
             before(grammarAccess.getPlanAccess().getNameAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:899:1: ( rule__Plan__NameAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:899:2: rule__Plan__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl1774);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:909:1: rule__Plan__Group__2 : rule__Plan__Group__2__Impl rule__Plan__Group__3 ;
    public final void rule__Plan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:913:1: ( rule__Plan__Group__2__Impl rule__Plan__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:914:2: rule__Plan__Group__2__Impl rule__Plan__Group__3
            {
            pushFollow(FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__21804);
            rule__Plan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__21807);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:921:1: rule__Plan__Group__2__Impl : ( ( rule__Plan__AfterAssignment_2 )? ) ;
    public final void rule__Plan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:925:1: ( ( ( rule__Plan__AfterAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:926:1: ( ( rule__Plan__AfterAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:926:1: ( ( rule__Plan__AfterAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:927:1: ( rule__Plan__AfterAssignment_2 )?
            {
             before(grammarAccess.getPlanAccess().getAfterAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:928:1: ( rule__Plan__AfterAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:928:2: rule__Plan__AfterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl1834);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:938:1: rule__Plan__Group__3 : rule__Plan__Group__3__Impl rule__Plan__Group__4 ;
    public final void rule__Plan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:942:1: ( rule__Plan__Group__3__Impl rule__Plan__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:943:2: rule__Plan__Group__3__Impl rule__Plan__Group__4
            {
            pushFollow(FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__31865);
            rule__Plan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__31868);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:950:1: rule__Plan__Group__3__Impl : ( '{' ) ;
    public final void rule__Plan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:954:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:955:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:955:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:956:1: '{'
            {
             before(grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Plan__Group__3__Impl1896); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:969:1: rule__Plan__Group__4 : rule__Plan__Group__4__Impl rule__Plan__Group__5 ;
    public final void rule__Plan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:973:1: ( rule__Plan__Group__4__Impl rule__Plan__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:974:2: rule__Plan__Group__4__Impl rule__Plan__Group__5
            {
            pushFollow(FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__41927);
            rule__Plan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__41930);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:981:1: rule__Plan__Group__4__Impl : ( ( rule__Plan__RulesAssignment_4 )* ) ;
    public final void rule__Plan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:985:1: ( ( ( rule__Plan__RulesAssignment_4 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:986:1: ( ( rule__Plan__RulesAssignment_4 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:986:1: ( ( rule__Plan__RulesAssignment_4 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:987:1: ( rule__Plan__RulesAssignment_4 )*
            {
             before(grammarAccess.getPlanAccess().getRulesAssignment_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:988:1: ( rule__Plan__RulesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:988:2: rule__Plan__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Plan__RulesAssignment_4_in_rule__Plan__Group__4__Impl1957);
            	    rule__Plan__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPlanAccess().getRulesAssignment_4()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:998:1: rule__Plan__Group__5 : rule__Plan__Group__5__Impl ;
    public final void rule__Plan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1002:1: ( rule__Plan__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1003:2: rule__Plan__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__51988);
            rule__Plan__Group__5__Impl();

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1009:1: rule__Plan__Group__5__Impl : ( '}' ) ;
    public final void rule__Plan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1013:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1014:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1014:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1015:1: '}'
            {
             before(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Plan__Group__5__Impl2016); 
             after(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__AfterClause__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1040:1: rule__AfterClause__Group__0 : rule__AfterClause__Group__0__Impl rule__AfterClause__Group__1 ;
    public final void rule__AfterClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1044:1: ( rule__AfterClause__Group__0__Impl rule__AfterClause__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1045:2: rule__AfterClause__Group__0__Impl rule__AfterClause__Group__1
            {
            pushFollow(FOLLOW_rule__AfterClause__Group__0__Impl_in_rule__AfterClause__Group__02059);
            rule__AfterClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AfterClause__Group__1_in_rule__AfterClause__Group__02062);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1052:1: rule__AfterClause__Group__0__Impl : ( 'after' ) ;
    public final void rule__AfterClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1056:1: ( ( 'after' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1057:1: ( 'after' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1057:1: ( 'after' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1058:1: 'after'
            {
             before(grammarAccess.getAfterClauseAccess().getAfterKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__AfterClause__Group__0__Impl2090); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1071:1: rule__AfterClause__Group__1 : rule__AfterClause__Group__1__Impl ;
    public final void rule__AfterClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1075:1: ( rule__AfterClause__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1076:2: rule__AfterClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AfterClause__Group__1__Impl_in_rule__AfterClause__Group__12121);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1082:1: rule__AfterClause__Group__1__Impl : ( ( rule__AfterClause__PlanAssignment_1 ) ) ;
    public final void rule__AfterClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1086:1: ( ( ( rule__AfterClause__PlanAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1087:1: ( ( rule__AfterClause__PlanAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1087:1: ( ( rule__AfterClause__PlanAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1088:1: ( rule__AfterClause__PlanAssignment_1 )
            {
             before(grammarAccess.getAfterClauseAccess().getPlanAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1089:1: ( rule__AfterClause__PlanAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1089:2: rule__AfterClause__PlanAssignment_1
            {
            pushFollow(FOLLOW_rule__AfterClause__PlanAssignment_1_in_rule__AfterClause__Group__1__Impl2148);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1103:1: rule__StartingRule__Group__0 : rule__StartingRule__Group__0__Impl rule__StartingRule__Group__1 ;
    public final void rule__StartingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1107:1: ( rule__StartingRule__Group__0__Impl rule__StartingRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1108:2: rule__StartingRule__Group__0__Impl rule__StartingRule__Group__1
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__0__Impl_in_rule__StartingRule__Group__02182);
            rule__StartingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__1_in_rule__StartingRule__Group__02185);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1115:1: rule__StartingRule__Group__0__Impl : ( 'on starting' ) ;
    public final void rule__StartingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1119:1: ( ( 'on starting' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1120:1: ( 'on starting' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1120:1: ( 'on starting' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1121:1: 'on starting'
            {
             before(grammarAccess.getStartingRuleAccess().getOnStartingKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__StartingRule__Group__0__Impl2213); 
             after(grammarAccess.getStartingRuleAccess().getOnStartingKeyword_0()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1134:1: rule__StartingRule__Group__1 : rule__StartingRule__Group__1__Impl rule__StartingRule__Group__2 ;
    public final void rule__StartingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1138:1: ( rule__StartingRule__Group__1__Impl rule__StartingRule__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1139:2: rule__StartingRule__Group__1__Impl rule__StartingRule__Group__2
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__1__Impl_in_rule__StartingRule__Group__12244);
            rule__StartingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__2_in_rule__StartingRule__Group__12247);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1146:1: rule__StartingRule__Group__1__Impl : ( 'fetch' ) ;
    public final void rule__StartingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1150:1: ( ( 'fetch' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1151:1: ( 'fetch' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1151:1: ( 'fetch' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1152:1: 'fetch'
            {
             before(grammarAccess.getStartingRuleAccess().getFetchKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__StartingRule__Group__1__Impl2275); 
             after(grammarAccess.getStartingRuleAccess().getFetchKeyword_1()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1165:1: rule__StartingRule__Group__2 : rule__StartingRule__Group__2__Impl rule__StartingRule__Group__3 ;
    public final void rule__StartingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1169:1: ( rule__StartingRule__Group__2__Impl rule__StartingRule__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1170:2: rule__StartingRule__Group__2__Impl rule__StartingRule__Group__3
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__2__Impl_in_rule__StartingRule__Group__22306);
            rule__StartingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__3_in_rule__StartingRule__Group__22309);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1177:1: rule__StartingRule__Group__2__Impl : ( ( rule__StartingRule__TargetPatternAssignment_2 ) ) ;
    public final void rule__StartingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1181:1: ( ( ( rule__StartingRule__TargetPatternAssignment_2 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1182:1: ( ( rule__StartingRule__TargetPatternAssignment_2 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1182:1: ( ( rule__StartingRule__TargetPatternAssignment_2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1183:1: ( rule__StartingRule__TargetPatternAssignment_2 )
            {
             before(grammarAccess.getStartingRuleAccess().getTargetPatternAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1184:1: ( rule__StartingRule__TargetPatternAssignment_2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1184:2: rule__StartingRule__TargetPatternAssignment_2
            {
            pushFollow(FOLLOW_rule__StartingRule__TargetPatternAssignment_2_in_rule__StartingRule__Group__2__Impl2336);
            rule__StartingRule__TargetPatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartingRuleAccess().getTargetPatternAssignment_2()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1194:1: rule__StartingRule__Group__3 : rule__StartingRule__Group__3__Impl rule__StartingRule__Group__4 ;
    public final void rule__StartingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1198:1: ( rule__StartingRule__Group__3__Impl rule__StartingRule__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1199:2: rule__StartingRule__Group__3__Impl rule__StartingRule__Group__4
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__3__Impl_in_rule__StartingRule__Group__32366);
            rule__StartingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group__4_in_rule__StartingRule__Group__32369);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1206:1: rule__StartingRule__Group__3__Impl : ( ( rule__StartingRule__Group_3__0 )? ) ;
    public final void rule__StartingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1210:1: ( ( ( rule__StartingRule__Group_3__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1211:1: ( ( rule__StartingRule__Group_3__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1211:1: ( ( rule__StartingRule__Group_3__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1212:1: ( rule__StartingRule__Group_3__0 )?
            {
             before(grammarAccess.getStartingRuleAccess().getGroup_3()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1213:1: ( rule__StartingRule__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1213:2: rule__StartingRule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StartingRule__Group_3__0_in_rule__StartingRule__Group__3__Impl2396);
                    rule__StartingRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartingRuleAccess().getGroup_3()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1223:1: rule__StartingRule__Group__4 : rule__StartingRule__Group__4__Impl ;
    public final void rule__StartingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1227:1: ( rule__StartingRule__Group__4__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1228:2: rule__StartingRule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StartingRule__Group__4__Impl_in_rule__StartingRule__Group__42427);
            rule__StartingRule__Group__4__Impl();

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1234:1: rule__StartingRule__Group__4__Impl : ( ( rule__StartingRule__Group_4__0 ) ) ;
    public final void rule__StartingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1238:1: ( ( ( rule__StartingRule__Group_4__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1239:1: ( ( rule__StartingRule__Group_4__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1239:1: ( ( rule__StartingRule__Group_4__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1240:1: ( rule__StartingRule__Group_4__0 )
            {
             before(grammarAccess.getStartingRuleAccess().getGroup_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1241:1: ( rule__StartingRule__Group_4__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1241:2: rule__StartingRule__Group_4__0
            {
            pushFollow(FOLLOW_rule__StartingRule__Group_4__0_in_rule__StartingRule__Group__4__Impl2454);
            rule__StartingRule__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStartingRuleAccess().getGroup_4()); 

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


    // $ANTLR start "rule__StartingRule__Group_3__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1261:1: rule__StartingRule__Group_3__0 : rule__StartingRule__Group_3__0__Impl rule__StartingRule__Group_3__1 ;
    public final void rule__StartingRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1265:1: ( rule__StartingRule__Group_3__0__Impl rule__StartingRule__Group_3__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1266:2: rule__StartingRule__Group_3__0__Impl rule__StartingRule__Group_3__1
            {
            pushFollow(FOLLOW_rule__StartingRule__Group_3__0__Impl_in_rule__StartingRule__Group_3__02494);
            rule__StartingRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group_3__1_in_rule__StartingRule__Group_3__02497);
            rule__StartingRule__Group_3__1();

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
    // $ANTLR end "rule__StartingRule__Group_3__0"


    // $ANTLR start "rule__StartingRule__Group_3__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1273:1: rule__StartingRule__Group_3__0__Impl : ( ( rule__StartingRule__ProbabilityAssignment_3_0 ) ) ;
    public final void rule__StartingRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1277:1: ( ( ( rule__StartingRule__ProbabilityAssignment_3_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1278:1: ( ( rule__StartingRule__ProbabilityAssignment_3_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1278:1: ( ( rule__StartingRule__ProbabilityAssignment_3_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1279:1: ( rule__StartingRule__ProbabilityAssignment_3_0 )
            {
             before(grammarAccess.getStartingRuleAccess().getProbabilityAssignment_3_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1280:1: ( rule__StartingRule__ProbabilityAssignment_3_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1280:2: rule__StartingRule__ProbabilityAssignment_3_0
            {
            pushFollow(FOLLOW_rule__StartingRule__ProbabilityAssignment_3_0_in_rule__StartingRule__Group_3__0__Impl2524);
            rule__StartingRule__ProbabilityAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStartingRuleAccess().getProbabilityAssignment_3_0()); 

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
    // $ANTLR end "rule__StartingRule__Group_3__0__Impl"


    // $ANTLR start "rule__StartingRule__Group_3__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1290:1: rule__StartingRule__Group_3__1 : rule__StartingRule__Group_3__1__Impl ;
    public final void rule__StartingRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1294:1: ( rule__StartingRule__Group_3__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1295:2: rule__StartingRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__StartingRule__Group_3__1__Impl_in_rule__StartingRule__Group_3__12554);
            rule__StartingRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__StartingRule__Group_3__1"


    // $ANTLR start "rule__StartingRule__Group_3__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1301:1: rule__StartingRule__Group_3__1__Impl : ( '%' ) ;
    public final void rule__StartingRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1305:1: ( ( '%' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1306:1: ( '%' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1306:1: ( '%' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1307:1: '%'
            {
             before(grammarAccess.getStartingRuleAccess().getPercentSignKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__StartingRule__Group_3__1__Impl2582); 
             after(grammarAccess.getStartingRuleAccess().getPercentSignKeyword_3_1()); 

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
    // $ANTLR end "rule__StartingRule__Group_3__1__Impl"


    // $ANTLR start "rule__StartingRule__Group_4__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1324:1: rule__StartingRule__Group_4__0 : rule__StartingRule__Group_4__0__Impl rule__StartingRule__Group_4__1 ;
    public final void rule__StartingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1328:1: ( rule__StartingRule__Group_4__0__Impl rule__StartingRule__Group_4__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1329:2: rule__StartingRule__Group_4__0__Impl rule__StartingRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__StartingRule__Group_4__0__Impl_in_rule__StartingRule__Group_4__02617);
            rule__StartingRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group_4__1_in_rule__StartingRule__Group_4__02620);
            rule__StartingRule__Group_4__1();

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
    // $ANTLR end "rule__StartingRule__Group_4__0"


    // $ANTLR start "rule__StartingRule__Group_4__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1336:1: rule__StartingRule__Group_4__0__Impl : ( '{' ) ;
    public final void rule__StartingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1340:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1341:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1341:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1342:1: '{'
            {
             before(grammarAccess.getStartingRuleAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__StartingRule__Group_4__0__Impl2648); 
             after(grammarAccess.getStartingRuleAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__StartingRule__Group_4__0__Impl"


    // $ANTLR start "rule__StartingRule__Group_4__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1355:1: rule__StartingRule__Group_4__1 : rule__StartingRule__Group_4__1__Impl rule__StartingRule__Group_4__2 ;
    public final void rule__StartingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1359:1: ( rule__StartingRule__Group_4__1__Impl rule__StartingRule__Group_4__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1360:2: rule__StartingRule__Group_4__1__Impl rule__StartingRule__Group_4__2
            {
            pushFollow(FOLLOW_rule__StartingRule__Group_4__1__Impl_in_rule__StartingRule__Group_4__12679);
            rule__StartingRule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartingRule__Group_4__2_in_rule__StartingRule__Group_4__12682);
            rule__StartingRule__Group_4__2();

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
    // $ANTLR end "rule__StartingRule__Group_4__1"


    // $ANTLR start "rule__StartingRule__Group_4__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1367:1: rule__StartingRule__Group_4__1__Impl : ( ( rule__StartingRule__SubRulesAssignment_4_1 )* ) ;
    public final void rule__StartingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1371:1: ( ( ( rule__StartingRule__SubRulesAssignment_4_1 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1372:1: ( ( rule__StartingRule__SubRulesAssignment_4_1 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1372:1: ( ( rule__StartingRule__SubRulesAssignment_4_1 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1373:1: ( rule__StartingRule__SubRulesAssignment_4_1 )*
            {
             before(grammarAccess.getStartingRuleAccess().getSubRulesAssignment_4_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1374:1: ( rule__StartingRule__SubRulesAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1374:2: rule__StartingRule__SubRulesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__StartingRule__SubRulesAssignment_4_1_in_rule__StartingRule__Group_4__1__Impl2709);
            	    rule__StartingRule__SubRulesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStartingRuleAccess().getSubRulesAssignment_4_1()); 

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
    // $ANTLR end "rule__StartingRule__Group_4__1__Impl"


    // $ANTLR start "rule__StartingRule__Group_4__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1384:1: rule__StartingRule__Group_4__2 : rule__StartingRule__Group_4__2__Impl ;
    public final void rule__StartingRule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1388:1: ( rule__StartingRule__Group_4__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1389:2: rule__StartingRule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__StartingRule__Group_4__2__Impl_in_rule__StartingRule__Group_4__22740);
            rule__StartingRule__Group_4__2__Impl();

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
    // $ANTLR end "rule__StartingRule__Group_4__2"


    // $ANTLR start "rule__StartingRule__Group_4__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1395:1: rule__StartingRule__Group_4__2__Impl : ( '}' ) ;
    public final void rule__StartingRule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1399:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1400:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1400:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1401:1: '}'
            {
             before(grammarAccess.getStartingRuleAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,20,FOLLOW_20_in_rule__StartingRule__Group_4__2__Impl2768); 
             after(grammarAccess.getStartingRuleAccess().getRightCurlyBracketKeyword_4_2()); 

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
    // $ANTLR end "rule__StartingRule__Group_4__2__Impl"


    // $ANTLR start "rule__LoadingRule__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1420:1: rule__LoadingRule__Group__0 : rule__LoadingRule__Group__0__Impl rule__LoadingRule__Group__1 ;
    public final void rule__LoadingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1424:1: ( rule__LoadingRule__Group__0__Impl rule__LoadingRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1425:2: rule__LoadingRule__Group__0__Impl rule__LoadingRule__Group__1
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group__0__Impl_in_rule__LoadingRule__Group__02805);
            rule__LoadingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group__1_in_rule__LoadingRule__Group__02808);
            rule__LoadingRule__Group__1();

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
    // $ANTLR end "rule__LoadingRule__Group__0"


    // $ANTLR start "rule__LoadingRule__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1432:1: rule__LoadingRule__Group__0__Impl : ( 'on loading' ) ;
    public final void rule__LoadingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1436:1: ( ( 'on loading' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1437:1: ( 'on loading' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1437:1: ( 'on loading' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1438:1: 'on loading'
            {
             before(grammarAccess.getLoadingRuleAccess().getOnLoadingKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__LoadingRule__Group__0__Impl2836); 
             after(grammarAccess.getLoadingRuleAccess().getOnLoadingKeyword_0()); 

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
    // $ANTLR end "rule__LoadingRule__Group__0__Impl"


    // $ANTLR start "rule__LoadingRule__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1451:1: rule__LoadingRule__Group__1 : rule__LoadingRule__Group__1__Impl rule__LoadingRule__Group__2 ;
    public final void rule__LoadingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1455:1: ( rule__LoadingRule__Group__1__Impl rule__LoadingRule__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1456:2: rule__LoadingRule__Group__1__Impl rule__LoadingRule__Group__2
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group__1__Impl_in_rule__LoadingRule__Group__12867);
            rule__LoadingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group__2_in_rule__LoadingRule__Group__12870);
            rule__LoadingRule__Group__2();

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
    // $ANTLR end "rule__LoadingRule__Group__1"


    // $ANTLR start "rule__LoadingRule__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1463:1: rule__LoadingRule__Group__1__Impl : ( ( rule__LoadingRule__SourcePatternAssignment_1 )? ) ;
    public final void rule__LoadingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1467:1: ( ( ( rule__LoadingRule__SourcePatternAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1468:1: ( ( rule__LoadingRule__SourcePatternAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1468:1: ( ( rule__LoadingRule__SourcePatternAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1469:1: ( rule__LoadingRule__SourcePatternAssignment_1 )?
            {
             before(grammarAccess.getLoadingRuleAccess().getSourcePatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1470:1: ( rule__LoadingRule__SourcePatternAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1470:2: rule__LoadingRule__SourcePatternAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LoadingRule__SourcePatternAssignment_1_in_rule__LoadingRule__Group__1__Impl2897);
                    rule__LoadingRule__SourcePatternAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadingRuleAccess().getSourcePatternAssignment_1()); 

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
    // $ANTLR end "rule__LoadingRule__Group__1__Impl"


    // $ANTLR start "rule__LoadingRule__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1480:1: rule__LoadingRule__Group__2 : rule__LoadingRule__Group__2__Impl rule__LoadingRule__Group__3 ;
    public final void rule__LoadingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1484:1: ( rule__LoadingRule__Group__2__Impl rule__LoadingRule__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1485:2: rule__LoadingRule__Group__2__Impl rule__LoadingRule__Group__3
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group__2__Impl_in_rule__LoadingRule__Group__22928);
            rule__LoadingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group__3_in_rule__LoadingRule__Group__22931);
            rule__LoadingRule__Group__3();

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
    // $ANTLR end "rule__LoadingRule__Group__2"


    // $ANTLR start "rule__LoadingRule__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1492:1: rule__LoadingRule__Group__2__Impl : ( 'fetch' ) ;
    public final void rule__LoadingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1496:1: ( ( 'fetch' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1497:1: ( 'fetch' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1497:1: ( 'fetch' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1498:1: 'fetch'
            {
             before(grammarAccess.getLoadingRuleAccess().getFetchKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__LoadingRule__Group__2__Impl2959); 
             after(grammarAccess.getLoadingRuleAccess().getFetchKeyword_2()); 

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
    // $ANTLR end "rule__LoadingRule__Group__2__Impl"


    // $ANTLR start "rule__LoadingRule__Group__3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1511:1: rule__LoadingRule__Group__3 : rule__LoadingRule__Group__3__Impl rule__LoadingRule__Group__4 ;
    public final void rule__LoadingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1515:1: ( rule__LoadingRule__Group__3__Impl rule__LoadingRule__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1516:2: rule__LoadingRule__Group__3__Impl rule__LoadingRule__Group__4
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group__3__Impl_in_rule__LoadingRule__Group__32990);
            rule__LoadingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group__4_in_rule__LoadingRule__Group__32993);
            rule__LoadingRule__Group__4();

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
    // $ANTLR end "rule__LoadingRule__Group__3"


    // $ANTLR start "rule__LoadingRule__Group__3__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1523:1: rule__LoadingRule__Group__3__Impl : ( ( rule__LoadingRule__TargetPatternAssignment_3 ) ) ;
    public final void rule__LoadingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1527:1: ( ( ( rule__LoadingRule__TargetPatternAssignment_3 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1528:1: ( ( rule__LoadingRule__TargetPatternAssignment_3 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1528:1: ( ( rule__LoadingRule__TargetPatternAssignment_3 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1529:1: ( rule__LoadingRule__TargetPatternAssignment_3 )
            {
             before(grammarAccess.getLoadingRuleAccess().getTargetPatternAssignment_3()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1530:1: ( rule__LoadingRule__TargetPatternAssignment_3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1530:2: rule__LoadingRule__TargetPatternAssignment_3
            {
            pushFollow(FOLLOW_rule__LoadingRule__TargetPatternAssignment_3_in_rule__LoadingRule__Group__3__Impl3020);
            rule__LoadingRule__TargetPatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoadingRuleAccess().getTargetPatternAssignment_3()); 

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
    // $ANTLR end "rule__LoadingRule__Group__3__Impl"


    // $ANTLR start "rule__LoadingRule__Group__4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1540:1: rule__LoadingRule__Group__4 : rule__LoadingRule__Group__4__Impl rule__LoadingRule__Group__5 ;
    public final void rule__LoadingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1544:1: ( rule__LoadingRule__Group__4__Impl rule__LoadingRule__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1545:2: rule__LoadingRule__Group__4__Impl rule__LoadingRule__Group__5
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group__4__Impl_in_rule__LoadingRule__Group__43050);
            rule__LoadingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group__5_in_rule__LoadingRule__Group__43053);
            rule__LoadingRule__Group__5();

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
    // $ANTLR end "rule__LoadingRule__Group__4"


    // $ANTLR start "rule__LoadingRule__Group__4__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1552:1: rule__LoadingRule__Group__4__Impl : ( ( rule__LoadingRule__Group_4__0 )? ) ;
    public final void rule__LoadingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1556:1: ( ( ( rule__LoadingRule__Group_4__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1557:1: ( ( rule__LoadingRule__Group_4__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1557:1: ( ( rule__LoadingRule__Group_4__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1558:1: ( rule__LoadingRule__Group_4__0 )?
            {
             before(grammarAccess.getLoadingRuleAccess().getGroup_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1559:1: ( rule__LoadingRule__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1559:2: rule__LoadingRule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__LoadingRule__Group_4__0_in_rule__LoadingRule__Group__4__Impl3080);
                    rule__LoadingRule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadingRuleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__LoadingRule__Group__4__Impl"


    // $ANTLR start "rule__LoadingRule__Group__5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1569:1: rule__LoadingRule__Group__5 : rule__LoadingRule__Group__5__Impl ;
    public final void rule__LoadingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1573:1: ( rule__LoadingRule__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1574:2: rule__LoadingRule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group__5__Impl_in_rule__LoadingRule__Group__53111);
            rule__LoadingRule__Group__5__Impl();

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
    // $ANTLR end "rule__LoadingRule__Group__5"


    // $ANTLR start "rule__LoadingRule__Group__5__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1580:1: rule__LoadingRule__Group__5__Impl : ( ( rule__LoadingRule__Group_5__0 )? ) ;
    public final void rule__LoadingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1584:1: ( ( ( rule__LoadingRule__Group_5__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1585:1: ( ( rule__LoadingRule__Group_5__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1585:1: ( ( rule__LoadingRule__Group_5__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1586:1: ( rule__LoadingRule__Group_5__0 )?
            {
             before(grammarAccess.getLoadingRuleAccess().getGroup_5()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1587:1: ( rule__LoadingRule__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1587:2: rule__LoadingRule__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__LoadingRule__Group_5__0_in_rule__LoadingRule__Group__5__Impl3138);
                    rule__LoadingRule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadingRuleAccess().getGroup_5()); 

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
    // $ANTLR end "rule__LoadingRule__Group__5__Impl"


    // $ANTLR start "rule__LoadingRule__Group_4__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1609:1: rule__LoadingRule__Group_4__0 : rule__LoadingRule__Group_4__0__Impl rule__LoadingRule__Group_4__1 ;
    public final void rule__LoadingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1613:1: ( rule__LoadingRule__Group_4__0__Impl rule__LoadingRule__Group_4__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1614:2: rule__LoadingRule__Group_4__0__Impl rule__LoadingRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group_4__0__Impl_in_rule__LoadingRule__Group_4__03181);
            rule__LoadingRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group_4__1_in_rule__LoadingRule__Group_4__03184);
            rule__LoadingRule__Group_4__1();

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
    // $ANTLR end "rule__LoadingRule__Group_4__0"


    // $ANTLR start "rule__LoadingRule__Group_4__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1621:1: rule__LoadingRule__Group_4__0__Impl : ( ( rule__LoadingRule__ProbabilityAssignment_4_0 ) ) ;
    public final void rule__LoadingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1625:1: ( ( ( rule__LoadingRule__ProbabilityAssignment_4_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1626:1: ( ( rule__LoadingRule__ProbabilityAssignment_4_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1626:1: ( ( rule__LoadingRule__ProbabilityAssignment_4_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1627:1: ( rule__LoadingRule__ProbabilityAssignment_4_0 )
            {
             before(grammarAccess.getLoadingRuleAccess().getProbabilityAssignment_4_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1628:1: ( rule__LoadingRule__ProbabilityAssignment_4_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1628:2: rule__LoadingRule__ProbabilityAssignment_4_0
            {
            pushFollow(FOLLOW_rule__LoadingRule__ProbabilityAssignment_4_0_in_rule__LoadingRule__Group_4__0__Impl3211);
            rule__LoadingRule__ProbabilityAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLoadingRuleAccess().getProbabilityAssignment_4_0()); 

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
    // $ANTLR end "rule__LoadingRule__Group_4__0__Impl"


    // $ANTLR start "rule__LoadingRule__Group_4__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1638:1: rule__LoadingRule__Group_4__1 : rule__LoadingRule__Group_4__1__Impl ;
    public final void rule__LoadingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1642:1: ( rule__LoadingRule__Group_4__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1643:2: rule__LoadingRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group_4__1__Impl_in_rule__LoadingRule__Group_4__13241);
            rule__LoadingRule__Group_4__1__Impl();

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
    // $ANTLR end "rule__LoadingRule__Group_4__1"


    // $ANTLR start "rule__LoadingRule__Group_4__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1649:1: rule__LoadingRule__Group_4__1__Impl : ( '%' ) ;
    public final void rule__LoadingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1653:1: ( ( '%' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1654:1: ( '%' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1654:1: ( '%' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1655:1: '%'
            {
             before(grammarAccess.getLoadingRuleAccess().getPercentSignKeyword_4_1()); 
            match(input,24,FOLLOW_24_in_rule__LoadingRule__Group_4__1__Impl3269); 
             after(grammarAccess.getLoadingRuleAccess().getPercentSignKeyword_4_1()); 

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
    // $ANTLR end "rule__LoadingRule__Group_4__1__Impl"


    // $ANTLR start "rule__LoadingRule__Group_5__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1672:1: rule__LoadingRule__Group_5__0 : rule__LoadingRule__Group_5__0__Impl rule__LoadingRule__Group_5__1 ;
    public final void rule__LoadingRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1676:1: ( rule__LoadingRule__Group_5__0__Impl rule__LoadingRule__Group_5__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1677:2: rule__LoadingRule__Group_5__0__Impl rule__LoadingRule__Group_5__1
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group_5__0__Impl_in_rule__LoadingRule__Group_5__03304);
            rule__LoadingRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group_5__1_in_rule__LoadingRule__Group_5__03307);
            rule__LoadingRule__Group_5__1();

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
    // $ANTLR end "rule__LoadingRule__Group_5__0"


    // $ANTLR start "rule__LoadingRule__Group_5__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1684:1: rule__LoadingRule__Group_5__0__Impl : ( '{' ) ;
    public final void rule__LoadingRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1688:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1689:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1689:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1690:1: '{'
            {
             before(grammarAccess.getLoadingRuleAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__LoadingRule__Group_5__0__Impl3335); 
             after(grammarAccess.getLoadingRuleAccess().getLeftCurlyBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__LoadingRule__Group_5__0__Impl"


    // $ANTLR start "rule__LoadingRule__Group_5__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1703:1: rule__LoadingRule__Group_5__1 : rule__LoadingRule__Group_5__1__Impl rule__LoadingRule__Group_5__2 ;
    public final void rule__LoadingRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1707:1: ( rule__LoadingRule__Group_5__1__Impl rule__LoadingRule__Group_5__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1708:2: rule__LoadingRule__Group_5__1__Impl rule__LoadingRule__Group_5__2
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group_5__1__Impl_in_rule__LoadingRule__Group_5__13366);
            rule__LoadingRule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoadingRule__Group_5__2_in_rule__LoadingRule__Group_5__13369);
            rule__LoadingRule__Group_5__2();

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
    // $ANTLR end "rule__LoadingRule__Group_5__1"


    // $ANTLR start "rule__LoadingRule__Group_5__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1715:1: rule__LoadingRule__Group_5__1__Impl : ( ( rule__LoadingRule__SubRulesAssignment_5_1 )* ) ;
    public final void rule__LoadingRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1719:1: ( ( ( rule__LoadingRule__SubRulesAssignment_5_1 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1720:1: ( ( rule__LoadingRule__SubRulesAssignment_5_1 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1720:1: ( ( rule__LoadingRule__SubRulesAssignment_5_1 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1721:1: ( rule__LoadingRule__SubRulesAssignment_5_1 )*
            {
             before(grammarAccess.getLoadingRuleAccess().getSubRulesAssignment_5_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1722:1: ( rule__LoadingRule__SubRulesAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1722:2: rule__LoadingRule__SubRulesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__LoadingRule__SubRulesAssignment_5_1_in_rule__LoadingRule__Group_5__1__Impl3396);
            	    rule__LoadingRule__SubRulesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLoadingRuleAccess().getSubRulesAssignment_5_1()); 

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
    // $ANTLR end "rule__LoadingRule__Group_5__1__Impl"


    // $ANTLR start "rule__LoadingRule__Group_5__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1732:1: rule__LoadingRule__Group_5__2 : rule__LoadingRule__Group_5__2__Impl ;
    public final void rule__LoadingRule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1736:1: ( rule__LoadingRule__Group_5__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1737:2: rule__LoadingRule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__LoadingRule__Group_5__2__Impl_in_rule__LoadingRule__Group_5__23427);
            rule__LoadingRule__Group_5__2__Impl();

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
    // $ANTLR end "rule__LoadingRule__Group_5__2"


    // $ANTLR start "rule__LoadingRule__Group_5__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1743:1: rule__LoadingRule__Group_5__2__Impl : ( '}' ) ;
    public final void rule__LoadingRule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1747:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1748:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1748:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1749:1: '}'
            {
             before(grammarAccess.getLoadingRuleAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,20,FOLLOW_20_in_rule__LoadingRule__Group_5__2__Impl3455); 
             after(grammarAccess.getLoadingRuleAccess().getRightCurlyBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__LoadingRule__Group_5__2__Impl"


    // $ANTLR start "rule__SourcePattern__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1768:1: rule__SourcePattern__Group__0 : rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 ;
    public final void rule__SourcePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1772:1: ( rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1773:2: rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__03492);
            rule__SourcePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__03495);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1780:1: rule__SourcePattern__Group__0__Impl : ( ( rule__SourcePattern__PatternAssignment_0 ) ) ;
    public final void rule__SourcePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1784:1: ( ( ( rule__SourcePattern__PatternAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1785:1: ( ( rule__SourcePattern__PatternAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1785:1: ( ( rule__SourcePattern__PatternAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1786:1: ( rule__SourcePattern__PatternAssignment_0 )
            {
             before(grammarAccess.getSourcePatternAccess().getPatternAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1787:1: ( rule__SourcePattern__PatternAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1787:2: rule__SourcePattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_rule__SourcePattern__PatternAssignment_0_in_rule__SourcePattern__Group__0__Impl3522);
            rule__SourcePattern__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSourcePatternAccess().getPatternAssignment_0()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1797:1: rule__SourcePattern__Group__1 : rule__SourcePattern__Group__1__Impl ;
    public final void rule__SourcePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1801:1: ( rule__SourcePattern__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1802:2: rule__SourcePattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__13552);
            rule__SourcePattern__Group__1__Impl();

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1808:1: rule__SourcePattern__Group__1__Impl : ( ( rule__SourcePattern__FilterAssignment_1 )? ) ;
    public final void rule__SourcePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1812:1: ( ( ( rule__SourcePattern__FilterAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1813:1: ( ( rule__SourcePattern__FilterAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1813:1: ( ( rule__SourcePattern__FilterAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1814:1: ( rule__SourcePattern__FilterAssignment_1 )?
            {
             before(grammarAccess.getSourcePatternAccess().getFilterAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1815:1: ( rule__SourcePattern__FilterAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1815:2: rule__SourcePattern__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SourcePattern__FilterAssignment_1_in_rule__SourcePattern__Group__1__Impl3579);
                    rule__SourcePattern__FilterAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourcePatternAccess().getFilterAssignment_1()); 

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


    // $ANTLR start "rule__FilterPattern__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1829:1: rule__FilterPattern__Group__0 : rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 ;
    public final void rule__FilterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1833:1: ( rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1834:2: rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__03614);
            rule__FilterPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__03617);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1841:1: rule__FilterPattern__Group__0__Impl : ( '[' ) ;
    public final void rule__FilterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1845:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1846:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1846:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1847:1: '['
            {
             before(grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__FilterPattern__Group__0__Impl3645); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1860:1: rule__FilterPattern__Group__1 : rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 ;
    public final void rule__FilterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1864:1: ( rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1865:2: rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13676);
            rule__FilterPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13679);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1872:1: rule__FilterPattern__Group__1__Impl : ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) ;
    public final void rule__FilterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1876:1: ( ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1877:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1877:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1878:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1879:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1879:2: rule__FilterPattern__StringPatternAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3706);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1889:1: rule__FilterPattern__Group__2 : rule__FilterPattern__Group__2__Impl ;
    public final void rule__FilterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1893:1: ( rule__FilterPattern__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1894:2: rule__FilterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23736);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1900:1: rule__FilterPattern__Group__2__Impl : ( ']' ) ;
    public final void rule__FilterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1904:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1905:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1905:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1906:1: ']'
            {
             before(grammarAccess.getFilterPatternAccess().getRightSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__FilterPattern__Group__2__Impl3764); 
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


    // $ANTLR start "rule__TargetPattern__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1925:1: rule__TargetPattern__Group__0 : rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1 ;
    public final void rule__TargetPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1929:1: ( rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1930:2: rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__0__Impl_in_rule__TargetPattern__Group__03801);
            rule__TargetPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetPattern__Group__1_in_rule__TargetPattern__Group__03804);
            rule__TargetPattern__Group__1();

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
    // $ANTLR end "rule__TargetPattern__Group__0"


    // $ANTLR start "rule__TargetPattern__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1937:1: rule__TargetPattern__Group__0__Impl : ( ( rule__TargetPattern__PatternAssignment_0 ) ) ;
    public final void rule__TargetPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1941:1: ( ( ( rule__TargetPattern__PatternAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1942:1: ( ( rule__TargetPattern__PatternAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1942:1: ( ( rule__TargetPattern__PatternAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1943:1: ( rule__TargetPattern__PatternAssignment_0 )
            {
             before(grammarAccess.getTargetPatternAccess().getPatternAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1944:1: ( rule__TargetPattern__PatternAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1944:2: rule__TargetPattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_rule__TargetPattern__PatternAssignment_0_in_rule__TargetPattern__Group__0__Impl3831);
            rule__TargetPattern__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetPatternAccess().getPatternAssignment_0()); 

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
    // $ANTLR end "rule__TargetPattern__Group__0__Impl"


    // $ANTLR start "rule__TargetPattern__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1954:1: rule__TargetPattern__Group__1 : rule__TargetPattern__Group__1__Impl ;
    public final void rule__TargetPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1958:1: ( rule__TargetPattern__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1959:2: rule__TargetPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__1__Impl_in_rule__TargetPattern__Group__13861);
            rule__TargetPattern__Group__1__Impl();

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
    // $ANTLR end "rule__TargetPattern__Group__1"


    // $ANTLR start "rule__TargetPattern__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1965:1: rule__TargetPattern__Group__1__Impl : ( ( rule__TargetPattern__FilterAssignment_1 )? ) ;
    public final void rule__TargetPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1969:1: ( ( ( rule__TargetPattern__FilterAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1970:1: ( ( rule__TargetPattern__FilterAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1970:1: ( ( rule__TargetPattern__FilterAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1971:1: ( rule__TargetPattern__FilterAssignment_1 )?
            {
             before(grammarAccess.getTargetPatternAccess().getFilterAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1972:1: ( rule__TargetPattern__FilterAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1972:2: rule__TargetPattern__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TargetPattern__FilterAssignment_1_in_rule__TargetPattern__Group__1__Impl3888);
                    rule__TargetPattern__FilterAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetPatternAccess().getFilterAssignment_1()); 

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
    // $ANTLR end "rule__TargetPattern__Group__1__Impl"


    // $ANTLR start "rule__PatternExp__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1986:1: rule__PatternExp__Group__0 : rule__PatternExp__Group__0__Impl rule__PatternExp__Group__1 ;
    public final void rule__PatternExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1990:1: ( rule__PatternExp__Group__0__Impl rule__PatternExp__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1991:2: rule__PatternExp__Group__0__Impl rule__PatternExp__Group__1
            {
            pushFollow(FOLLOW_rule__PatternExp__Group__0__Impl_in_rule__PatternExp__Group__03923);
            rule__PatternExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternExp__Group__1_in_rule__PatternExp__Group__03926);
            rule__PatternExp__Group__1();

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
    // $ANTLR end "rule__PatternExp__Group__0"


    // $ANTLR start "rule__PatternExp__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1998:1: rule__PatternExp__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PatternExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2002:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2003:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2003:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2004:1: RULE_ID
            {
             before(grammarAccess.getPatternExpAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternExp__Group__0__Impl3953); 
             after(grammarAccess.getPatternExpAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__PatternExp__Group__0__Impl"


    // $ANTLR start "rule__PatternExp__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2015:1: rule__PatternExp__Group__1 : rule__PatternExp__Group__1__Impl ;
    public final void rule__PatternExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2019:1: ( rule__PatternExp__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2020:2: rule__PatternExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PatternExp__Group__1__Impl_in_rule__PatternExp__Group__13982);
            rule__PatternExp__Group__1__Impl();

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
    // $ANTLR end "rule__PatternExp__Group__1"


    // $ANTLR start "rule__PatternExp__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2026:1: rule__PatternExp__Group__1__Impl : ( ( rule__PatternExp__Group_1__0 )* ) ;
    public final void rule__PatternExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2030:1: ( ( ( rule__PatternExp__Group_1__0 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2031:1: ( ( rule__PatternExp__Group_1__0 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2031:1: ( ( rule__PatternExp__Group_1__0 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2032:1: ( rule__PatternExp__Group_1__0 )*
            {
             before(grammarAccess.getPatternExpAccess().getGroup_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2033:1: ( rule__PatternExp__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2033:2: rule__PatternExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PatternExp__Group_1__0_in_rule__PatternExp__Group__1__Impl4009);
            	    rule__PatternExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPatternExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PatternExp__Group__1__Impl"


    // $ANTLR start "rule__PatternExp__Group_1__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2047:1: rule__PatternExp__Group_1__0 : rule__PatternExp__Group_1__0__Impl rule__PatternExp__Group_1__1 ;
    public final void rule__PatternExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2051:1: ( rule__PatternExp__Group_1__0__Impl rule__PatternExp__Group_1__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2052:2: rule__PatternExp__Group_1__0__Impl rule__PatternExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__PatternExp__Group_1__0__Impl_in_rule__PatternExp__Group_1__04044);
            rule__PatternExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternExp__Group_1__1_in_rule__PatternExp__Group_1__04047);
            rule__PatternExp__Group_1__1();

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
    // $ANTLR end "rule__PatternExp__Group_1__0"


    // $ANTLR start "rule__PatternExp__Group_1__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2059:1: rule__PatternExp__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PatternExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2063:1: ( ( '.' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2064:1: ( '.' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2064:1: ( '.' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2065:1: '.'
            {
             before(grammarAccess.getPatternExpAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__PatternExp__Group_1__0__Impl4075); 
             after(grammarAccess.getPatternExpAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__PatternExp__Group_1__0__Impl"


    // $ANTLR start "rule__PatternExp__Group_1__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2078:1: rule__PatternExp__Group_1__1 : rule__PatternExp__Group_1__1__Impl ;
    public final void rule__PatternExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2082:1: ( rule__PatternExp__Group_1__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2083:2: rule__PatternExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PatternExp__Group_1__1__Impl_in_rule__PatternExp__Group_1__14106);
            rule__PatternExp__Group_1__1__Impl();

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
    // $ANTLR end "rule__PatternExp__Group_1__1"


    // $ANTLR start "rule__PatternExp__Group_1__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2089:1: rule__PatternExp__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PatternExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2093:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2094:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2094:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2095:1: RULE_ID
            {
             before(grammarAccess.getPatternExpAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternExp__Group_1__1__Impl4133); 
             after(grammarAccess.getPatternExpAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__PatternExp__Group_1__1__Impl"


    // $ANTLR start "rule__Model__MetamodelAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2113:1: rule__Model__MetamodelAssignment_0 : ( ruleMetamodelImport ) ;
    public final void rule__Model__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2117:1: ( ( ruleMetamodelImport ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2118:1: ( ruleMetamodelImport )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2118:1: ( ruleMetamodelImport )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2119:1: ruleMetamodelImport
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMetamodelImport_in_rule__Model__MetamodelAssignment_04173);
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


    // $ANTLR start "rule__Model__CacheAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2128:1: rule__Model__CacheAssignment_1 : ( ruleCache ) ;
    public final void rule__Model__CacheAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2132:1: ( ( ruleCache ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2133:1: ( ruleCache )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2133:1: ( ruleCache )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2134:1: ruleCache
            {
             before(grammarAccess.getModelAccess().getCacheCacheParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCache_in_rule__Model__CacheAssignment_14204);
            ruleCache();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCacheCacheParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__CacheAssignment_1"


    // $ANTLR start "rule__Model__PlansAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2143:1: rule__Model__PlansAssignment_2 : ( rulePlan ) ;
    public final void rule__Model__PlansAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2147:1: ( ( rulePlan ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2148:1: ( rulePlan )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2148:1: ( rulePlan )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2149:1: rulePlan
            {
             before(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePlan_in_rule__Model__PlansAssignment_24235);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__PlansAssignment_2"


    // $ANTLR start "rule__MetamodelImport__NsURIAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2158:1: rule__MetamodelImport__NsURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MetamodelImport__NsURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2162:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2163:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2163:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2164:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelImportAccess().getNsURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetamodelImport__NsURIAssignment_14266); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2173:1: rule__Cache__TypeAssignment_1 : ( ruleCacheType ) ;
    public final void rule__Cache__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2177:1: ( ( ruleCacheType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2178:1: ( ruleCacheType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2178:1: ( ruleCacheType )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2179:1: ruleCacheType
            {
             before(grammarAccess.getCacheAccess().getTypeCacheTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_14297);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2188:1: rule__Cache__PropertiesAssignment_2 : ( ruleCacheProperties ) ;
    public final void rule__Cache__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2192:1: ( ( ruleCacheProperties ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2193:1: ( ruleCacheProperties )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2193:1: ( ruleCacheProperties )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2194:1: ruleCacheProperties
            {
             before(grammarAccess.getCacheAccess().getPropertiesCachePropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_24328);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2203:1: rule__CacheProperties__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__CacheProperties__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2207:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2208:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2208:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2209:1: RULE_INT
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_24359); 
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


    // $ANTLR start "rule__Plan__NameAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2218:1: rule__Plan__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Plan__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2222:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2223:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2223:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2224:1: RULE_ID
            {
             before(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_14390); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2233:1: rule__Plan__AfterAssignment_2 : ( ruleAfterClause ) ;
    public final void rule__Plan__AfterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2237:1: ( ( ruleAfterClause ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2238:1: ( ruleAfterClause )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2238:1: ( ruleAfterClause )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2239:1: ruleAfterClause
            {
             before(grammarAccess.getPlanAccess().getAfterAfterClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAfterClause_in_rule__Plan__AfterAssignment_24421);
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


    // $ANTLR start "rule__Plan__RulesAssignment_4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2248:1: rule__Plan__RulesAssignment_4 : ( ( rule__Plan__RulesAlternatives_4_0 ) ) ;
    public final void rule__Plan__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2252:1: ( ( ( rule__Plan__RulesAlternatives_4_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2253:1: ( ( rule__Plan__RulesAlternatives_4_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2253:1: ( ( rule__Plan__RulesAlternatives_4_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2254:1: ( rule__Plan__RulesAlternatives_4_0 )
            {
             before(grammarAccess.getPlanAccess().getRulesAlternatives_4_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2255:1: ( rule__Plan__RulesAlternatives_4_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2255:2: rule__Plan__RulesAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__Plan__RulesAlternatives_4_0_in_rule__Plan__RulesAssignment_44452);
            rule__Plan__RulesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getRulesAlternatives_4_0()); 

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
    // $ANTLR end "rule__Plan__RulesAssignment_4"


    // $ANTLR start "rule__AfterClause__PlanAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2264:1: rule__AfterClause__PlanAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AfterClause__PlanAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2268:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2269:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2269:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2270:1: ( RULE_ID )
            {
             before(grammarAccess.getAfterClauseAccess().getPlanPlanCrossReference_1_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2271:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2272:1: RULE_ID
            {
             before(grammarAccess.getAfterClauseAccess().getPlanPlanIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AfterClause__PlanAssignment_14489); 
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


    // $ANTLR start "rule__StartingRule__TargetPatternAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2283:1: rule__StartingRule__TargetPatternAssignment_2 : ( ruleTargetPattern ) ;
    public final void rule__StartingRule__TargetPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2287:1: ( ( ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2288:1: ( ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2288:1: ( ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2289:1: ruleTargetPattern
            {
             before(grammarAccess.getStartingRuleAccess().getTargetPatternTargetPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_rule__StartingRule__TargetPatternAssignment_24524);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getStartingRuleAccess().getTargetPatternTargetPatternParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StartingRule__TargetPatternAssignment_2"


    // $ANTLR start "rule__StartingRule__ProbabilityAssignment_3_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2298:1: rule__StartingRule__ProbabilityAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__StartingRule__ProbabilityAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2302:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2303:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2303:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2304:1: RULE_INT
            {
             before(grammarAccess.getStartingRuleAccess().getProbabilityINTTerminalRuleCall_3_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StartingRule__ProbabilityAssignment_3_04555); 
             after(grammarAccess.getStartingRuleAccess().getProbabilityINTTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__StartingRule__ProbabilityAssignment_3_0"


    // $ANTLR start "rule__StartingRule__SubRulesAssignment_4_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2313:1: rule__StartingRule__SubRulesAssignment_4_1 : ( ruleLoadingRule ) ;
    public final void rule__StartingRule__SubRulesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2317:1: ( ( ruleLoadingRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2318:1: ( ruleLoadingRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2318:1: ( ruleLoadingRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2319:1: ruleLoadingRule
            {
             before(grammarAccess.getStartingRuleAccess().getSubRulesLoadingRuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleLoadingRule_in_rule__StartingRule__SubRulesAssignment_4_14586);
            ruleLoadingRule();

            state._fsp--;

             after(grammarAccess.getStartingRuleAccess().getSubRulesLoadingRuleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__StartingRule__SubRulesAssignment_4_1"


    // $ANTLR start "rule__LoadingRule__SourcePatternAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2328:1: rule__LoadingRule__SourcePatternAssignment_1 : ( ruleSourcePattern ) ;
    public final void rule__LoadingRule__SourcePatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2332:1: ( ( ruleSourcePattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2333:1: ( ruleSourcePattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2333:1: ( ruleSourcePattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2334:1: ruleSourcePattern
            {
             before(grammarAccess.getLoadingRuleAccess().getSourcePatternSourcePatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_rule__LoadingRule__SourcePatternAssignment_14617);
            ruleSourcePattern();

            state._fsp--;

             after(grammarAccess.getLoadingRuleAccess().getSourcePatternSourcePatternParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LoadingRule__SourcePatternAssignment_1"


    // $ANTLR start "rule__LoadingRule__TargetPatternAssignment_3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2343:1: rule__LoadingRule__TargetPatternAssignment_3 : ( ruleTargetPattern ) ;
    public final void rule__LoadingRule__TargetPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2347:1: ( ( ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2348:1: ( ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2348:1: ( ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2349:1: ruleTargetPattern
            {
             before(grammarAccess.getLoadingRuleAccess().getTargetPatternTargetPatternParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_rule__LoadingRule__TargetPatternAssignment_34648);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getLoadingRuleAccess().getTargetPatternTargetPatternParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LoadingRule__TargetPatternAssignment_3"


    // $ANTLR start "rule__LoadingRule__ProbabilityAssignment_4_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2358:1: rule__LoadingRule__ProbabilityAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__LoadingRule__ProbabilityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2362:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2363:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2363:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2364:1: RULE_INT
            {
             before(grammarAccess.getLoadingRuleAccess().getProbabilityINTTerminalRuleCall_4_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LoadingRule__ProbabilityAssignment_4_04679); 
             after(grammarAccess.getLoadingRuleAccess().getProbabilityINTTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__LoadingRule__ProbabilityAssignment_4_0"


    // $ANTLR start "rule__LoadingRule__SubRulesAssignment_5_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2373:1: rule__LoadingRule__SubRulesAssignment_5_1 : ( ruleLoadingRule ) ;
    public final void rule__LoadingRule__SubRulesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2377:1: ( ( ruleLoadingRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2378:1: ( ruleLoadingRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2378:1: ( ruleLoadingRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2379:1: ruleLoadingRule
            {
             before(grammarAccess.getLoadingRuleAccess().getSubRulesLoadingRuleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleLoadingRule_in_rule__LoadingRule__SubRulesAssignment_5_14710);
            ruleLoadingRule();

            state._fsp--;

             after(grammarAccess.getLoadingRuleAccess().getSubRulesLoadingRuleParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__LoadingRule__SubRulesAssignment_5_1"


    // $ANTLR start "rule__SourcePattern__PatternAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2388:1: rule__SourcePattern__PatternAssignment_0 : ( rulePatternExp ) ;
    public final void rule__SourcePattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2392:1: ( ( rulePatternExp ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2393:1: ( rulePatternExp )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2393:1: ( rulePatternExp )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2394:1: rulePatternExp
            {
             before(grammarAccess.getSourcePatternAccess().getPatternPatternExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePatternExp_in_rule__SourcePattern__PatternAssignment_04741);
            rulePatternExp();

            state._fsp--;

             after(grammarAccess.getSourcePatternAccess().getPatternPatternExpParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SourcePattern__PatternAssignment_0"


    // $ANTLR start "rule__SourcePattern__FilterAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2403:1: rule__SourcePattern__FilterAssignment_1 : ( ruleFilterPattern ) ;
    public final void rule__SourcePattern__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2407:1: ( ( ruleFilterPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2408:1: ( ruleFilterPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2408:1: ( ruleFilterPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2409:1: ruleFilterPattern
            {
             before(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_14772);
            ruleFilterPattern();

            state._fsp--;

             after(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SourcePattern__FilterAssignment_1"


    // $ANTLR start "rule__FilterPattern__StringPatternAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2418:1: rule__FilterPattern__StringPatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FilterPattern__StringPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2422:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2423:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2423:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2424:1: RULE_STRING
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_14803); 
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


    // $ANTLR start "rule__TargetPattern__PatternAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2433:1: rule__TargetPattern__PatternAssignment_0 : ( rulePatternExp ) ;
    public final void rule__TargetPattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2437:1: ( ( rulePatternExp ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2438:1: ( rulePatternExp )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2438:1: ( rulePatternExp )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2439:1: rulePatternExp
            {
             before(grammarAccess.getTargetPatternAccess().getPatternPatternExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePatternExp_in_rule__TargetPattern__PatternAssignment_04834);
            rulePatternExp();

            state._fsp--;

             after(grammarAccess.getTargetPatternAccess().getPatternPatternExpParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TargetPattern__PatternAssignment_0"


    // $ANTLR start "rule__TargetPattern__FilterAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2448:1: rule__TargetPattern__FilterAssignment_1 : ( ruleFilterPattern ) ;
    public final void rule__TargetPattern__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2452:1: ( ( ruleFilterPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2453:1: ( ruleFilterPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2453:1: ( ruleFilterPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2454:1: ruleFilterPattern
            {
             before(grammarAccess.getTargetPatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_rule__TargetPattern__FilterAssignment_14865);
            ruleFilterPattern();

            state._fsp--;

             after(grammarAccess.getTargetPatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TargetPattern__FilterAssignment_1"

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
    public static final BitSet FOLLOW_ruleLoadingRule_in_entryRuleLoadingRule481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadingRule488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__0_in_ruleLoadingRule514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourcePattern548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0_in_ruleSourcePattern574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0_in_ruleFilterPattern634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPattern668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__0_in_ruleTargetPattern694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp_in_entryRulePatternExp721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternExp728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp__Group__0_in_rulePatternExp754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartingRule_in_rule__Plan__RulesAlternatives_4_0832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadingRule_in_rule__Plan__RulesAlternatives_4_0849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CacheType__Alternatives882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CacheType__Alternatives903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0938 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_0_in_rule__Model__Group__0__Impl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CacheAssignment_1_in_rule__Model__Group__1__Impl1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlansAssignment_2_in_rule__Model__Group__2__Impl1085 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__0__Impl_in_rule__MetamodelImport__Group__01122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__1_in_rule__MetamodelImport__Group__01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetamodelImport__Group__0__Impl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__1__Impl_in_rule__MetamodelImport__Group__11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__NsURIAssignment_1_in_rule__MetamodelImport__Group__1__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01245 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cache__Group__0__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01431 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CacheProperties__Group__0__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11493 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CacheProperties__Group__1__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21555 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__SizeAssignment_2_in_rule__CacheProperties__Group__2__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CacheProperties__Group__3__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Plan__Group__0__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11744 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__21804 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__21807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__31865 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__31868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Plan__Group__3__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__41927 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__41930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__RulesAssignment_4_in_rule__Plan__Group__4__Impl1957 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__51988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Plan__Group__5__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterClause__Group__0__Impl_in_rule__AfterClause__Group__02059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AfterClause__Group__1_in_rule__AfterClause__Group__02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AfterClause__Group__0__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterClause__Group__1__Impl_in_rule__AfterClause__Group__12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterClause__PlanAssignment_1_in_rule__AfterClause__Group__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__0__Impl_in_rule__StartingRule__Group__02182 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__1_in_rule__StartingRule__Group__02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StartingRule__Group__0__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__1__Impl_in_rule__StartingRule__Group__12244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__2_in_rule__StartingRule__Group__12247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StartingRule__Group__1__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__2__Impl_in_rule__StartingRule__Group__22306 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__3_in_rule__StartingRule__Group__22309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__TargetPatternAssignment_2_in_rule__StartingRule__Group__2__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__3__Impl_in_rule__StartingRule__Group__32366 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__4_in_rule__StartingRule__Group__32369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_3__0_in_rule__StartingRule__Group__3__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group__4__Impl_in_rule__StartingRule__Group__42427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_4__0_in_rule__StartingRule__Group__4__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_3__0__Impl_in_rule__StartingRule__Group_3__02494 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_3__1_in_rule__StartingRule__Group_3__02497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__ProbabilityAssignment_3_0_in_rule__StartingRule__Group_3__0__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_3__1__Impl_in_rule__StartingRule__Group_3__12554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StartingRule__Group_3__1__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_4__0__Impl_in_rule__StartingRule__Group_4__02617 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_4__1_in_rule__StartingRule__Group_4__02620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StartingRule__Group_4__0__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_4__1__Impl_in_rule__StartingRule__Group_4__12679 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_4__2_in_rule__StartingRule__Group_4__12682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartingRule__SubRulesAssignment_4_1_in_rule__StartingRule__Group_4__1__Impl2709 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_rule__StartingRule__Group_4__2__Impl_in_rule__StartingRule__Group_4__22740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StartingRule__Group_4__2__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__0__Impl_in_rule__LoadingRule__Group__02805 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__1_in_rule__LoadingRule__Group__02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LoadingRule__Group__0__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__1__Impl_in_rule__LoadingRule__Group__12867 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__2_in_rule__LoadingRule__Group__12870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__SourcePatternAssignment_1_in_rule__LoadingRule__Group__1__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__2__Impl_in_rule__LoadingRule__Group__22928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__3_in_rule__LoadingRule__Group__22931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LoadingRule__Group__2__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__3__Impl_in_rule__LoadingRule__Group__32990 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__4_in_rule__LoadingRule__Group__32993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__TargetPatternAssignment_3_in_rule__LoadingRule__Group__3__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__4__Impl_in_rule__LoadingRule__Group__43050 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__5_in_rule__LoadingRule__Group__43053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_4__0_in_rule__LoadingRule__Group__4__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group__5__Impl_in_rule__LoadingRule__Group__53111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_5__0_in_rule__LoadingRule__Group__5__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_4__0__Impl_in_rule__LoadingRule__Group_4__03181 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_4__1_in_rule__LoadingRule__Group_4__03184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__ProbabilityAssignment_4_0_in_rule__LoadingRule__Group_4__0__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_4__1__Impl_in_rule__LoadingRule__Group_4__13241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LoadingRule__Group_4__1__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_5__0__Impl_in_rule__LoadingRule__Group_5__03304 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_5__1_in_rule__LoadingRule__Group_5__03307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LoadingRule__Group_5__0__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_5__1__Impl_in_rule__LoadingRule__Group_5__13366 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_5__2_in_rule__LoadingRule__Group_5__13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadingRule__SubRulesAssignment_5_1_in_rule__LoadingRule__Group_5__1__Impl3396 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_rule__LoadingRule__Group_5__2__Impl_in_rule__LoadingRule__Group_5__23427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LoadingRule__Group_5__2__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__03492 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__03495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__PatternAssignment_0_in_rule__SourcePattern__Group__0__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__FilterAssignment_1_in_rule__SourcePattern__Group__1__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__03614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__03617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FilterPattern__Group__0__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13676 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FilterPattern__Group__2__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__0__Impl_in_rule__TargetPattern__Group__03801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__1_in_rule__TargetPattern__Group__03804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__PatternAssignment_0_in_rule__TargetPattern__Group__0__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__1__Impl_in_rule__TargetPattern__Group__13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__FilterAssignment_1_in_rule__TargetPattern__Group__1__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp__Group__0__Impl_in_rule__PatternExp__Group__03923 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PatternExp__Group__1_in_rule__PatternExp__Group__03926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternExp__Group__0__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp__Group__1__Impl_in_rule__PatternExp__Group__13982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp__Group_1__0_in_rule__PatternExp__Group__1__Impl4009 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__PatternExp__Group_1__0__Impl_in_rule__PatternExp__Group_1__04044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PatternExp__Group_1__1_in_rule__PatternExp__Group_1__04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PatternExp__Group_1__0__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternExp__Group_1__1__Impl_in_rule__PatternExp__Group_1__14106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternExp__Group_1__1__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_rule__Model__MetamodelAssignment_04173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_rule__Model__CacheAssignment_14204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_rule__Model__PlansAssignment_24235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelImport__NsURIAssignment_14266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_14297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_24328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_24359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_14390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterClause_in_rule__Plan__AfterAssignment_24421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__RulesAlternatives_4_0_in_rule__Plan__RulesAssignment_44452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AfterClause__PlanAssignment_14489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_rule__StartingRule__TargetPatternAssignment_24524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StartingRule__ProbabilityAssignment_3_04555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadingRule_in_rule__StartingRule__SubRulesAssignment_4_14586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_rule__LoadingRule__SourcePatternAssignment_14617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_rule__LoadingRule__TargetPatternAssignment_34648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LoadingRule__ProbabilityAssignment_4_04679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadingRule_in_rule__LoadingRule__SubRulesAssignment_5_14710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp_in_rule__SourcePattern__PatternAssignment_04741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_14803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternExp_in_rule__TargetPattern__PatternAssignment_04834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_rule__TargetPattern__FilterAssignment_14865 = new BitSet(new long[]{0x0000000000000002L});

}