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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LRU'", "'Predictive'", "'strong'", "'soft'", "'weak'", "'on starting'", "'on loading'", "'import'", "'use cache'", "'['", "'type'", "'size'", "']'", "'plan'", "'{'", "'}'", "'after'", "'fetch'", "'%'", "'.'"
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


    // $ANTLR start "entryRuleAfterRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:200:1: entryRuleAfterRule : ruleAfterRule EOF ;
    public final void entryRuleAfterRule() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:201:1: ( ruleAfterRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:202:1: ruleAfterRule EOF
            {
             before(grammarAccess.getAfterRuleRule()); 
            pushFollow(FOLLOW_ruleAfterRule_in_entryRuleAfterRule361);
            ruleAfterRule();

            state._fsp--;

             after(grammarAccess.getAfterRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterRule368); 

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
    // $ANTLR end "entryRuleAfterRule"


    // $ANTLR start "ruleAfterRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:209:1: ruleAfterRule : ( ( rule__AfterRule__Group__0 ) ) ;
    public final void ruleAfterRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:213:2: ( ( ( rule__AfterRule__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:214:1: ( ( rule__AfterRule__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:214:1: ( ( rule__AfterRule__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:215:1: ( rule__AfterRule__Group__0 )
            {
             before(grammarAccess.getAfterRuleAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:216:1: ( rule__AfterRule__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:216:2: rule__AfterRule__Group__0
            {
            pushFollow(FOLLOW_rule__AfterRule__Group__0_in_ruleAfterRule394);
            rule__AfterRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfterRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleAfterRule"


    // $ANTLR start "entryRulePrefetchingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:228:1: entryRulePrefetchingRule : rulePrefetchingRule EOF ;
    public final void entryRulePrefetchingRule() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:229:1: ( rulePrefetchingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:230:1: rulePrefetchingRule EOF
            {
             before(grammarAccess.getPrefetchingRuleRule()); 
            pushFollow(FOLLOW_rulePrefetchingRule_in_entryRulePrefetchingRule421);
            rulePrefetchingRule();

            state._fsp--;

             after(grammarAccess.getPrefetchingRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefetchingRule428); 

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
    // $ANTLR end "entryRulePrefetchingRule"


    // $ANTLR start "rulePrefetchingRule"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:237:1: rulePrefetchingRule : ( ( rule__PrefetchingRule__Group__0 ) ) ;
    public final void rulePrefetchingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:241:2: ( ( ( rule__PrefetchingRule__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:242:1: ( ( rule__PrefetchingRule__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:242:1: ( ( rule__PrefetchingRule__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:243:1: ( rule__PrefetchingRule__Group__0 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:244:1: ( rule__PrefetchingRule__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:244:2: rule__PrefetchingRule__Group__0
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__0_in_rulePrefetchingRule454);
            rule__PrefetchingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefetchingRuleAccess().getGroup()); 

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
    // $ANTLR end "rulePrefetchingRule"


    // $ANTLR start "entryRuleSourcePattern"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:256:1: entryRuleSourcePattern : ruleSourcePattern EOF ;
    public final void entryRuleSourcePattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:257:1: ( ruleSourcePattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:258:1: ruleSourcePattern EOF
            {
             before(grammarAccess.getSourcePatternRule()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern481);
            ruleSourcePattern();

            state._fsp--;

             after(grammarAccess.getSourcePatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourcePattern488); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:265:1: ruleSourcePattern : ( ( rule__SourcePattern__Group__0 ) ) ;
    public final void ruleSourcePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:269:2: ( ( ( rule__SourcePattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__SourcePattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__SourcePattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:271:1: ( rule__SourcePattern__Group__0 )
            {
             before(grammarAccess.getSourcePatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:1: ( rule__SourcePattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:2: rule__SourcePattern__Group__0
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__0_in_ruleSourcePattern514);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:284:1: entryRuleFilterPattern : ruleFilterPattern EOF ;
    public final void entryRuleFilterPattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:285:1: ( ruleFilterPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:286:1: ruleFilterPattern EOF
            {
             before(grammarAccess.getFilterPatternRule()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern541);
            ruleFilterPattern();

            state._fsp--;

             after(grammarAccess.getFilterPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern548); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:293:1: ruleFilterPattern : ( ( rule__FilterPattern__Group__0 ) ) ;
    public final void ruleFilterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:297:2: ( ( ( rule__FilterPattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:298:1: ( ( rule__FilterPattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:298:1: ( ( rule__FilterPattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:299:1: ( rule__FilterPattern__Group__0 )
            {
             before(grammarAccess.getFilterPatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:300:1: ( rule__FilterPattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:300:2: rule__FilterPattern__Group__0
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__0_in_ruleFilterPattern574);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:312:1: entryRuleTargetPattern : ruleTargetPattern EOF ;
    public final void entryRuleTargetPattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:313:1: ( ruleTargetPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:314:1: ruleTargetPattern EOF
            {
             before(grammarAccess.getTargetPatternRule()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern601);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getTargetPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetPattern608); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:321:1: ruleTargetPattern : ( ( rule__TargetPattern__Group__0 ) ) ;
    public final void ruleTargetPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:325:2: ( ( ( rule__TargetPattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:326:1: ( ( rule__TargetPattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:326:1: ( ( rule__TargetPattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:327:1: ( rule__TargetPattern__Group__0 )
            {
             before(grammarAccess.getTargetPatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:328:1: ( rule__TargetPattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:328:2: rule__TargetPattern__Group__0
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__0_in_ruleTargetPattern634);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:340:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:341:1: ( ruleQualifiedName EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:342:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName661);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName668); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:349:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:353:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:354:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:354:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:355:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:356:1: ( rule__QualifiedName__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:356:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName694);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCacheType"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:369:1: ruleCacheType : ( ( rule__CacheType__Alternatives ) ) ;
    public final void ruleCacheType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:373:1: ( ( ( rule__CacheType__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:374:1: ( ( rule__CacheType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:374:1: ( ( rule__CacheType__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:375:1: ( rule__CacheType__Alternatives )
            {
             before(grammarAccess.getCacheTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:376:1: ( rule__CacheType__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:376:2: rule__CacheType__Alternatives
            {
            pushFollow(FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType731);
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


    // $ANTLR start "ruleRefType"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:388:1: ruleRefType : ( ( rule__RefType__Alternatives ) ) ;
    public final void ruleRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:392:1: ( ( ( rule__RefType__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:393:1: ( ( rule__RefType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:393:1: ( ( rule__RefType__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:394:1: ( rule__RefType__Alternatives )
            {
             before(grammarAccess.getRefTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:395:1: ( rule__RefType__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:395:2: rule__RefType__Alternatives
            {
            pushFollow(FOLLOW_rule__RefType__Alternatives_in_ruleRefType767);
            rule__RefType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRefTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRefType"


    // $ANTLR start "ruleMoment"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:407:1: ruleMoment : ( ( rule__Moment__Alternatives ) ) ;
    public final void ruleMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:411:1: ( ( ( rule__Moment__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:412:1: ( ( rule__Moment__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:412:1: ( ( rule__Moment__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:413:1: ( rule__Moment__Alternatives )
            {
             before(grammarAccess.getMomentAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:414:1: ( rule__Moment__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:414:2: rule__Moment__Alternatives
            {
            pushFollow(FOLLOW_rule__Moment__Alternatives_in_ruleMoment803);
            rule__Moment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMomentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMoment"


    // $ANTLR start "rule__CacheType__Alternatives"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:425:1: rule__CacheType__Alternatives : ( ( ( 'LRU' ) ) | ( ( 'Predictive' ) ) );
    public final void rule__CacheType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:429:1: ( ( ( 'LRU' ) ) | ( ( 'Predictive' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:430:1: ( ( 'LRU' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:430:1: ( ( 'LRU' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:431:1: ( 'LRU' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:432:1: ( 'LRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:432:3: 'LRU'
                    {
                    match(input,11,FOLLOW_11_in_rule__CacheType__Alternatives839); 

                    }

                     after(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:437:6: ( ( 'Predictive' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:437:6: ( ( 'Predictive' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:438:1: ( 'Predictive' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getPREDICTIVEEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:439:1: ( 'Predictive' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:439:3: 'Predictive'
                    {
                    match(input,12,FOLLOW_12_in_rule__CacheType__Alternatives860); 

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


    // $ANTLR start "rule__RefType__Alternatives"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:449:1: rule__RefType__Alternatives : ( ( ( 'strong' ) ) | ( ( 'soft' ) ) | ( ( 'weak' ) ) );
    public final void rule__RefType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:453:1: ( ( ( 'strong' ) ) | ( ( 'soft' ) ) | ( ( 'weak' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:454:1: ( ( 'strong' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:454:1: ( ( 'strong' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:455:1: ( 'strong' )
                    {
                     before(grammarAccess.getRefTypeAccess().getSTRONGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:456:1: ( 'strong' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:456:3: 'strong'
                    {
                    match(input,13,FOLLOW_13_in_rule__RefType__Alternatives896); 

                    }

                     after(grammarAccess.getRefTypeAccess().getSTRONGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:461:6: ( ( 'soft' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:461:6: ( ( 'soft' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:462:1: ( 'soft' )
                    {
                     before(grammarAccess.getRefTypeAccess().getSOFTEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:463:1: ( 'soft' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:463:3: 'soft'
                    {
                    match(input,14,FOLLOW_14_in_rule__RefType__Alternatives917); 

                    }

                     after(grammarAccess.getRefTypeAccess().getSOFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:468:6: ( ( 'weak' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:468:6: ( ( 'weak' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:469:1: ( 'weak' )
                    {
                     before(grammarAccess.getRefTypeAccess().getWEAKEnumLiteralDeclaration_2()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:470:1: ( 'weak' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:470:3: 'weak'
                    {
                    match(input,15,FOLLOW_15_in_rule__RefType__Alternatives938); 

                    }

                     after(grammarAccess.getRefTypeAccess().getWEAKEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__RefType__Alternatives"


    // $ANTLR start "rule__Moment__Alternatives"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:480:1: rule__Moment__Alternatives : ( ( ( 'on starting' ) ) | ( ( 'on loading' ) ) );
    public final void rule__Moment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:484:1: ( ( ( 'on starting' ) ) | ( ( 'on loading' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:485:1: ( ( 'on starting' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:485:1: ( ( 'on starting' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:486:1: ( 'on starting' )
                    {
                     before(grammarAccess.getMomentAccess().getON_STARTINGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:487:1: ( 'on starting' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:487:3: 'on starting'
                    {
                    match(input,16,FOLLOW_16_in_rule__Moment__Alternatives974); 

                    }

                     after(grammarAccess.getMomentAccess().getON_STARTINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:492:6: ( ( 'on loading' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:492:6: ( ( 'on loading' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:493:1: ( 'on loading' )
                    {
                     before(grammarAccess.getMomentAccess().getON_LOADINGEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:494:1: ( 'on loading' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:494:3: 'on loading'
                    {
                    match(input,17,FOLLOW_17_in_rule__Moment__Alternatives995); 

                    }

                     after(grammarAccess.getMomentAccess().getON_LOADINGEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Moment__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:506:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:510:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:511:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01028);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01031);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:518:1: rule__Model__Group__0__Impl : ( ( rule__Model__MetamodelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:522:1: ( ( ( rule__Model__MetamodelAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:523:1: ( ( rule__Model__MetamodelAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:523:1: ( ( rule__Model__MetamodelAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:524:1: ( rule__Model__MetamodelAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:525:1: ( rule__Model__MetamodelAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:525:2: rule__Model__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_0_in_rule__Model__Group__0__Impl1058);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:535:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:539:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:540:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11088);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11091);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:547:1: rule__Model__Group__1__Impl : ( ( rule__Model__CacheAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:551:1: ( ( ( rule__Model__CacheAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:552:1: ( ( rule__Model__CacheAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:552:1: ( ( rule__Model__CacheAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:553:1: ( rule__Model__CacheAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getCacheAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:554:1: ( rule__Model__CacheAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:554:2: rule__Model__CacheAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__CacheAssignment_1_in_rule__Model__Group__1__Impl1118);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:564:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:568:1: ( rule__Model__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:569:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21148);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:575:1: rule__Model__Group__2__Impl : ( ( rule__Model__PlansAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:579:1: ( ( ( rule__Model__PlansAssignment_2 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:580:1: ( ( rule__Model__PlansAssignment_2 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:580:1: ( ( rule__Model__PlansAssignment_2 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:581:1: ( rule__Model__PlansAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getPlansAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:582:1: ( rule__Model__PlansAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:582:2: rule__Model__PlansAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PlansAssignment_2_in_rule__Model__Group__2__Impl1175);
            	    rule__Model__PlansAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:598:1: rule__MetamodelImport__Group__0 : rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1 ;
    public final void rule__MetamodelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:602:1: ( rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:603:2: rule__MetamodelImport__Group__0__Impl rule__MetamodelImport__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelImport__Group__0__Impl_in_rule__MetamodelImport__Group__01212);
            rule__MetamodelImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelImport__Group__1_in_rule__MetamodelImport__Group__01215);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:610:1: rule__MetamodelImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__MetamodelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:614:1: ( ( 'import' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:615:1: ( 'import' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:615:1: ( 'import' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:616:1: 'import'
            {
             before(grammarAccess.getMetamodelImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__MetamodelImport__Group__0__Impl1243); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:629:1: rule__MetamodelImport__Group__1 : rule__MetamodelImport__Group__1__Impl ;
    public final void rule__MetamodelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:633:1: ( rule__MetamodelImport__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:634:2: rule__MetamodelImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelImport__Group__1__Impl_in_rule__MetamodelImport__Group__11274);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:640:1: rule__MetamodelImport__Group__1__Impl : ( ( rule__MetamodelImport__NsURIAssignment_1 ) ) ;
    public final void rule__MetamodelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:644:1: ( ( ( rule__MetamodelImport__NsURIAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:645:1: ( ( rule__MetamodelImport__NsURIAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:645:1: ( ( rule__MetamodelImport__NsURIAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:646:1: ( rule__MetamodelImport__NsURIAssignment_1 )
            {
             before(grammarAccess.getMetamodelImportAccess().getNsURIAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:647:1: ( rule__MetamodelImport__NsURIAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:647:2: rule__MetamodelImport__NsURIAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelImport__NsURIAssignment_1_in_rule__MetamodelImport__Group__1__Impl1301);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:661:1: rule__Cache__Group__0 : rule__Cache__Group__0__Impl rule__Cache__Group__1 ;
    public final void rule__Cache__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:665:1: ( rule__Cache__Group__0__Impl rule__Cache__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:666:2: rule__Cache__Group__0__Impl rule__Cache__Group__1
            {
            pushFollow(FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01335);
            rule__Cache__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01338);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:673:1: rule__Cache__Group__0__Impl : ( 'use cache' ) ;
    public final void rule__Cache__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:677:1: ( ( 'use cache' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:678:1: ( 'use cache' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:678:1: ( 'use cache' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:679:1: 'use cache'
            {
             before(grammarAccess.getCacheAccess().getUseCacheKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Cache__Group__0__Impl1366); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:692:1: rule__Cache__Group__1 : rule__Cache__Group__1__Impl rule__Cache__Group__2 ;
    public final void rule__Cache__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:696:1: ( rule__Cache__Group__1__Impl rule__Cache__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:697:2: rule__Cache__Group__1__Impl rule__Cache__Group__2
            {
            pushFollow(FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11397);
            rule__Cache__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11400);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:704:1: rule__Cache__Group__1__Impl : ( ( rule__Cache__TypeAssignment_1 ) ) ;
    public final void rule__Cache__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:708:1: ( ( ( rule__Cache__TypeAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:709:1: ( ( rule__Cache__TypeAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:709:1: ( ( rule__Cache__TypeAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:710:1: ( rule__Cache__TypeAssignment_1 )
            {
             before(grammarAccess.getCacheAccess().getTypeAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:711:1: ( rule__Cache__TypeAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:711:2: rule__Cache__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1427);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:721:1: rule__Cache__Group__2 : rule__Cache__Group__2__Impl ;
    public final void rule__Cache__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:725:1: ( rule__Cache__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:726:2: rule__Cache__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21457);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:732:1: rule__Cache__Group__2__Impl : ( ( rule__Cache__PropertiesAssignment_2 )? ) ;
    public final void rule__Cache__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:736:1: ( ( ( rule__Cache__PropertiesAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:737:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:737:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:738:1: ( rule__Cache__PropertiesAssignment_2 )?
            {
             before(grammarAccess.getCacheAccess().getPropertiesAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:739:1: ( rule__Cache__PropertiesAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:739:2: rule__Cache__PropertiesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1484);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:755:1: rule__CacheProperties__Group__0 : rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 ;
    public final void rule__CacheProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:759:1: ( rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:760:2: rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01521);
            rule__CacheProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01524);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:767:1: rule__CacheProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__CacheProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:771:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:772:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:772:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:773:1: '['
            {
             before(grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__CacheProperties__Group__0__Impl1552); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:786:1: rule__CacheProperties__Group__1 : rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 ;
    public final void rule__CacheProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:790:1: ( rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:791:2: rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11583);
            rule__CacheProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11586);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:798:1: rule__CacheProperties__Group__1__Impl : ( 'type' ) ;
    public final void rule__CacheProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:802:1: ( ( 'type' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:803:1: ( 'type' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:803:1: ( 'type' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:804:1: 'type'
            {
             before(grammarAccess.getCachePropertiesAccess().getTypeKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__CacheProperties__Group__1__Impl1614); 
             after(grammarAccess.getCachePropertiesAccess().getTypeKeyword_1()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:817:1: rule__CacheProperties__Group__2 : rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 ;
    public final void rule__CacheProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:821:1: ( rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:822:2: rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21645);
            rule__CacheProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21648);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:829:1: rule__CacheProperties__Group__2__Impl : ( ( rule__CacheProperties__RefTypeAssignment_2 ) ) ;
    public final void rule__CacheProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:833:1: ( ( ( rule__CacheProperties__RefTypeAssignment_2 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:834:1: ( ( rule__CacheProperties__RefTypeAssignment_2 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:834:1: ( ( rule__CacheProperties__RefTypeAssignment_2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:835:1: ( rule__CacheProperties__RefTypeAssignment_2 )
            {
             before(grammarAccess.getCachePropertiesAccess().getRefTypeAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:836:1: ( rule__CacheProperties__RefTypeAssignment_2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:836:2: rule__CacheProperties__RefTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__CacheProperties__RefTypeAssignment_2_in_rule__CacheProperties__Group__2__Impl1675);
            rule__CacheProperties__RefTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCachePropertiesAccess().getRefTypeAssignment_2()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:846:1: rule__CacheProperties__Group__3 : rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4 ;
    public final void rule__CacheProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:850:1: ( rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:851:2: rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31705);
            rule__CacheProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__4_in_rule__CacheProperties__Group__31708);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:858:1: rule__CacheProperties__Group__3__Impl : ( 'size' ) ;
    public final void rule__CacheProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:862:1: ( ( 'size' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:863:1: ( 'size' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:863:1: ( 'size' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:864:1: 'size'
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__CacheProperties__Group__3__Impl1736); 
             after(grammarAccess.getCachePropertiesAccess().getSizeKeyword_3()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:877:1: rule__CacheProperties__Group__4 : rule__CacheProperties__Group__4__Impl rule__CacheProperties__Group__5 ;
    public final void rule__CacheProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:881:1: ( rule__CacheProperties__Group__4__Impl rule__CacheProperties__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:882:2: rule__CacheProperties__Group__4__Impl rule__CacheProperties__Group__5
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__4__Impl_in_rule__CacheProperties__Group__41767);
            rule__CacheProperties__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__5_in_rule__CacheProperties__Group__41770);
            rule__CacheProperties__Group__5();

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:889:1: rule__CacheProperties__Group__4__Impl : ( ( rule__CacheProperties__SizeAssignment_4 ) ) ;
    public final void rule__CacheProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:893:1: ( ( ( rule__CacheProperties__SizeAssignment_4 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:894:1: ( ( rule__CacheProperties__SizeAssignment_4 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:894:1: ( ( rule__CacheProperties__SizeAssignment_4 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:895:1: ( rule__CacheProperties__SizeAssignment_4 )
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeAssignment_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:896:1: ( rule__CacheProperties__SizeAssignment_4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:896:2: rule__CacheProperties__SizeAssignment_4
            {
            pushFollow(FOLLOW_rule__CacheProperties__SizeAssignment_4_in_rule__CacheProperties__Group__4__Impl1797);
            rule__CacheProperties__SizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCachePropertiesAccess().getSizeAssignment_4()); 

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


    // $ANTLR start "rule__CacheProperties__Group__5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:906:1: rule__CacheProperties__Group__5 : rule__CacheProperties__Group__5__Impl ;
    public final void rule__CacheProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:910:1: ( rule__CacheProperties__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:911:2: rule__CacheProperties__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__5__Impl_in_rule__CacheProperties__Group__51827);
            rule__CacheProperties__Group__5__Impl();

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
    // $ANTLR end "rule__CacheProperties__Group__5"


    // $ANTLR start "rule__CacheProperties__Group__5__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:917:1: rule__CacheProperties__Group__5__Impl : ( ']' ) ;
    public final void rule__CacheProperties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:921:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:922:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:922:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:923:1: ']'
            {
             before(grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__CacheProperties__Group__5__Impl1855); 
             after(grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__CacheProperties__Group__5__Impl"


    // $ANTLR start "rule__Plan__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:948:1: rule__Plan__Group__0 : rule__Plan__Group__0__Impl rule__Plan__Group__1 ;
    public final void rule__Plan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:952:1: ( rule__Plan__Group__0__Impl rule__Plan__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:953:2: rule__Plan__Group__0__Impl rule__Plan__Group__1
            {
            pushFollow(FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01898);
            rule__Plan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01901);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:960:1: rule__Plan__Group__0__Impl : ( 'plan' ) ;
    public final void rule__Plan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:964:1: ( ( 'plan' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:965:1: ( 'plan' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:965:1: ( 'plan' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:966:1: 'plan'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Plan__Group__0__Impl1929); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:979:1: rule__Plan__Group__1 : rule__Plan__Group__1__Impl rule__Plan__Group__2 ;
    public final void rule__Plan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:983:1: ( rule__Plan__Group__1__Impl rule__Plan__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:984:2: rule__Plan__Group__1__Impl rule__Plan__Group__2
            {
            pushFollow(FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11960);
            rule__Plan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11963);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:991:1: rule__Plan__Group__1__Impl : ( ( rule__Plan__PlanIdAssignment_1 ) ) ;
    public final void rule__Plan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:995:1: ( ( ( rule__Plan__PlanIdAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:996:1: ( ( rule__Plan__PlanIdAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:996:1: ( ( rule__Plan__PlanIdAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:997:1: ( rule__Plan__PlanIdAssignment_1 )
            {
             before(grammarAccess.getPlanAccess().getPlanIdAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:998:1: ( rule__Plan__PlanIdAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:998:2: rule__Plan__PlanIdAssignment_1
            {
            pushFollow(FOLLOW_rule__Plan__PlanIdAssignment_1_in_rule__Plan__Group__1__Impl1990);
            rule__Plan__PlanIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getPlanIdAssignment_1()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1008:1: rule__Plan__Group__2 : rule__Plan__Group__2__Impl rule__Plan__Group__3 ;
    public final void rule__Plan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1012:1: ( rule__Plan__Group__2__Impl rule__Plan__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1013:2: rule__Plan__Group__2__Impl rule__Plan__Group__3
            {
            pushFollow(FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__22020);
            rule__Plan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__22023);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1020:1: rule__Plan__Group__2__Impl : ( ( rule__Plan__AfterAssignment_2 )? ) ;
    public final void rule__Plan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1024:1: ( ( ( rule__Plan__AfterAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1025:1: ( ( rule__Plan__AfterAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1025:1: ( ( rule__Plan__AfterAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1026:1: ( rule__Plan__AfterAssignment_2 )?
            {
             before(grammarAccess.getPlanAccess().getAfterAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1027:1: ( rule__Plan__AfterAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1027:2: rule__Plan__AfterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl2050);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1037:1: rule__Plan__Group__3 : rule__Plan__Group__3__Impl rule__Plan__Group__4 ;
    public final void rule__Plan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1041:1: ( rule__Plan__Group__3__Impl rule__Plan__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1042:2: rule__Plan__Group__3__Impl rule__Plan__Group__4
            {
            pushFollow(FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__32081);
            rule__Plan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__32084);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1049:1: rule__Plan__Group__3__Impl : ( '{' ) ;
    public final void rule__Plan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1053:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1054:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1054:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1055:1: '{'
            {
             before(grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Plan__Group__3__Impl2112); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1068:1: rule__Plan__Group__4 : rule__Plan__Group__4__Impl rule__Plan__Group__5 ;
    public final void rule__Plan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1072:1: ( rule__Plan__Group__4__Impl rule__Plan__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1073:2: rule__Plan__Group__4__Impl rule__Plan__Group__5
            {
            pushFollow(FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__42143);
            rule__Plan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__42146);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1080:1: rule__Plan__Group__4__Impl : ( ( rule__Plan__RulesAssignment_4 )* ) ;
    public final void rule__Plan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1084:1: ( ( ( rule__Plan__RulesAssignment_4 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1085:1: ( ( rule__Plan__RulesAssignment_4 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1085:1: ( ( rule__Plan__RulesAssignment_4 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1086:1: ( rule__Plan__RulesAssignment_4 )*
            {
             before(grammarAccess.getPlanAccess().getRulesAssignment_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1087:1: ( rule__Plan__RulesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1087:2: rule__Plan__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Plan__RulesAssignment_4_in_rule__Plan__Group__4__Impl2173);
            	    rule__Plan__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1097:1: rule__Plan__Group__5 : rule__Plan__Group__5__Impl ;
    public final void rule__Plan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1101:1: ( rule__Plan__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1102:2: rule__Plan__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__52204);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1108:1: rule__Plan__Group__5__Impl : ( '}' ) ;
    public final void rule__Plan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1112:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1113:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1113:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1114:1: '}'
            {
             before(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Plan__Group__5__Impl2232); 
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


    // $ANTLR start "rule__AfterRule__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1139:1: rule__AfterRule__Group__0 : rule__AfterRule__Group__0__Impl rule__AfterRule__Group__1 ;
    public final void rule__AfterRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1143:1: ( rule__AfterRule__Group__0__Impl rule__AfterRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1144:2: rule__AfterRule__Group__0__Impl rule__AfterRule__Group__1
            {
            pushFollow(FOLLOW_rule__AfterRule__Group__0__Impl_in_rule__AfterRule__Group__02275);
            rule__AfterRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AfterRule__Group__1_in_rule__AfterRule__Group__02278);
            rule__AfterRule__Group__1();

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
    // $ANTLR end "rule__AfterRule__Group__0"


    // $ANTLR start "rule__AfterRule__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1151:1: rule__AfterRule__Group__0__Impl : ( 'after' ) ;
    public final void rule__AfterRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1155:1: ( ( 'after' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1156:1: ( 'after' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1156:1: ( 'after' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1157:1: 'after'
            {
             before(grammarAccess.getAfterRuleAccess().getAfterKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__AfterRule__Group__0__Impl2306); 
             after(grammarAccess.getAfterRuleAccess().getAfterKeyword_0()); 

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
    // $ANTLR end "rule__AfterRule__Group__0__Impl"


    // $ANTLR start "rule__AfterRule__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1170:1: rule__AfterRule__Group__1 : rule__AfterRule__Group__1__Impl ;
    public final void rule__AfterRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1174:1: ( rule__AfterRule__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1175:2: rule__AfterRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AfterRule__Group__1__Impl_in_rule__AfterRule__Group__12337);
            rule__AfterRule__Group__1__Impl();

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
    // $ANTLR end "rule__AfterRule__Group__1"


    // $ANTLR start "rule__AfterRule__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1181:1: rule__AfterRule__Group__1__Impl : ( ( rule__AfterRule__PlanIdAssignment_1 ) ) ;
    public final void rule__AfterRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1185:1: ( ( ( rule__AfterRule__PlanIdAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1186:1: ( ( rule__AfterRule__PlanIdAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1186:1: ( ( rule__AfterRule__PlanIdAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1187:1: ( rule__AfterRule__PlanIdAssignment_1 )
            {
             before(grammarAccess.getAfterRuleAccess().getPlanIdAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1188:1: ( rule__AfterRule__PlanIdAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1188:2: rule__AfterRule__PlanIdAssignment_1
            {
            pushFollow(FOLLOW_rule__AfterRule__PlanIdAssignment_1_in_rule__AfterRule__Group__1__Impl2364);
            rule__AfterRule__PlanIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAfterRuleAccess().getPlanIdAssignment_1()); 

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
    // $ANTLR end "rule__AfterRule__Group__1__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1202:1: rule__PrefetchingRule__Group__0 : rule__PrefetchingRule__Group__0__Impl rule__PrefetchingRule__Group__1 ;
    public final void rule__PrefetchingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1206:1: ( rule__PrefetchingRule__Group__0__Impl rule__PrefetchingRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1207:2: rule__PrefetchingRule__Group__0__Impl rule__PrefetchingRule__Group__1
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__0__Impl_in_rule__PrefetchingRule__Group__02398);
            rule__PrefetchingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__1_in_rule__PrefetchingRule__Group__02401);
            rule__PrefetchingRule__Group__1();

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
    // $ANTLR end "rule__PrefetchingRule__Group__0"


    // $ANTLR start "rule__PrefetchingRule__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1214:1: rule__PrefetchingRule__Group__0__Impl : ( ( rule__PrefetchingRule__MomentAssignment_0 ) ) ;
    public final void rule__PrefetchingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1218:1: ( ( ( rule__PrefetchingRule__MomentAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1219:1: ( ( rule__PrefetchingRule__MomentAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1219:1: ( ( rule__PrefetchingRule__MomentAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1220:1: ( rule__PrefetchingRule__MomentAssignment_0 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getMomentAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1221:1: ( rule__PrefetchingRule__MomentAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1221:2: rule__PrefetchingRule__MomentAssignment_0
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__MomentAssignment_0_in_rule__PrefetchingRule__Group__0__Impl2428);
            rule__PrefetchingRule__MomentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrefetchingRuleAccess().getMomentAssignment_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group__0__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1231:1: rule__PrefetchingRule__Group__1 : rule__PrefetchingRule__Group__1__Impl rule__PrefetchingRule__Group__2 ;
    public final void rule__PrefetchingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1235:1: ( rule__PrefetchingRule__Group__1__Impl rule__PrefetchingRule__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1236:2: rule__PrefetchingRule__Group__1__Impl rule__PrefetchingRule__Group__2
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__1__Impl_in_rule__PrefetchingRule__Group__12458);
            rule__PrefetchingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__2_in_rule__PrefetchingRule__Group__12461);
            rule__PrefetchingRule__Group__2();

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
    // $ANTLR end "rule__PrefetchingRule__Group__1"


    // $ANTLR start "rule__PrefetchingRule__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1243:1: rule__PrefetchingRule__Group__1__Impl : ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? ) ;
    public final void rule__PrefetchingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1247:1: ( ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1248:1: ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1248:1: ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1249:1: ( rule__PrefetchingRule__SourcePatternAssignment_1 )?
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSourcePatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1250:1: ( rule__PrefetchingRule__SourcePatternAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1250:2: rule__PrefetchingRule__SourcePatternAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PrefetchingRule__SourcePatternAssignment_1_in_rule__PrefetchingRule__Group__1__Impl2488);
                    rule__PrefetchingRule__SourcePatternAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrefetchingRuleAccess().getSourcePatternAssignment_1()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group__1__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1260:1: rule__PrefetchingRule__Group__2 : rule__PrefetchingRule__Group__2__Impl rule__PrefetchingRule__Group__3 ;
    public final void rule__PrefetchingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1264:1: ( rule__PrefetchingRule__Group__2__Impl rule__PrefetchingRule__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1265:2: rule__PrefetchingRule__Group__2__Impl rule__PrefetchingRule__Group__3
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__2__Impl_in_rule__PrefetchingRule__Group__22519);
            rule__PrefetchingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__3_in_rule__PrefetchingRule__Group__22522);
            rule__PrefetchingRule__Group__3();

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
    // $ANTLR end "rule__PrefetchingRule__Group__2"


    // $ANTLR start "rule__PrefetchingRule__Group__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1272:1: rule__PrefetchingRule__Group__2__Impl : ( 'fetch' ) ;
    public final void rule__PrefetchingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1276:1: ( ( 'fetch' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1277:1: ( 'fetch' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1277:1: ( 'fetch' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1278:1: 'fetch'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getFetchKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__PrefetchingRule__Group__2__Impl2550); 
             after(grammarAccess.getPrefetchingRuleAccess().getFetchKeyword_2()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group__2__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group__3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1291:1: rule__PrefetchingRule__Group__3 : rule__PrefetchingRule__Group__3__Impl rule__PrefetchingRule__Group__4 ;
    public final void rule__PrefetchingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1295:1: ( rule__PrefetchingRule__Group__3__Impl rule__PrefetchingRule__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1296:2: rule__PrefetchingRule__Group__3__Impl rule__PrefetchingRule__Group__4
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__3__Impl_in_rule__PrefetchingRule__Group__32581);
            rule__PrefetchingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__4_in_rule__PrefetchingRule__Group__32584);
            rule__PrefetchingRule__Group__4();

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
    // $ANTLR end "rule__PrefetchingRule__Group__3"


    // $ANTLR start "rule__PrefetchingRule__Group__3__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1303:1: rule__PrefetchingRule__Group__3__Impl : ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) ) ;
    public final void rule__PrefetchingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1307:1: ( ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1308:1: ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1308:1: ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1309:1: ( rule__PrefetchingRule__TargetPatternAssignment_3 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getTargetPatternAssignment_3()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1310:1: ( rule__PrefetchingRule__TargetPatternAssignment_3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1310:2: rule__PrefetchingRule__TargetPatternAssignment_3
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__TargetPatternAssignment_3_in_rule__PrefetchingRule__Group__3__Impl2611);
            rule__PrefetchingRule__TargetPatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrefetchingRuleAccess().getTargetPatternAssignment_3()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group__3__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group__4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1320:1: rule__PrefetchingRule__Group__4 : rule__PrefetchingRule__Group__4__Impl rule__PrefetchingRule__Group__5 ;
    public final void rule__PrefetchingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1324:1: ( rule__PrefetchingRule__Group__4__Impl rule__PrefetchingRule__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1325:2: rule__PrefetchingRule__Group__4__Impl rule__PrefetchingRule__Group__5
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__4__Impl_in_rule__PrefetchingRule__Group__42641);
            rule__PrefetchingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__5_in_rule__PrefetchingRule__Group__42644);
            rule__PrefetchingRule__Group__5();

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
    // $ANTLR end "rule__PrefetchingRule__Group__4"


    // $ANTLR start "rule__PrefetchingRule__Group__4__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1332:1: rule__PrefetchingRule__Group__4__Impl : ( ( rule__PrefetchingRule__Group_4__0 )? ) ;
    public final void rule__PrefetchingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1336:1: ( ( ( rule__PrefetchingRule__Group_4__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1337:1: ( ( rule__PrefetchingRule__Group_4__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1337:1: ( ( rule__PrefetchingRule__Group_4__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1338:1: ( rule__PrefetchingRule__Group_4__0 )?
            {
             before(grammarAccess.getPrefetchingRuleAccess().getGroup_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1339:1: ( rule__PrefetchingRule__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1339:2: rule__PrefetchingRule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__0_in_rule__PrefetchingRule__Group__4__Impl2671);
                    rule__PrefetchingRule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrefetchingRuleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group__4__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group__5"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1349:1: rule__PrefetchingRule__Group__5 : rule__PrefetchingRule__Group__5__Impl ;
    public final void rule__PrefetchingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1353:1: ( rule__PrefetchingRule__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1354:2: rule__PrefetchingRule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__5__Impl_in_rule__PrefetchingRule__Group__52702);
            rule__PrefetchingRule__Group__5__Impl();

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
    // $ANTLR end "rule__PrefetchingRule__Group__5"


    // $ANTLR start "rule__PrefetchingRule__Group__5__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1360:1: rule__PrefetchingRule__Group__5__Impl : ( ( rule__PrefetchingRule__Group_5__0 )? ) ;
    public final void rule__PrefetchingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1364:1: ( ( ( rule__PrefetchingRule__Group_5__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1365:1: ( ( rule__PrefetchingRule__Group_5__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1365:1: ( ( rule__PrefetchingRule__Group_5__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1366:1: ( rule__PrefetchingRule__Group_5__0 )?
            {
             before(grammarAccess.getPrefetchingRuleAccess().getGroup_5()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1367:1: ( rule__PrefetchingRule__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1367:2: rule__PrefetchingRule__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__0_in_rule__PrefetchingRule__Group__5__Impl2729);
                    rule__PrefetchingRule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrefetchingRuleAccess().getGroup_5()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group__5__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group_4__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1389:1: rule__PrefetchingRule__Group_4__0 : rule__PrefetchingRule__Group_4__0__Impl rule__PrefetchingRule__Group_4__1 ;
    public final void rule__PrefetchingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1393:1: ( rule__PrefetchingRule__Group_4__0__Impl rule__PrefetchingRule__Group_4__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1394:2: rule__PrefetchingRule__Group_4__0__Impl rule__PrefetchingRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__0__Impl_in_rule__PrefetchingRule__Group_4__02772);
            rule__PrefetchingRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__1_in_rule__PrefetchingRule__Group_4__02775);
            rule__PrefetchingRule__Group_4__1();

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
    // $ANTLR end "rule__PrefetchingRule__Group_4__0"


    // $ANTLR start "rule__PrefetchingRule__Group_4__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1401:1: rule__PrefetchingRule__Group_4__0__Impl : ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) ) ;
    public final void rule__PrefetchingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1405:1: ( ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1406:1: ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1406:1: ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1407:1: ( rule__PrefetchingRule__ProbabilityAssignment_4_0 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getProbabilityAssignment_4_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1408:1: ( rule__PrefetchingRule__ProbabilityAssignment_4_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1408:2: rule__PrefetchingRule__ProbabilityAssignment_4_0
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__ProbabilityAssignment_4_0_in_rule__PrefetchingRule__Group_4__0__Impl2802);
            rule__PrefetchingRule__ProbabilityAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPrefetchingRuleAccess().getProbabilityAssignment_4_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group_4__0__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group_4__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1418:1: rule__PrefetchingRule__Group_4__1 : rule__PrefetchingRule__Group_4__1__Impl ;
    public final void rule__PrefetchingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1422:1: ( rule__PrefetchingRule__Group_4__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1423:2: rule__PrefetchingRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__1__Impl_in_rule__PrefetchingRule__Group_4__12832);
            rule__PrefetchingRule__Group_4__1__Impl();

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
    // $ANTLR end "rule__PrefetchingRule__Group_4__1"


    // $ANTLR start "rule__PrefetchingRule__Group_4__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1429:1: rule__PrefetchingRule__Group_4__1__Impl : ( '%' ) ;
    public final void rule__PrefetchingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1433:1: ( ( '%' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1434:1: ( '%' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1434:1: ( '%' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1435:1: '%'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getPercentSignKeyword_4_1()); 
            match(input,29,FOLLOW_29_in_rule__PrefetchingRule__Group_4__1__Impl2860); 
             after(grammarAccess.getPrefetchingRuleAccess().getPercentSignKeyword_4_1()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group_4__1__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group_5__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1452:1: rule__PrefetchingRule__Group_5__0 : rule__PrefetchingRule__Group_5__0__Impl rule__PrefetchingRule__Group_5__1 ;
    public final void rule__PrefetchingRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1456:1: ( rule__PrefetchingRule__Group_5__0__Impl rule__PrefetchingRule__Group_5__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1457:2: rule__PrefetchingRule__Group_5__0__Impl rule__PrefetchingRule__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__0__Impl_in_rule__PrefetchingRule__Group_5__02895);
            rule__PrefetchingRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__1_in_rule__PrefetchingRule__Group_5__02898);
            rule__PrefetchingRule__Group_5__1();

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
    // $ANTLR end "rule__PrefetchingRule__Group_5__0"


    // $ANTLR start "rule__PrefetchingRule__Group_5__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1464:1: rule__PrefetchingRule__Group_5__0__Impl : ( '{' ) ;
    public final void rule__PrefetchingRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1468:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1469:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1469:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1470:1: '{'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__PrefetchingRule__Group_5__0__Impl2926); 
             after(grammarAccess.getPrefetchingRuleAccess().getLeftCurlyBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group_5__0__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group_5__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1483:1: rule__PrefetchingRule__Group_5__1 : rule__PrefetchingRule__Group_5__1__Impl rule__PrefetchingRule__Group_5__2 ;
    public final void rule__PrefetchingRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1487:1: ( rule__PrefetchingRule__Group_5__1__Impl rule__PrefetchingRule__Group_5__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1488:2: rule__PrefetchingRule__Group_5__1__Impl rule__PrefetchingRule__Group_5__2
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__1__Impl_in_rule__PrefetchingRule__Group_5__12957);
            rule__PrefetchingRule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__2_in_rule__PrefetchingRule__Group_5__12960);
            rule__PrefetchingRule__Group_5__2();

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
    // $ANTLR end "rule__PrefetchingRule__Group_5__1"


    // $ANTLR start "rule__PrefetchingRule__Group_5__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1495:1: rule__PrefetchingRule__Group_5__1__Impl : ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* ) ;
    public final void rule__PrefetchingRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1499:1: ( ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1500:1: ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1500:1: ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1501:1: ( rule__PrefetchingRule__SubRulesAssignment_5_1 )*
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSubRulesAssignment_5_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1502:1: ( rule__PrefetchingRule__SubRulesAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=16 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1502:2: rule__PrefetchingRule__SubRulesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__PrefetchingRule__SubRulesAssignment_5_1_in_rule__PrefetchingRule__Group_5__1__Impl2987);
            	    rule__PrefetchingRule__SubRulesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPrefetchingRuleAccess().getSubRulesAssignment_5_1()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group_5__1__Impl"


    // $ANTLR start "rule__PrefetchingRule__Group_5__2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1512:1: rule__PrefetchingRule__Group_5__2 : rule__PrefetchingRule__Group_5__2__Impl ;
    public final void rule__PrefetchingRule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1516:1: ( rule__PrefetchingRule__Group_5__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1517:2: rule__PrefetchingRule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__2__Impl_in_rule__PrefetchingRule__Group_5__23018);
            rule__PrefetchingRule__Group_5__2__Impl();

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
    // $ANTLR end "rule__PrefetchingRule__Group_5__2"


    // $ANTLR start "rule__PrefetchingRule__Group_5__2__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1523:1: rule__PrefetchingRule__Group_5__2__Impl : ( '}' ) ;
    public final void rule__PrefetchingRule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1527:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1528:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1528:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1529:1: '}'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,26,FOLLOW_26_in_rule__PrefetchingRule__Group_5__2__Impl3046); 
             after(grammarAccess.getPrefetchingRuleAccess().getRightCurlyBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__PrefetchingRule__Group_5__2__Impl"


    // $ANTLR start "rule__SourcePattern__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1548:1: rule__SourcePattern__Group__0 : rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 ;
    public final void rule__SourcePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1552:1: ( rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1553:2: rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__03083);
            rule__SourcePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__03086);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1560:1: rule__SourcePattern__Group__0__Impl : ( ( rule__SourcePattern__PatternAssignment_0 ) ) ;
    public final void rule__SourcePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1564:1: ( ( ( rule__SourcePattern__PatternAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1565:1: ( ( rule__SourcePattern__PatternAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1565:1: ( ( rule__SourcePattern__PatternAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1566:1: ( rule__SourcePattern__PatternAssignment_0 )
            {
             before(grammarAccess.getSourcePatternAccess().getPatternAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1567:1: ( rule__SourcePattern__PatternAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1567:2: rule__SourcePattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_rule__SourcePattern__PatternAssignment_0_in_rule__SourcePattern__Group__0__Impl3113);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1577:1: rule__SourcePattern__Group__1 : rule__SourcePattern__Group__1__Impl ;
    public final void rule__SourcePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1581:1: ( rule__SourcePattern__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1582:2: rule__SourcePattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__13143);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1588:1: rule__SourcePattern__Group__1__Impl : ( ( rule__SourcePattern__FilterAssignment_1 )? ) ;
    public final void rule__SourcePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1592:1: ( ( ( rule__SourcePattern__FilterAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1593:1: ( ( rule__SourcePattern__FilterAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1593:1: ( ( rule__SourcePattern__FilterAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1594:1: ( rule__SourcePattern__FilterAssignment_1 )?
            {
             before(grammarAccess.getSourcePatternAccess().getFilterAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1595:1: ( rule__SourcePattern__FilterAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1595:2: rule__SourcePattern__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SourcePattern__FilterAssignment_1_in_rule__SourcePattern__Group__1__Impl3170);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1609:1: rule__FilterPattern__Group__0 : rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 ;
    public final void rule__FilterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1613:1: ( rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1614:2: rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__03205);
            rule__FilterPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__03208);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1621:1: rule__FilterPattern__Group__0__Impl : ( '[' ) ;
    public final void rule__FilterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1625:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1626:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1626:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1627:1: '['
            {
             before(grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__FilterPattern__Group__0__Impl3236); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1640:1: rule__FilterPattern__Group__1 : rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 ;
    public final void rule__FilterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1644:1: ( rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1645:2: rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13267);
            rule__FilterPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13270);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1652:1: rule__FilterPattern__Group__1__Impl : ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) ;
    public final void rule__FilterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1656:1: ( ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1657:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1657:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1658:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1659:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1659:2: rule__FilterPattern__StringPatternAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3297);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1669:1: rule__FilterPattern__Group__2 : rule__FilterPattern__Group__2__Impl ;
    public final void rule__FilterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1673:1: ( rule__FilterPattern__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1674:2: rule__FilterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23327);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1680:1: rule__FilterPattern__Group__2__Impl : ( ']' ) ;
    public final void rule__FilterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1684:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1685:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1685:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1686:1: ']'
            {
             before(grammarAccess.getFilterPatternAccess().getRightSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__FilterPattern__Group__2__Impl3355); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1705:1: rule__TargetPattern__Group__0 : rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1 ;
    public final void rule__TargetPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1709:1: ( rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1710:2: rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__0__Impl_in_rule__TargetPattern__Group__03392);
            rule__TargetPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetPattern__Group__1_in_rule__TargetPattern__Group__03395);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1717:1: rule__TargetPattern__Group__0__Impl : ( ( rule__TargetPattern__PatternAssignment_0 ) ) ;
    public final void rule__TargetPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1721:1: ( ( ( rule__TargetPattern__PatternAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1722:1: ( ( rule__TargetPattern__PatternAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1722:1: ( ( rule__TargetPattern__PatternAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1723:1: ( rule__TargetPattern__PatternAssignment_0 )
            {
             before(grammarAccess.getTargetPatternAccess().getPatternAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1724:1: ( rule__TargetPattern__PatternAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1724:2: rule__TargetPattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_rule__TargetPattern__PatternAssignment_0_in_rule__TargetPattern__Group__0__Impl3422);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1734:1: rule__TargetPattern__Group__1 : rule__TargetPattern__Group__1__Impl ;
    public final void rule__TargetPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1738:1: ( rule__TargetPattern__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1739:2: rule__TargetPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__1__Impl_in_rule__TargetPattern__Group__13452);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1745:1: rule__TargetPattern__Group__1__Impl : ( ( rule__TargetPattern__FilterAssignment_1 )? ) ;
    public final void rule__TargetPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1749:1: ( ( ( rule__TargetPattern__FilterAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1750:1: ( ( rule__TargetPattern__FilterAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1750:1: ( ( rule__TargetPattern__FilterAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1751:1: ( rule__TargetPattern__FilterAssignment_1 )?
            {
             before(grammarAccess.getTargetPatternAccess().getFilterAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1752:1: ( rule__TargetPattern__FilterAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1752:2: rule__TargetPattern__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TargetPattern__FilterAssignment_1_in_rule__TargetPattern__Group__1__Impl3479);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1766:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1770:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1771:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03514);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03517);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1778:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1782:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1783:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1783:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1784:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3544); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1795:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1799:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1800:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13573);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1806:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1810:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1811:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1811:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1812:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1813:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1813:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3600);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1827:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1831:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1832:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03635);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03638);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1839:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1843:1: ( ( '.' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1844:1: ( '.' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1844:1: ( '.' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1845:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl3666); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1858:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1862:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1863:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13697);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1869:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1873:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1874:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1874:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1875:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3724); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__MetamodelAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1891:1: rule__Model__MetamodelAssignment_0 : ( ruleMetamodelImport ) ;
    public final void rule__Model__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1895:1: ( ( ruleMetamodelImport ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1896:1: ( ruleMetamodelImport )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1896:1: ( ruleMetamodelImport )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1897:1: ruleMetamodelImport
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMetamodelImport_in_rule__Model__MetamodelAssignment_03762);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1906:1: rule__Model__CacheAssignment_1 : ( ruleCache ) ;
    public final void rule__Model__CacheAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1910:1: ( ( ruleCache ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1911:1: ( ruleCache )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1911:1: ( ruleCache )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1912:1: ruleCache
            {
             before(grammarAccess.getModelAccess().getCacheCacheParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCache_in_rule__Model__CacheAssignment_13793);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1921:1: rule__Model__PlansAssignment_2 : ( rulePlan ) ;
    public final void rule__Model__PlansAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1925:1: ( ( rulePlan ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1926:1: ( rulePlan )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1926:1: ( rulePlan )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1927:1: rulePlan
            {
             before(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePlan_in_rule__Model__PlansAssignment_23824);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1936:1: rule__MetamodelImport__NsURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MetamodelImport__NsURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1940:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1941:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1941:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1942:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelImportAccess().getNsURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetamodelImport__NsURIAssignment_13855); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1951:1: rule__Cache__TypeAssignment_1 : ( ruleCacheType ) ;
    public final void rule__Cache__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1955:1: ( ( ruleCacheType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1956:1: ( ruleCacheType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1956:1: ( ruleCacheType )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1957:1: ruleCacheType
            {
             before(grammarAccess.getCacheAccess().getTypeCacheTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_13886);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1966:1: rule__Cache__PropertiesAssignment_2 : ( ruleCacheProperties ) ;
    public final void rule__Cache__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1970:1: ( ( ruleCacheProperties ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1971:1: ( ruleCacheProperties )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1971:1: ( ruleCacheProperties )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1972:1: ruleCacheProperties
            {
             before(grammarAccess.getCacheAccess().getPropertiesCachePropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_23917);
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


    // $ANTLR start "rule__CacheProperties__RefTypeAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1981:1: rule__CacheProperties__RefTypeAssignment_2 : ( ruleRefType ) ;
    public final void rule__CacheProperties__RefTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1985:1: ( ( ruleRefType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1986:1: ( ruleRefType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1986:1: ( ruleRefType )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1987:1: ruleRefType
            {
             before(grammarAccess.getCachePropertiesAccess().getRefTypeRefTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRefType_in_rule__CacheProperties__RefTypeAssignment_23948);
            ruleRefType();

            state._fsp--;

             after(grammarAccess.getCachePropertiesAccess().getRefTypeRefTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__CacheProperties__RefTypeAssignment_2"


    // $ANTLR start "rule__CacheProperties__SizeAssignment_4"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1996:1: rule__CacheProperties__SizeAssignment_4 : ( RULE_INT ) ;
    public final void rule__CacheProperties__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2000:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2001:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2001:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2002:1: RULE_INT
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_43979); 
             after(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__CacheProperties__SizeAssignment_4"


    // $ANTLR start "rule__Plan__PlanIdAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2011:1: rule__Plan__PlanIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Plan__PlanIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2015:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2016:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2016:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2017:1: RULE_ID
            {
             before(grammarAccess.getPlanAccess().getPlanIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plan__PlanIdAssignment_14010); 
             after(grammarAccess.getPlanAccess().getPlanIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Plan__PlanIdAssignment_1"


    // $ANTLR start "rule__Plan__AfterAssignment_2"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2026:1: rule__Plan__AfterAssignment_2 : ( ruleAfterRule ) ;
    public final void rule__Plan__AfterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2030:1: ( ( ruleAfterRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2031:1: ( ruleAfterRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2031:1: ( ruleAfterRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2032:1: ruleAfterRule
            {
             before(grammarAccess.getPlanAccess().getAfterAfterRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAfterRule_in_rule__Plan__AfterAssignment_24041);
            ruleAfterRule();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getAfterAfterRuleParserRuleCall_2_0()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2041:1: rule__Plan__RulesAssignment_4 : ( rulePrefetchingRule ) ;
    public final void rule__Plan__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2045:1: ( ( rulePrefetchingRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2046:1: ( rulePrefetchingRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2046:1: ( rulePrefetchingRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2047:1: rulePrefetchingRule
            {
             before(grammarAccess.getPlanAccess().getRulesPrefetchingRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePrefetchingRule_in_rule__Plan__RulesAssignment_44072);
            rulePrefetchingRule();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getRulesPrefetchingRuleParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__AfterRule__PlanIdAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2056:1: rule__AfterRule__PlanIdAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AfterRule__PlanIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2060:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2061:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2061:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2062:1: ( RULE_ID )
            {
             before(grammarAccess.getAfterRuleAccess().getPlanIdPlanCrossReference_1_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2063:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2064:1: RULE_ID
            {
             before(grammarAccess.getAfterRuleAccess().getPlanIdPlanIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AfterRule__PlanIdAssignment_14107); 
             after(grammarAccess.getAfterRuleAccess().getPlanIdPlanIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAfterRuleAccess().getPlanIdPlanCrossReference_1_0()); 

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
    // $ANTLR end "rule__AfterRule__PlanIdAssignment_1"


    // $ANTLR start "rule__PrefetchingRule__MomentAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2075:1: rule__PrefetchingRule__MomentAssignment_0 : ( ruleMoment ) ;
    public final void rule__PrefetchingRule__MomentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2079:1: ( ( ruleMoment ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2080:1: ( ruleMoment )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2080:1: ( ruleMoment )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2081:1: ruleMoment
            {
             before(grammarAccess.getPrefetchingRuleAccess().getMomentMomentEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMoment_in_rule__PrefetchingRule__MomentAssignment_04142);
            ruleMoment();

            state._fsp--;

             after(grammarAccess.getPrefetchingRuleAccess().getMomentMomentEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__MomentAssignment_0"


    // $ANTLR start "rule__PrefetchingRule__SourcePatternAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2090:1: rule__PrefetchingRule__SourcePatternAssignment_1 : ( ruleSourcePattern ) ;
    public final void rule__PrefetchingRule__SourcePatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2094:1: ( ( ruleSourcePattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2095:1: ( ruleSourcePattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2095:1: ( ruleSourcePattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2096:1: ruleSourcePattern
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSourcePatternSourcePatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_rule__PrefetchingRule__SourcePatternAssignment_14173);
            ruleSourcePattern();

            state._fsp--;

             after(grammarAccess.getPrefetchingRuleAccess().getSourcePatternSourcePatternParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__SourcePatternAssignment_1"


    // $ANTLR start "rule__PrefetchingRule__TargetPatternAssignment_3"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2105:1: rule__PrefetchingRule__TargetPatternAssignment_3 : ( ruleTargetPattern ) ;
    public final void rule__PrefetchingRule__TargetPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2109:1: ( ( ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2110:1: ( ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2110:1: ( ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2111:1: ruleTargetPattern
            {
             before(grammarAccess.getPrefetchingRuleAccess().getTargetPatternTargetPatternParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_rule__PrefetchingRule__TargetPatternAssignment_34204);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getPrefetchingRuleAccess().getTargetPatternTargetPatternParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__TargetPatternAssignment_3"


    // $ANTLR start "rule__PrefetchingRule__ProbabilityAssignment_4_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2120:1: rule__PrefetchingRule__ProbabilityAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__PrefetchingRule__ProbabilityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2124:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2125:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2125:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2126:1: RULE_INT
            {
             before(grammarAccess.getPrefetchingRuleAccess().getProbabilityINTTerminalRuleCall_4_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrefetchingRule__ProbabilityAssignment_4_04235); 
             after(grammarAccess.getPrefetchingRuleAccess().getProbabilityINTTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__ProbabilityAssignment_4_0"


    // $ANTLR start "rule__PrefetchingRule__SubRulesAssignment_5_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2135:1: rule__PrefetchingRule__SubRulesAssignment_5_1 : ( rulePrefetchingRule ) ;
    public final void rule__PrefetchingRule__SubRulesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2139:1: ( ( rulePrefetchingRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2140:1: ( rulePrefetchingRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2140:1: ( rulePrefetchingRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2141:1: rulePrefetchingRule
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSubRulesPrefetchingRuleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePrefetchingRule_in_rule__PrefetchingRule__SubRulesAssignment_5_14266);
            rulePrefetchingRule();

            state._fsp--;

             after(grammarAccess.getPrefetchingRuleAccess().getSubRulesPrefetchingRuleParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__PrefetchingRule__SubRulesAssignment_5_1"


    // $ANTLR start "rule__SourcePattern__PatternAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2150:1: rule__SourcePattern__PatternAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__SourcePattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2154:1: ( ( ruleQualifiedName ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2155:1: ( ruleQualifiedName )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2155:1: ( ruleQualifiedName )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2156:1: ruleQualifiedName
            {
             before(grammarAccess.getSourcePatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SourcePattern__PatternAssignment_04297);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSourcePatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2165:1: rule__SourcePattern__FilterAssignment_1 : ( ruleFilterPattern ) ;
    public final void rule__SourcePattern__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2169:1: ( ( ruleFilterPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2170:1: ( ruleFilterPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2170:1: ( ruleFilterPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2171:1: ruleFilterPattern
            {
             before(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_14328);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2180:1: rule__FilterPattern__StringPatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FilterPattern__StringPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2184:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2185:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2185:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2186:1: RULE_STRING
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_14359); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2195:1: rule__TargetPattern__PatternAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__TargetPattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2199:1: ( ( ruleQualifiedName ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2200:1: ( ruleQualifiedName )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2200:1: ( ruleQualifiedName )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2201:1: ruleQualifiedName
            {
             before(grammarAccess.getTargetPatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TargetPattern__PatternAssignment_04390);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTargetPatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2210:1: rule__TargetPattern__FilterAssignment_1 : ( ruleFilterPattern ) ;
    public final void rule__TargetPattern__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2214:1: ( ( ruleFilterPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2215:1: ( ruleFilterPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2215:1: ( ruleFilterPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2216:1: ruleFilterPattern
            {
             before(grammarAccess.getTargetPatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_rule__TargetPattern__FilterAssignment_14421);
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
    public static final BitSet FOLLOW_ruleAfterRule_in_entryRuleAfterRule361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterRule368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__0_in_ruleAfterRule394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_entryRulePrefetchingRule421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefetchingRule428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__0_in_rulePrefetchingRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourcePattern488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0_in_ruleSourcePattern514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0_in_ruleFilterPattern574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPattern608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__0_in_ruleTargetPattern634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefType__Alternatives_in_ruleRefType767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moment__Alternatives_in_ruleMoment803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CacheType__Alternatives839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CacheType__Alternatives860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RefType__Alternatives896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RefType__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RefType__Alternatives938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Moment__Alternatives974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Moment__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01028 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_0_in_rule__Model__Group__0__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11088 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CacheAssignment_1_in_rule__Model__Group__1__Impl1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlansAssignment_2_in_rule__Model__Group__2__Impl1175 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__0__Impl_in_rule__MetamodelImport__Group__01212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__1_in_rule__MetamodelImport__Group__01215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MetamodelImport__Group__0__Impl1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__Group__1__Impl_in_rule__MetamodelImport__Group__11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelImport__NsURIAssignment_1_in_rule__MetamodelImport__Group__1__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01335 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Cache__Group__0__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11397 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01521 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CacheProperties__Group__0__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11583 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CacheProperties__Group__1__Impl1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21645 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__RefTypeAssignment_2_in_rule__CacheProperties__Group__2__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31705 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__4_in_rule__CacheProperties__Group__31708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CacheProperties__Group__3__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__4__Impl_in_rule__CacheProperties__Group__41767 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__5_in_rule__CacheProperties__Group__41770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__SizeAssignment_4_in_rule__CacheProperties__Group__4__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__5__Impl_in_rule__CacheProperties__Group__51827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CacheProperties__Group__5__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Plan__Group__0__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11960 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__PlanIdAssignment_1_in_rule__Plan__Group__1__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__22020 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__22023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__32081 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__32084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Plan__Group__3__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__42143 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__42146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__RulesAssignment_4_in_rule__Plan__Group__4__Impl2173 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__52204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Plan__Group__5__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__0__Impl_in_rule__AfterRule__Group__02275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__1_in_rule__AfterRule__Group__02278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AfterRule__Group__0__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__1__Impl_in_rule__AfterRule__Group__12337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__PlanIdAssignment_1_in_rule__AfterRule__Group__1__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__0__Impl_in_rule__PrefetchingRule__Group__02398 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__1_in_rule__PrefetchingRule__Group__02401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__MomentAssignment_0_in_rule__PrefetchingRule__Group__0__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__1__Impl_in_rule__PrefetchingRule__Group__12458 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__2_in_rule__PrefetchingRule__Group__12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__SourcePatternAssignment_1_in_rule__PrefetchingRule__Group__1__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__2__Impl_in_rule__PrefetchingRule__Group__22519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__3_in_rule__PrefetchingRule__Group__22522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PrefetchingRule__Group__2__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__3__Impl_in_rule__PrefetchingRule__Group__32581 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__4_in_rule__PrefetchingRule__Group__32584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__TargetPatternAssignment_3_in_rule__PrefetchingRule__Group__3__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__4__Impl_in_rule__PrefetchingRule__Group__42641 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__5_in_rule__PrefetchingRule__Group__42644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__0_in_rule__PrefetchingRule__Group__4__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__5__Impl_in_rule__PrefetchingRule__Group__52702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__0_in_rule__PrefetchingRule__Group__5__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__0__Impl_in_rule__PrefetchingRule__Group_4__02772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__1_in_rule__PrefetchingRule__Group_4__02775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__ProbabilityAssignment_4_0_in_rule__PrefetchingRule__Group_4__0__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__1__Impl_in_rule__PrefetchingRule__Group_4__12832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PrefetchingRule__Group_4__1__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__0__Impl_in_rule__PrefetchingRule__Group_5__02895 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__1_in_rule__PrefetchingRule__Group_5__02898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrefetchingRule__Group_5__0__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__1__Impl_in_rule__PrefetchingRule__Group_5__12957 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__2_in_rule__PrefetchingRule__Group_5__12960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__SubRulesAssignment_5_1_in_rule__PrefetchingRule__Group_5__1__Impl2987 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__2__Impl_in_rule__PrefetchingRule__Group_5__23018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrefetchingRule__Group_5__2__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__03083 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__03086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__PatternAssignment_0_in_rule__SourcePattern__Group__0__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__FilterAssignment_1_in_rule__SourcePattern__Group__1__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__03205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__03208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FilterPattern__Group__0__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13267 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FilterPattern__Group__2__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__0__Impl_in_rule__TargetPattern__Group__03392 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__1_in_rule__TargetPattern__Group__03395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__PatternAssignment_0_in_rule__TargetPattern__Group__0__Impl3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__1__Impl_in_rule__TargetPattern__Group__13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__FilterAssignment_1_in_rule__TargetPattern__Group__1__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03514 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3600 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelImport_in_rule__Model__MetamodelAssignment_03762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_rule__Model__CacheAssignment_13793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_rule__Model__PlansAssignment_23824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelImport__NsURIAssignment_13855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_13886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_23917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefType_in_rule__CacheProperties__RefTypeAssignment_23948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_43979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plan__PlanIdAssignment_14010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterRule_in_rule__Plan__AfterAssignment_24041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_rule__Plan__RulesAssignment_44072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AfterRule__PlanIdAssignment_14107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoment_in_rule__PrefetchingRule__MomentAssignment_04142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_rule__PrefetchingRule__SourcePatternAssignment_14173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_rule__PrefetchingRule__TargetPatternAssignment_34204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrefetchingRule__ProbabilityAssignment_4_04235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_rule__PrefetchingRule__SubRulesAssignment_5_14266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SourcePattern__PatternAssignment_04297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_14328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_14359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TargetPattern__PatternAssignment_04390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_rule__TargetPattern__FilterAssignment_14421 = new BitSet(new long[]{0x0000000000000002L});

}