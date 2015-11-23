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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LRU'", "'PREDICTIVE'", "'strong'", "'soft'", "'weak'", "'on starting'", "'on loading'", "'use cache'", "'['", "'type'", "'size'", "']'", "'plan'", "'{'", "'}'", "'after'", "'fetch'", "'%'", "'.'"
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
    public static final int T__19=19;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleCache"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:88:1: entryRuleCache : ruleCache EOF ;
    public final void entryRuleCache() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:89:1: ( ruleCache EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:90:1: ruleCache EOF
            {
             before(grammarAccess.getCacheRule()); 
            pushFollow(FOLLOW_ruleCache_in_entryRuleCache121);
            ruleCache();

            state._fsp--;

             after(grammarAccess.getCacheRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCache128); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:97:1: ruleCache : ( ( rule__Cache__Group__0 ) ) ;
    public final void ruleCache() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:101:2: ( ( ( rule__Cache__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:102:1: ( ( rule__Cache__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:102:1: ( ( rule__Cache__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:103:1: ( rule__Cache__Group__0 )
            {
             before(grammarAccess.getCacheAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:104:1: ( rule__Cache__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:104:2: rule__Cache__Group__0
            {
            pushFollow(FOLLOW_rule__Cache__Group__0_in_ruleCache154);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:116:1: entryRuleCacheProperties : ruleCacheProperties EOF ;
    public final void entryRuleCacheProperties() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:117:1: ( ruleCacheProperties EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:118:1: ruleCacheProperties EOF
            {
             before(grammarAccess.getCachePropertiesRule()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties181);
            ruleCacheProperties();

            state._fsp--;

             after(grammarAccess.getCachePropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCacheProperties188); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:125:1: ruleCacheProperties : ( ( rule__CacheProperties__Group__0 ) ) ;
    public final void ruleCacheProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:129:2: ( ( ( rule__CacheProperties__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:130:1: ( ( rule__CacheProperties__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:130:1: ( ( rule__CacheProperties__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:131:1: ( rule__CacheProperties__Group__0 )
            {
             before(grammarAccess.getCachePropertiesAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:132:1: ( rule__CacheProperties__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:132:2: rule__CacheProperties__Group__0
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__0_in_ruleCacheProperties214);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:144:1: entryRulePlan : rulePlan EOF ;
    public final void entryRulePlan() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:145:1: ( rulePlan EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:146:1: rulePlan EOF
            {
             before(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan241);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getPlanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan248); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:153:1: rulePlan : ( ( rule__Plan__Group__0 ) ) ;
    public final void rulePlan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:157:2: ( ( ( rule__Plan__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:158:1: ( ( rule__Plan__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:158:1: ( ( rule__Plan__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:159:1: ( rule__Plan__Group__0 )
            {
             before(grammarAccess.getPlanAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:160:1: ( rule__Plan__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:160:2: rule__Plan__Group__0
            {
            pushFollow(FOLLOW_rule__Plan__Group__0_in_rulePlan274);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:172:1: entryRuleAfterRule : ruleAfterRule EOF ;
    public final void entryRuleAfterRule() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:173:1: ( ruleAfterRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:174:1: ruleAfterRule EOF
            {
             before(grammarAccess.getAfterRuleRule()); 
            pushFollow(FOLLOW_ruleAfterRule_in_entryRuleAfterRule301);
            ruleAfterRule();

            state._fsp--;

             after(grammarAccess.getAfterRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterRule308); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:181:1: ruleAfterRule : ( ( rule__AfterRule__Group__0 ) ) ;
    public final void ruleAfterRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:185:2: ( ( ( rule__AfterRule__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:186:1: ( ( rule__AfterRule__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:186:1: ( ( rule__AfterRule__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:187:1: ( rule__AfterRule__Group__0 )
            {
             before(grammarAccess.getAfterRuleAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:188:1: ( rule__AfterRule__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:188:2: rule__AfterRule__Group__0
            {
            pushFollow(FOLLOW_rule__AfterRule__Group__0_in_ruleAfterRule334);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:200:1: entryRulePrefetchingRule : rulePrefetchingRule EOF ;
    public final void entryRulePrefetchingRule() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:201:1: ( rulePrefetchingRule EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:202:1: rulePrefetchingRule EOF
            {
             before(grammarAccess.getPrefetchingRuleRule()); 
            pushFollow(FOLLOW_rulePrefetchingRule_in_entryRulePrefetchingRule361);
            rulePrefetchingRule();

            state._fsp--;

             after(grammarAccess.getPrefetchingRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefetchingRule368); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:209:1: rulePrefetchingRule : ( ( rule__PrefetchingRule__Group__0 ) ) ;
    public final void rulePrefetchingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:213:2: ( ( ( rule__PrefetchingRule__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:214:1: ( ( rule__PrefetchingRule__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:214:1: ( ( rule__PrefetchingRule__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:215:1: ( rule__PrefetchingRule__Group__0 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:216:1: ( rule__PrefetchingRule__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:216:2: rule__PrefetchingRule__Group__0
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__0_in_rulePrefetchingRule394);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:228:1: entryRuleSourcePattern : ruleSourcePattern EOF ;
    public final void entryRuleSourcePattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:229:1: ( ruleSourcePattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:230:1: ruleSourcePattern EOF
            {
             before(grammarAccess.getSourcePatternRule()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern421);
            ruleSourcePattern();

            state._fsp--;

             after(grammarAccess.getSourcePatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourcePattern428); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:237:1: ruleSourcePattern : ( ( rule__SourcePattern__Group__0 ) ) ;
    public final void ruleSourcePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:241:2: ( ( ( rule__SourcePattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:242:1: ( ( rule__SourcePattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:242:1: ( ( rule__SourcePattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:243:1: ( rule__SourcePattern__Group__0 )
            {
             before(grammarAccess.getSourcePatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:244:1: ( rule__SourcePattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:244:2: rule__SourcePattern__Group__0
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__0_in_ruleSourcePattern454);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:256:1: entryRuleFilterPattern : ruleFilterPattern EOF ;
    public final void entryRuleFilterPattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:257:1: ( ruleFilterPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:258:1: ruleFilterPattern EOF
            {
             before(grammarAccess.getFilterPatternRule()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern481);
            ruleFilterPattern();

            state._fsp--;

             after(grammarAccess.getFilterPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern488); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:265:1: ruleFilterPattern : ( ( rule__FilterPattern__Group__0 ) ) ;
    public final void ruleFilterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:269:2: ( ( ( rule__FilterPattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__FilterPattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:270:1: ( ( rule__FilterPattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:271:1: ( rule__FilterPattern__Group__0 )
            {
             before(grammarAccess.getFilterPatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:1: ( rule__FilterPattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:272:2: rule__FilterPattern__Group__0
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__0_in_ruleFilterPattern514);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:284:1: entryRuleTargetPattern : ruleTargetPattern EOF ;
    public final void entryRuleTargetPattern() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:285:1: ( ruleTargetPattern EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:286:1: ruleTargetPattern EOF
            {
             before(grammarAccess.getTargetPatternRule()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern541);
            ruleTargetPattern();

            state._fsp--;

             after(grammarAccess.getTargetPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetPattern548); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:293:1: ruleTargetPattern : ( ( rule__TargetPattern__Group__0 ) ) ;
    public final void ruleTargetPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:297:2: ( ( ( rule__TargetPattern__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:298:1: ( ( rule__TargetPattern__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:298:1: ( ( rule__TargetPattern__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:299:1: ( rule__TargetPattern__Group__0 )
            {
             before(grammarAccess.getTargetPatternAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:300:1: ( rule__TargetPattern__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:300:2: rule__TargetPattern__Group__0
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__0_in_ruleTargetPattern574);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:312:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:313:1: ( ruleQualifiedName EOF )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:314:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName608); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:321:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:325:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:327:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:328:1: ( rule__QualifiedName__Group__0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:328:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName634);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:341:1: ruleCacheType : ( ( rule__CacheType__Alternatives ) ) ;
    public final void ruleCacheType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:345:1: ( ( ( rule__CacheType__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:346:1: ( ( rule__CacheType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:346:1: ( ( rule__CacheType__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:347:1: ( rule__CacheType__Alternatives )
            {
             before(grammarAccess.getCacheTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:348:1: ( rule__CacheType__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:348:2: rule__CacheType__Alternatives
            {
            pushFollow(FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType671);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:360:1: ruleRefType : ( ( rule__RefType__Alternatives ) ) ;
    public final void ruleRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:364:1: ( ( ( rule__RefType__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:365:1: ( ( rule__RefType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:365:1: ( ( rule__RefType__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:366:1: ( rule__RefType__Alternatives )
            {
             before(grammarAccess.getRefTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:367:1: ( rule__RefType__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:367:2: rule__RefType__Alternatives
            {
            pushFollow(FOLLOW_rule__RefType__Alternatives_in_ruleRefType707);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:379:1: ruleMoment : ( ( rule__Moment__Alternatives ) ) ;
    public final void ruleMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:383:1: ( ( ( rule__Moment__Alternatives ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:384:1: ( ( rule__Moment__Alternatives ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:384:1: ( ( rule__Moment__Alternatives ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:385:1: ( rule__Moment__Alternatives )
            {
             before(grammarAccess.getMomentAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:386:1: ( rule__Moment__Alternatives )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:386:2: rule__Moment__Alternatives
            {
            pushFollow(FOLLOW_rule__Moment__Alternatives_in_ruleMoment743);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:397:1: rule__CacheType__Alternatives : ( ( ( 'LRU' ) ) | ( ( 'PREDICTIVE' ) ) );
    public final void rule__CacheType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:401:1: ( ( ( 'LRU' ) ) | ( ( 'PREDICTIVE' ) ) )
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
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:402:1: ( ( 'LRU' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:402:1: ( ( 'LRU' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:403:1: ( 'LRU' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:404:1: ( 'LRU' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:404:3: 'LRU'
                    {
                    match(input,11,FOLLOW_11_in_rule__CacheType__Alternatives779); 

                    }

                     after(grammarAccess.getCacheTypeAccess().getLRUEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:409:6: ( ( 'PREDICTIVE' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:409:6: ( ( 'PREDICTIVE' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:410:1: ( 'PREDICTIVE' )
                    {
                     before(grammarAccess.getCacheTypeAccess().getPREDICTIVEEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:411:1: ( 'PREDICTIVE' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:411:3: 'PREDICTIVE'
                    {
                    match(input,12,FOLLOW_12_in_rule__CacheType__Alternatives800); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:421:1: rule__RefType__Alternatives : ( ( ( 'strong' ) ) | ( ( 'soft' ) ) | ( ( 'weak' ) ) );
    public final void rule__RefType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:425:1: ( ( ( 'strong' ) ) | ( ( 'soft' ) ) | ( ( 'weak' ) ) )
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
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:426:1: ( ( 'strong' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:426:1: ( ( 'strong' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:427:1: ( 'strong' )
                    {
                     before(grammarAccess.getRefTypeAccess().getSTRONGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:428:1: ( 'strong' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:428:3: 'strong'
                    {
                    match(input,13,FOLLOW_13_in_rule__RefType__Alternatives836); 

                    }

                     after(grammarAccess.getRefTypeAccess().getSTRONGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:433:6: ( ( 'soft' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:433:6: ( ( 'soft' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:434:1: ( 'soft' )
                    {
                     before(grammarAccess.getRefTypeAccess().getSOFTEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:435:1: ( 'soft' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:435:3: 'soft'
                    {
                    match(input,14,FOLLOW_14_in_rule__RefType__Alternatives857); 

                    }

                     after(grammarAccess.getRefTypeAccess().getSOFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:440:6: ( ( 'weak' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:440:6: ( ( 'weak' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:441:1: ( 'weak' )
                    {
                     before(grammarAccess.getRefTypeAccess().getWEAKEnumLiteralDeclaration_2()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:442:1: ( 'weak' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:442:3: 'weak'
                    {
                    match(input,15,FOLLOW_15_in_rule__RefType__Alternatives878); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:452:1: rule__Moment__Alternatives : ( ( ( 'on starting' ) ) | ( ( 'on loading' ) ) );
    public final void rule__Moment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:456:1: ( ( ( 'on starting' ) ) | ( ( 'on loading' ) ) )
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
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:457:1: ( ( 'on starting' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:457:1: ( ( 'on starting' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:458:1: ( 'on starting' )
                    {
                     before(grammarAccess.getMomentAccess().getON_STARTINGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:459:1: ( 'on starting' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:459:3: 'on starting'
                    {
                    match(input,16,FOLLOW_16_in_rule__Moment__Alternatives914); 

                    }

                     after(grammarAccess.getMomentAccess().getON_STARTINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:464:6: ( ( 'on loading' ) )
                    {
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:464:6: ( ( 'on loading' ) )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:465:1: ( 'on loading' )
                    {
                     before(grammarAccess.getMomentAccess().getON_LOADINGEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:466:1: ( 'on loading' )
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:466:3: 'on loading'
                    {
                    match(input,17,FOLLOW_17_in_rule__Moment__Alternatives935); 

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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:478:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:482:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:483:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0968);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0971);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:490:1: rule__Model__Group__0__Impl : ( ( rule__Model__CacheAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:494:1: ( ( ( rule__Model__CacheAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:495:1: ( ( rule__Model__CacheAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:495:1: ( ( rule__Model__CacheAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:496:1: ( rule__Model__CacheAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getCacheAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:497:1: ( rule__Model__CacheAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:497:2: rule__Model__CacheAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__CacheAssignment_0_in_rule__Model__Group__0__Impl998);
            rule__Model__CacheAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getCacheAssignment_0()); 

            }


            }

        }
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:507:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:511:1: ( rule__Model__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:512:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11028);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:518:1: rule__Model__Group__1__Impl : ( ( rule__Model__PlansAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:522:1: ( ( ( rule__Model__PlansAssignment_1 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:523:1: ( ( rule__Model__PlansAssignment_1 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:523:1: ( ( rule__Model__PlansAssignment_1 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:524:1: ( rule__Model__PlansAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPlansAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:525:1: ( rule__Model__PlansAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:525:2: rule__Model__PlansAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__PlansAssignment_1_in_rule__Model__Group__1__Impl1055);
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


    // $ANTLR start "rule__Cache__Group__0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:539:1: rule__Cache__Group__0 : rule__Cache__Group__0__Impl rule__Cache__Group__1 ;
    public final void rule__Cache__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:543:1: ( rule__Cache__Group__0__Impl rule__Cache__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:544:2: rule__Cache__Group__0__Impl rule__Cache__Group__1
            {
            pushFollow(FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01090);
            rule__Cache__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01093);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:551:1: rule__Cache__Group__0__Impl : ( 'use cache' ) ;
    public final void rule__Cache__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:555:1: ( ( 'use cache' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:556:1: ( 'use cache' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:556:1: ( 'use cache' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:557:1: 'use cache'
            {
             before(grammarAccess.getCacheAccess().getUseCacheKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Cache__Group__0__Impl1121); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:570:1: rule__Cache__Group__1 : rule__Cache__Group__1__Impl rule__Cache__Group__2 ;
    public final void rule__Cache__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:574:1: ( rule__Cache__Group__1__Impl rule__Cache__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:575:2: rule__Cache__Group__1__Impl rule__Cache__Group__2
            {
            pushFollow(FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11152);
            rule__Cache__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11155);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:582:1: rule__Cache__Group__1__Impl : ( ( rule__Cache__TypeAssignment_1 ) ) ;
    public final void rule__Cache__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:586:1: ( ( ( rule__Cache__TypeAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:587:1: ( ( rule__Cache__TypeAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:587:1: ( ( rule__Cache__TypeAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:588:1: ( rule__Cache__TypeAssignment_1 )
            {
             before(grammarAccess.getCacheAccess().getTypeAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:589:1: ( rule__Cache__TypeAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:589:2: rule__Cache__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1182);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:599:1: rule__Cache__Group__2 : rule__Cache__Group__2__Impl ;
    public final void rule__Cache__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:603:1: ( rule__Cache__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:604:2: rule__Cache__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21212);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:610:1: rule__Cache__Group__2__Impl : ( ( rule__Cache__PropertiesAssignment_2 )? ) ;
    public final void rule__Cache__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:614:1: ( ( ( rule__Cache__PropertiesAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:615:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:615:1: ( ( rule__Cache__PropertiesAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:616:1: ( rule__Cache__PropertiesAssignment_2 )?
            {
             before(grammarAccess.getCacheAccess().getPropertiesAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:617:1: ( rule__Cache__PropertiesAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:617:2: rule__Cache__PropertiesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1239);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:633:1: rule__CacheProperties__Group__0 : rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 ;
    public final void rule__CacheProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:637:1: ( rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:638:2: rule__CacheProperties__Group__0__Impl rule__CacheProperties__Group__1
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01276);
            rule__CacheProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01279);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:645:1: rule__CacheProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__CacheProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:649:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:650:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:650:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:651:1: '['
            {
             before(grammarAccess.getCachePropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__CacheProperties__Group__0__Impl1307); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:664:1: rule__CacheProperties__Group__1 : rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 ;
    public final void rule__CacheProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:668:1: ( rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:669:2: rule__CacheProperties__Group__1__Impl rule__CacheProperties__Group__2
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11338);
            rule__CacheProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11341);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:676:1: rule__CacheProperties__Group__1__Impl : ( 'type' ) ;
    public final void rule__CacheProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:680:1: ( ( 'type' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:681:1: ( 'type' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:681:1: ( 'type' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:682:1: 'type'
            {
             before(grammarAccess.getCachePropertiesAccess().getTypeKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__CacheProperties__Group__1__Impl1369); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:695:1: rule__CacheProperties__Group__2 : rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 ;
    public final void rule__CacheProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:699:1: ( rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:700:2: rule__CacheProperties__Group__2__Impl rule__CacheProperties__Group__3
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21400);
            rule__CacheProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21403);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:707:1: rule__CacheProperties__Group__2__Impl : ( ( rule__CacheProperties__RefTypeAssignment_2 ) ) ;
    public final void rule__CacheProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:711:1: ( ( ( rule__CacheProperties__RefTypeAssignment_2 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:712:1: ( ( rule__CacheProperties__RefTypeAssignment_2 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:712:1: ( ( rule__CacheProperties__RefTypeAssignment_2 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:713:1: ( rule__CacheProperties__RefTypeAssignment_2 )
            {
             before(grammarAccess.getCachePropertiesAccess().getRefTypeAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:714:1: ( rule__CacheProperties__RefTypeAssignment_2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:714:2: rule__CacheProperties__RefTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__CacheProperties__RefTypeAssignment_2_in_rule__CacheProperties__Group__2__Impl1430);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:724:1: rule__CacheProperties__Group__3 : rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4 ;
    public final void rule__CacheProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:728:1: ( rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:729:2: rule__CacheProperties__Group__3__Impl rule__CacheProperties__Group__4
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31460);
            rule__CacheProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__4_in_rule__CacheProperties__Group__31463);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:736:1: rule__CacheProperties__Group__3__Impl : ( 'size' ) ;
    public final void rule__CacheProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:740:1: ( ( 'size' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:741:1: ( 'size' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:741:1: ( 'size' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:742:1: 'size'
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__CacheProperties__Group__3__Impl1491); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:755:1: rule__CacheProperties__Group__4 : rule__CacheProperties__Group__4__Impl rule__CacheProperties__Group__5 ;
    public final void rule__CacheProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:759:1: ( rule__CacheProperties__Group__4__Impl rule__CacheProperties__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:760:2: rule__CacheProperties__Group__4__Impl rule__CacheProperties__Group__5
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__4__Impl_in_rule__CacheProperties__Group__41522);
            rule__CacheProperties__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CacheProperties__Group__5_in_rule__CacheProperties__Group__41525);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:767:1: rule__CacheProperties__Group__4__Impl : ( ( rule__CacheProperties__SizeAssignment_4 ) ) ;
    public final void rule__CacheProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:771:1: ( ( ( rule__CacheProperties__SizeAssignment_4 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:772:1: ( ( rule__CacheProperties__SizeAssignment_4 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:772:1: ( ( rule__CacheProperties__SizeAssignment_4 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:773:1: ( rule__CacheProperties__SizeAssignment_4 )
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeAssignment_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:774:1: ( rule__CacheProperties__SizeAssignment_4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:774:2: rule__CacheProperties__SizeAssignment_4
            {
            pushFollow(FOLLOW_rule__CacheProperties__SizeAssignment_4_in_rule__CacheProperties__Group__4__Impl1552);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:784:1: rule__CacheProperties__Group__5 : rule__CacheProperties__Group__5__Impl ;
    public final void rule__CacheProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:788:1: ( rule__CacheProperties__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:789:2: rule__CacheProperties__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CacheProperties__Group__5__Impl_in_rule__CacheProperties__Group__51582);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:795:1: rule__CacheProperties__Group__5__Impl : ( ']' ) ;
    public final void rule__CacheProperties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:799:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:800:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:800:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:801:1: ']'
            {
             before(grammarAccess.getCachePropertiesAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__CacheProperties__Group__5__Impl1610); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:826:1: rule__Plan__Group__0 : rule__Plan__Group__0__Impl rule__Plan__Group__1 ;
    public final void rule__Plan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:830:1: ( rule__Plan__Group__0__Impl rule__Plan__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:831:2: rule__Plan__Group__0__Impl rule__Plan__Group__1
            {
            pushFollow(FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01653);
            rule__Plan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01656);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:838:1: rule__Plan__Group__0__Impl : ( 'plan' ) ;
    public final void rule__Plan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:842:1: ( ( 'plan' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:843:1: ( 'plan' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:843:1: ( 'plan' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:844:1: 'plan'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Plan__Group__0__Impl1684); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:857:1: rule__Plan__Group__1 : rule__Plan__Group__1__Impl rule__Plan__Group__2 ;
    public final void rule__Plan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:861:1: ( rule__Plan__Group__1__Impl rule__Plan__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:862:2: rule__Plan__Group__1__Impl rule__Plan__Group__2
            {
            pushFollow(FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11715);
            rule__Plan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11718);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:869:1: rule__Plan__Group__1__Impl : ( ( rule__Plan__PlanIdAssignment_1 ) ) ;
    public final void rule__Plan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:873:1: ( ( ( rule__Plan__PlanIdAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:874:1: ( ( rule__Plan__PlanIdAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:874:1: ( ( rule__Plan__PlanIdAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:875:1: ( rule__Plan__PlanIdAssignment_1 )
            {
             before(grammarAccess.getPlanAccess().getPlanIdAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:876:1: ( rule__Plan__PlanIdAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:876:2: rule__Plan__PlanIdAssignment_1
            {
            pushFollow(FOLLOW_rule__Plan__PlanIdAssignment_1_in_rule__Plan__Group__1__Impl1745);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:886:1: rule__Plan__Group__2 : rule__Plan__Group__2__Impl rule__Plan__Group__3 ;
    public final void rule__Plan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:890:1: ( rule__Plan__Group__2__Impl rule__Plan__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:891:2: rule__Plan__Group__2__Impl rule__Plan__Group__3
            {
            pushFollow(FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__21775);
            rule__Plan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__21778);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:898:1: rule__Plan__Group__2__Impl : ( ( rule__Plan__AfterAssignment_2 )? ) ;
    public final void rule__Plan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:902:1: ( ( ( rule__Plan__AfterAssignment_2 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:903:1: ( ( rule__Plan__AfterAssignment_2 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:903:1: ( ( rule__Plan__AfterAssignment_2 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:904:1: ( rule__Plan__AfterAssignment_2 )?
            {
             before(grammarAccess.getPlanAccess().getAfterAssignment_2()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:905:1: ( rule__Plan__AfterAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:905:2: rule__Plan__AfterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl1805);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:915:1: rule__Plan__Group__3 : rule__Plan__Group__3__Impl rule__Plan__Group__4 ;
    public final void rule__Plan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:919:1: ( rule__Plan__Group__3__Impl rule__Plan__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:920:2: rule__Plan__Group__3__Impl rule__Plan__Group__4
            {
            pushFollow(FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__31836);
            rule__Plan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__31839);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:927:1: rule__Plan__Group__3__Impl : ( '{' ) ;
    public final void rule__Plan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:931:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:932:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:932:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:933:1: '{'
            {
             before(grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Plan__Group__3__Impl1867); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:946:1: rule__Plan__Group__4 : rule__Plan__Group__4__Impl rule__Plan__Group__5 ;
    public final void rule__Plan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:950:1: ( rule__Plan__Group__4__Impl rule__Plan__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:951:2: rule__Plan__Group__4__Impl rule__Plan__Group__5
            {
            pushFollow(FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__41898);
            rule__Plan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__41901);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:958:1: rule__Plan__Group__4__Impl : ( ( rule__Plan__RulesAssignment_4 )* ) ;
    public final void rule__Plan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:962:1: ( ( ( rule__Plan__RulesAssignment_4 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:963:1: ( ( rule__Plan__RulesAssignment_4 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:963:1: ( ( rule__Plan__RulesAssignment_4 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:964:1: ( rule__Plan__RulesAssignment_4 )*
            {
             before(grammarAccess.getPlanAccess().getRulesAssignment_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:965:1: ( rule__Plan__RulesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:965:2: rule__Plan__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Plan__RulesAssignment_4_in_rule__Plan__Group__4__Impl1928);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:975:1: rule__Plan__Group__5 : rule__Plan__Group__5__Impl ;
    public final void rule__Plan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:979:1: ( rule__Plan__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:980:2: rule__Plan__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__51959);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:986:1: rule__Plan__Group__5__Impl : ( '}' ) ;
    public final void rule__Plan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:990:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:991:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:991:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:992:1: '}'
            {
             before(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Plan__Group__5__Impl1987); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1017:1: rule__AfterRule__Group__0 : rule__AfterRule__Group__0__Impl rule__AfterRule__Group__1 ;
    public final void rule__AfterRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1021:1: ( rule__AfterRule__Group__0__Impl rule__AfterRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1022:2: rule__AfterRule__Group__0__Impl rule__AfterRule__Group__1
            {
            pushFollow(FOLLOW_rule__AfterRule__Group__0__Impl_in_rule__AfterRule__Group__02030);
            rule__AfterRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AfterRule__Group__1_in_rule__AfterRule__Group__02033);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1029:1: rule__AfterRule__Group__0__Impl : ( 'after' ) ;
    public final void rule__AfterRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1033:1: ( ( 'after' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1034:1: ( 'after' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1034:1: ( 'after' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1035:1: 'after'
            {
             before(grammarAccess.getAfterRuleAccess().getAfterKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__AfterRule__Group__0__Impl2061); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1048:1: rule__AfterRule__Group__1 : rule__AfterRule__Group__1__Impl ;
    public final void rule__AfterRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1052:1: ( rule__AfterRule__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1053:2: rule__AfterRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AfterRule__Group__1__Impl_in_rule__AfterRule__Group__12092);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1059:1: rule__AfterRule__Group__1__Impl : ( ( rule__AfterRule__PlanIdAssignment_1 ) ) ;
    public final void rule__AfterRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1063:1: ( ( ( rule__AfterRule__PlanIdAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1064:1: ( ( rule__AfterRule__PlanIdAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1064:1: ( ( rule__AfterRule__PlanIdAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1065:1: ( rule__AfterRule__PlanIdAssignment_1 )
            {
             before(grammarAccess.getAfterRuleAccess().getPlanIdAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1066:1: ( rule__AfterRule__PlanIdAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1066:2: rule__AfterRule__PlanIdAssignment_1
            {
            pushFollow(FOLLOW_rule__AfterRule__PlanIdAssignment_1_in_rule__AfterRule__Group__1__Impl2119);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1080:1: rule__PrefetchingRule__Group__0 : rule__PrefetchingRule__Group__0__Impl rule__PrefetchingRule__Group__1 ;
    public final void rule__PrefetchingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1084:1: ( rule__PrefetchingRule__Group__0__Impl rule__PrefetchingRule__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1085:2: rule__PrefetchingRule__Group__0__Impl rule__PrefetchingRule__Group__1
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__0__Impl_in_rule__PrefetchingRule__Group__02153);
            rule__PrefetchingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__1_in_rule__PrefetchingRule__Group__02156);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1092:1: rule__PrefetchingRule__Group__0__Impl : ( ( rule__PrefetchingRule__MomentAssignment_0 ) ) ;
    public final void rule__PrefetchingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1096:1: ( ( ( rule__PrefetchingRule__MomentAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1097:1: ( ( rule__PrefetchingRule__MomentAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1097:1: ( ( rule__PrefetchingRule__MomentAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1098:1: ( rule__PrefetchingRule__MomentAssignment_0 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getMomentAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1099:1: ( rule__PrefetchingRule__MomentAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1099:2: rule__PrefetchingRule__MomentAssignment_0
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__MomentAssignment_0_in_rule__PrefetchingRule__Group__0__Impl2183);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1109:1: rule__PrefetchingRule__Group__1 : rule__PrefetchingRule__Group__1__Impl rule__PrefetchingRule__Group__2 ;
    public final void rule__PrefetchingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1113:1: ( rule__PrefetchingRule__Group__1__Impl rule__PrefetchingRule__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1114:2: rule__PrefetchingRule__Group__1__Impl rule__PrefetchingRule__Group__2
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__1__Impl_in_rule__PrefetchingRule__Group__12213);
            rule__PrefetchingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__2_in_rule__PrefetchingRule__Group__12216);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1121:1: rule__PrefetchingRule__Group__1__Impl : ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? ) ;
    public final void rule__PrefetchingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1125:1: ( ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1126:1: ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1126:1: ( ( rule__PrefetchingRule__SourcePatternAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1127:1: ( rule__PrefetchingRule__SourcePatternAssignment_1 )?
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSourcePatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1128:1: ( rule__PrefetchingRule__SourcePatternAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1128:2: rule__PrefetchingRule__SourcePatternAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PrefetchingRule__SourcePatternAssignment_1_in_rule__PrefetchingRule__Group__1__Impl2243);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1138:1: rule__PrefetchingRule__Group__2 : rule__PrefetchingRule__Group__2__Impl rule__PrefetchingRule__Group__3 ;
    public final void rule__PrefetchingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1142:1: ( rule__PrefetchingRule__Group__2__Impl rule__PrefetchingRule__Group__3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1143:2: rule__PrefetchingRule__Group__2__Impl rule__PrefetchingRule__Group__3
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__2__Impl_in_rule__PrefetchingRule__Group__22274);
            rule__PrefetchingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__3_in_rule__PrefetchingRule__Group__22277);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1150:1: rule__PrefetchingRule__Group__2__Impl : ( 'fetch' ) ;
    public final void rule__PrefetchingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1154:1: ( ( 'fetch' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1155:1: ( 'fetch' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1155:1: ( 'fetch' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1156:1: 'fetch'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getFetchKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__PrefetchingRule__Group__2__Impl2305); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1169:1: rule__PrefetchingRule__Group__3 : rule__PrefetchingRule__Group__3__Impl rule__PrefetchingRule__Group__4 ;
    public final void rule__PrefetchingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1173:1: ( rule__PrefetchingRule__Group__3__Impl rule__PrefetchingRule__Group__4 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1174:2: rule__PrefetchingRule__Group__3__Impl rule__PrefetchingRule__Group__4
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__3__Impl_in_rule__PrefetchingRule__Group__32336);
            rule__PrefetchingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__4_in_rule__PrefetchingRule__Group__32339);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1181:1: rule__PrefetchingRule__Group__3__Impl : ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) ) ;
    public final void rule__PrefetchingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1185:1: ( ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1186:1: ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1186:1: ( ( rule__PrefetchingRule__TargetPatternAssignment_3 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1187:1: ( rule__PrefetchingRule__TargetPatternAssignment_3 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getTargetPatternAssignment_3()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1188:1: ( rule__PrefetchingRule__TargetPatternAssignment_3 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1188:2: rule__PrefetchingRule__TargetPatternAssignment_3
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__TargetPatternAssignment_3_in_rule__PrefetchingRule__Group__3__Impl2366);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1198:1: rule__PrefetchingRule__Group__4 : rule__PrefetchingRule__Group__4__Impl rule__PrefetchingRule__Group__5 ;
    public final void rule__PrefetchingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1202:1: ( rule__PrefetchingRule__Group__4__Impl rule__PrefetchingRule__Group__5 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1203:2: rule__PrefetchingRule__Group__4__Impl rule__PrefetchingRule__Group__5
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__4__Impl_in_rule__PrefetchingRule__Group__42396);
            rule__PrefetchingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group__5_in_rule__PrefetchingRule__Group__42399);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1210:1: rule__PrefetchingRule__Group__4__Impl : ( ( rule__PrefetchingRule__Group_4__0 )? ) ;
    public final void rule__PrefetchingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1214:1: ( ( ( rule__PrefetchingRule__Group_4__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1215:1: ( ( rule__PrefetchingRule__Group_4__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1215:1: ( ( rule__PrefetchingRule__Group_4__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1216:1: ( rule__PrefetchingRule__Group_4__0 )?
            {
             before(grammarAccess.getPrefetchingRuleAccess().getGroup_4()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1217:1: ( rule__PrefetchingRule__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1217:2: rule__PrefetchingRule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__0_in_rule__PrefetchingRule__Group__4__Impl2426);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1227:1: rule__PrefetchingRule__Group__5 : rule__PrefetchingRule__Group__5__Impl ;
    public final void rule__PrefetchingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1231:1: ( rule__PrefetchingRule__Group__5__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1232:2: rule__PrefetchingRule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group__5__Impl_in_rule__PrefetchingRule__Group__52457);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1238:1: rule__PrefetchingRule__Group__5__Impl : ( ( rule__PrefetchingRule__Group_5__0 )? ) ;
    public final void rule__PrefetchingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1242:1: ( ( ( rule__PrefetchingRule__Group_5__0 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1243:1: ( ( rule__PrefetchingRule__Group_5__0 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1243:1: ( ( rule__PrefetchingRule__Group_5__0 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1244:1: ( rule__PrefetchingRule__Group_5__0 )?
            {
             before(grammarAccess.getPrefetchingRuleAccess().getGroup_5()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1245:1: ( rule__PrefetchingRule__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1245:2: rule__PrefetchingRule__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__0_in_rule__PrefetchingRule__Group__5__Impl2484);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1267:1: rule__PrefetchingRule__Group_4__0 : rule__PrefetchingRule__Group_4__0__Impl rule__PrefetchingRule__Group_4__1 ;
    public final void rule__PrefetchingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1271:1: ( rule__PrefetchingRule__Group_4__0__Impl rule__PrefetchingRule__Group_4__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1272:2: rule__PrefetchingRule__Group_4__0__Impl rule__PrefetchingRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__0__Impl_in_rule__PrefetchingRule__Group_4__02527);
            rule__PrefetchingRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__1_in_rule__PrefetchingRule__Group_4__02530);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1279:1: rule__PrefetchingRule__Group_4__0__Impl : ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) ) ;
    public final void rule__PrefetchingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1283:1: ( ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1284:1: ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1284:1: ( ( rule__PrefetchingRule__ProbabilityAssignment_4_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1285:1: ( rule__PrefetchingRule__ProbabilityAssignment_4_0 )
            {
             before(grammarAccess.getPrefetchingRuleAccess().getProbabilityAssignment_4_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1286:1: ( rule__PrefetchingRule__ProbabilityAssignment_4_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1286:2: rule__PrefetchingRule__ProbabilityAssignment_4_0
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__ProbabilityAssignment_4_0_in_rule__PrefetchingRule__Group_4__0__Impl2557);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1296:1: rule__PrefetchingRule__Group_4__1 : rule__PrefetchingRule__Group_4__1__Impl ;
    public final void rule__PrefetchingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1300:1: ( rule__PrefetchingRule__Group_4__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1301:2: rule__PrefetchingRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_4__1__Impl_in_rule__PrefetchingRule__Group_4__12587);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1307:1: rule__PrefetchingRule__Group_4__1__Impl : ( '%' ) ;
    public final void rule__PrefetchingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1311:1: ( ( '%' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1312:1: ( '%' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1312:1: ( '%' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1313:1: '%'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getPercentSignKeyword_4_1()); 
            match(input,28,FOLLOW_28_in_rule__PrefetchingRule__Group_4__1__Impl2615); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1330:1: rule__PrefetchingRule__Group_5__0 : rule__PrefetchingRule__Group_5__0__Impl rule__PrefetchingRule__Group_5__1 ;
    public final void rule__PrefetchingRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1334:1: ( rule__PrefetchingRule__Group_5__0__Impl rule__PrefetchingRule__Group_5__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1335:2: rule__PrefetchingRule__Group_5__0__Impl rule__PrefetchingRule__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__0__Impl_in_rule__PrefetchingRule__Group_5__02650);
            rule__PrefetchingRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__1_in_rule__PrefetchingRule__Group_5__02653);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1342:1: rule__PrefetchingRule__Group_5__0__Impl : ( '{' ) ;
    public final void rule__PrefetchingRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1346:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1347:1: ( '{' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1347:1: ( '{' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1348:1: '{'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__PrefetchingRule__Group_5__0__Impl2681); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1361:1: rule__PrefetchingRule__Group_5__1 : rule__PrefetchingRule__Group_5__1__Impl rule__PrefetchingRule__Group_5__2 ;
    public final void rule__PrefetchingRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1365:1: ( rule__PrefetchingRule__Group_5__1__Impl rule__PrefetchingRule__Group_5__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1366:2: rule__PrefetchingRule__Group_5__1__Impl rule__PrefetchingRule__Group_5__2
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__1__Impl_in_rule__PrefetchingRule__Group_5__12712);
            rule__PrefetchingRule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__2_in_rule__PrefetchingRule__Group_5__12715);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1373:1: rule__PrefetchingRule__Group_5__1__Impl : ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* ) ;
    public final void rule__PrefetchingRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1377:1: ( ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1378:1: ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1378:1: ( ( rule__PrefetchingRule__SubRulesAssignment_5_1 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1379:1: ( rule__PrefetchingRule__SubRulesAssignment_5_1 )*
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSubRulesAssignment_5_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1380:1: ( rule__PrefetchingRule__SubRulesAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=16 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1380:2: rule__PrefetchingRule__SubRulesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__PrefetchingRule__SubRulesAssignment_5_1_in_rule__PrefetchingRule__Group_5__1__Impl2742);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1390:1: rule__PrefetchingRule__Group_5__2 : rule__PrefetchingRule__Group_5__2__Impl ;
    public final void rule__PrefetchingRule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1394:1: ( rule__PrefetchingRule__Group_5__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1395:2: rule__PrefetchingRule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__PrefetchingRule__Group_5__2__Impl_in_rule__PrefetchingRule__Group_5__22773);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1401:1: rule__PrefetchingRule__Group_5__2__Impl : ( '}' ) ;
    public final void rule__PrefetchingRule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1405:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1406:1: ( '}' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1406:1: ( '}' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1407:1: '}'
            {
             before(grammarAccess.getPrefetchingRuleAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,25,FOLLOW_25_in_rule__PrefetchingRule__Group_5__2__Impl2801); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1426:1: rule__SourcePattern__Group__0 : rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 ;
    public final void rule__SourcePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1430:1: ( rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1431:2: rule__SourcePattern__Group__0__Impl rule__SourcePattern__Group__1
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__02838);
            rule__SourcePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__02841);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1438:1: rule__SourcePattern__Group__0__Impl : ( ( rule__SourcePattern__PatternAssignment_0 ) ) ;
    public final void rule__SourcePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1442:1: ( ( ( rule__SourcePattern__PatternAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1443:1: ( ( rule__SourcePattern__PatternAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1443:1: ( ( rule__SourcePattern__PatternAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1444:1: ( rule__SourcePattern__PatternAssignment_0 )
            {
             before(grammarAccess.getSourcePatternAccess().getPatternAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1445:1: ( rule__SourcePattern__PatternAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1445:2: rule__SourcePattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_rule__SourcePattern__PatternAssignment_0_in_rule__SourcePattern__Group__0__Impl2868);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1455:1: rule__SourcePattern__Group__1 : rule__SourcePattern__Group__1__Impl ;
    public final void rule__SourcePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1459:1: ( rule__SourcePattern__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1460:2: rule__SourcePattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__12898);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1466:1: rule__SourcePattern__Group__1__Impl : ( ( rule__SourcePattern__FilterAssignment_1 )? ) ;
    public final void rule__SourcePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1470:1: ( ( ( rule__SourcePattern__FilterAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1471:1: ( ( rule__SourcePattern__FilterAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1471:1: ( ( rule__SourcePattern__FilterAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1472:1: ( rule__SourcePattern__FilterAssignment_1 )?
            {
             before(grammarAccess.getSourcePatternAccess().getFilterAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1473:1: ( rule__SourcePattern__FilterAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1473:2: rule__SourcePattern__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SourcePattern__FilterAssignment_1_in_rule__SourcePattern__Group__1__Impl2925);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1487:1: rule__FilterPattern__Group__0 : rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 ;
    public final void rule__FilterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1491:1: ( rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1492:2: rule__FilterPattern__Group__0__Impl rule__FilterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__02960);
            rule__FilterPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__02963);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1499:1: rule__FilterPattern__Group__0__Impl : ( '[' ) ;
    public final void rule__FilterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1503:1: ( ( '[' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1504:1: ( '[' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1504:1: ( '[' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1505:1: '['
            {
             before(grammarAccess.getFilterPatternAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__FilterPattern__Group__0__Impl2991); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1518:1: rule__FilterPattern__Group__1 : rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 ;
    public final void rule__FilterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1522:1: ( rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1523:2: rule__FilterPattern__Group__1__Impl rule__FilterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13022);
            rule__FilterPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13025);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1530:1: rule__FilterPattern__Group__1__Impl : ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) ;
    public final void rule__FilterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1534:1: ( ( ( rule__FilterPattern__StringPatternAssignment_1 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1535:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1535:1: ( ( rule__FilterPattern__StringPatternAssignment_1 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1536:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1537:1: ( rule__FilterPattern__StringPatternAssignment_1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1537:2: rule__FilterPattern__StringPatternAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3052);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1547:1: rule__FilterPattern__Group__2 : rule__FilterPattern__Group__2__Impl ;
    public final void rule__FilterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1551:1: ( rule__FilterPattern__Group__2__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1552:2: rule__FilterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23082);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1558:1: rule__FilterPattern__Group__2__Impl : ( ']' ) ;
    public final void rule__FilterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1562:1: ( ( ']' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1563:1: ( ']' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1563:1: ( ']' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1564:1: ']'
            {
             before(grammarAccess.getFilterPatternAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__FilterPattern__Group__2__Impl3110); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1583:1: rule__TargetPattern__Group__0 : rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1 ;
    public final void rule__TargetPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1587:1: ( rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1588:2: rule__TargetPattern__Group__0__Impl rule__TargetPattern__Group__1
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__0__Impl_in_rule__TargetPattern__Group__03147);
            rule__TargetPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetPattern__Group__1_in_rule__TargetPattern__Group__03150);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1595:1: rule__TargetPattern__Group__0__Impl : ( ( rule__TargetPattern__PatternAssignment_0 ) ) ;
    public final void rule__TargetPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1599:1: ( ( ( rule__TargetPattern__PatternAssignment_0 ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1600:1: ( ( rule__TargetPattern__PatternAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1600:1: ( ( rule__TargetPattern__PatternAssignment_0 ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1601:1: ( rule__TargetPattern__PatternAssignment_0 )
            {
             before(grammarAccess.getTargetPatternAccess().getPatternAssignment_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1602:1: ( rule__TargetPattern__PatternAssignment_0 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1602:2: rule__TargetPattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_rule__TargetPattern__PatternAssignment_0_in_rule__TargetPattern__Group__0__Impl3177);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1612:1: rule__TargetPattern__Group__1 : rule__TargetPattern__Group__1__Impl ;
    public final void rule__TargetPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1616:1: ( rule__TargetPattern__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1617:2: rule__TargetPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetPattern__Group__1__Impl_in_rule__TargetPattern__Group__13207);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1623:1: rule__TargetPattern__Group__1__Impl : ( ( rule__TargetPattern__FilterAssignment_1 )? ) ;
    public final void rule__TargetPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1627:1: ( ( ( rule__TargetPattern__FilterAssignment_1 )? ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1628:1: ( ( rule__TargetPattern__FilterAssignment_1 )? )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1628:1: ( ( rule__TargetPattern__FilterAssignment_1 )? )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1629:1: ( rule__TargetPattern__FilterAssignment_1 )?
            {
             before(grammarAccess.getTargetPatternAccess().getFilterAssignment_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1630:1: ( rule__TargetPattern__FilterAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1630:2: rule__TargetPattern__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TargetPattern__FilterAssignment_1_in_rule__TargetPattern__Group__1__Impl3234);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1644:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1648:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1649:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03269);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03272);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1656:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1660:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1661:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1661:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1662:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3299); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1673:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1677:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1678:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13328);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1684:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1688:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1689:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1689:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1690:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1691:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1691:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3355);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1705:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1709:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1710:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03390);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03393);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1717:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1721:1: ( ( '.' ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1722:1: ( '.' )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1722:1: ( '.' )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1723:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3421); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1736:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1740:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1741:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13452);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1747:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1751:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1752:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1752:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1753:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3479); 
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


    // $ANTLR start "rule__Model__CacheAssignment_0"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1769:1: rule__Model__CacheAssignment_0 : ( ruleCache ) ;
    public final void rule__Model__CacheAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1773:1: ( ( ruleCache ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1774:1: ( ruleCache )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1774:1: ( ruleCache )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1775:1: ruleCache
            {
             before(grammarAccess.getModelAccess().getCacheCacheParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCache_in_rule__Model__CacheAssignment_03517);
            ruleCache();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCacheCacheParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CacheAssignment_0"


    // $ANTLR start "rule__Model__PlansAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1784:1: rule__Model__PlansAssignment_1 : ( rulePlan ) ;
    public final void rule__Model__PlansAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1788:1: ( ( rulePlan ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1789:1: ( rulePlan )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1789:1: ( rulePlan )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1790:1: rulePlan
            {
             before(grammarAccess.getModelAccess().getPlansPlanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlan_in_rule__Model__PlansAssignment_13548);
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


    // $ANTLR start "rule__Cache__TypeAssignment_1"
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1799:1: rule__Cache__TypeAssignment_1 : ( ruleCacheType ) ;
    public final void rule__Cache__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1803:1: ( ( ruleCacheType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1804:1: ( ruleCacheType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1804:1: ( ruleCacheType )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1805:1: ruleCacheType
            {
             before(grammarAccess.getCacheAccess().getTypeCacheTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_13579);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1814:1: rule__Cache__PropertiesAssignment_2 : ( ruleCacheProperties ) ;
    public final void rule__Cache__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1818:1: ( ( ruleCacheProperties ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1819:1: ( ruleCacheProperties )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1819:1: ( ruleCacheProperties )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1820:1: ruleCacheProperties
            {
             before(grammarAccess.getCacheAccess().getPropertiesCachePropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_23610);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1829:1: rule__CacheProperties__RefTypeAssignment_2 : ( ruleRefType ) ;
    public final void rule__CacheProperties__RefTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1833:1: ( ( ruleRefType ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1834:1: ( ruleRefType )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1834:1: ( ruleRefType )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1835:1: ruleRefType
            {
             before(grammarAccess.getCachePropertiesAccess().getRefTypeRefTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRefType_in_rule__CacheProperties__RefTypeAssignment_23641);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1844:1: rule__CacheProperties__SizeAssignment_4 : ( RULE_INT ) ;
    public final void rule__CacheProperties__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1848:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1849:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1849:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1850:1: RULE_INT
            {
             before(grammarAccess.getCachePropertiesAccess().getSizeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_43672); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1859:1: rule__Plan__PlanIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Plan__PlanIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1863:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1864:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1864:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1865:1: RULE_ID
            {
             before(grammarAccess.getPlanAccess().getPlanIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plan__PlanIdAssignment_13703); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1874:1: rule__Plan__AfterAssignment_2 : ( ruleAfterRule ) ;
    public final void rule__Plan__AfterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1878:1: ( ( ruleAfterRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1879:1: ( ruleAfterRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1879:1: ( ruleAfterRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1880:1: ruleAfterRule
            {
             before(grammarAccess.getPlanAccess().getAfterAfterRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAfterRule_in_rule__Plan__AfterAssignment_23734);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1889:1: rule__Plan__RulesAssignment_4 : ( rulePrefetchingRule ) ;
    public final void rule__Plan__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1893:1: ( ( rulePrefetchingRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1894:1: ( rulePrefetchingRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1894:1: ( rulePrefetchingRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1895:1: rulePrefetchingRule
            {
             before(grammarAccess.getPlanAccess().getRulesPrefetchingRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePrefetchingRule_in_rule__Plan__RulesAssignment_43765);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1904:1: rule__AfterRule__PlanIdAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AfterRule__PlanIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1908:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1909:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1909:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1910:1: ( RULE_ID )
            {
             before(grammarAccess.getAfterRuleAccess().getPlanIdPlanCrossReference_1_0()); 
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1911:1: ( RULE_ID )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1912:1: RULE_ID
            {
             before(grammarAccess.getAfterRuleAccess().getPlanIdPlanIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AfterRule__PlanIdAssignment_13800); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1923:1: rule__PrefetchingRule__MomentAssignment_0 : ( ruleMoment ) ;
    public final void rule__PrefetchingRule__MomentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1927:1: ( ( ruleMoment ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1928:1: ( ruleMoment )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1928:1: ( ruleMoment )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1929:1: ruleMoment
            {
             before(grammarAccess.getPrefetchingRuleAccess().getMomentMomentEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMoment_in_rule__PrefetchingRule__MomentAssignment_03835);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1938:1: rule__PrefetchingRule__SourcePatternAssignment_1 : ( ruleSourcePattern ) ;
    public final void rule__PrefetchingRule__SourcePatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1942:1: ( ( ruleSourcePattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1943:1: ( ruleSourcePattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1943:1: ( ruleSourcePattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1944:1: ruleSourcePattern
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSourcePatternSourcePatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSourcePattern_in_rule__PrefetchingRule__SourcePatternAssignment_13866);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1953:1: rule__PrefetchingRule__TargetPatternAssignment_3 : ( ruleTargetPattern ) ;
    public final void rule__PrefetchingRule__TargetPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1957:1: ( ( ruleTargetPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1958:1: ( ruleTargetPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1958:1: ( ruleTargetPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1959:1: ruleTargetPattern
            {
             before(grammarAccess.getPrefetchingRuleAccess().getTargetPatternTargetPatternParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTargetPattern_in_rule__PrefetchingRule__TargetPatternAssignment_33897);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1968:1: rule__PrefetchingRule__ProbabilityAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__PrefetchingRule__ProbabilityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1972:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1973:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1973:1: ( RULE_INT )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1974:1: RULE_INT
            {
             before(grammarAccess.getPrefetchingRuleAccess().getProbabilityINTTerminalRuleCall_4_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrefetchingRule__ProbabilityAssignment_4_03928); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1983:1: rule__PrefetchingRule__SubRulesAssignment_5_1 : ( rulePrefetchingRule ) ;
    public final void rule__PrefetchingRule__SubRulesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1987:1: ( ( rulePrefetchingRule ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1988:1: ( rulePrefetchingRule )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1988:1: ( rulePrefetchingRule )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1989:1: rulePrefetchingRule
            {
             before(grammarAccess.getPrefetchingRuleAccess().getSubRulesPrefetchingRuleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePrefetchingRule_in_rule__PrefetchingRule__SubRulesAssignment_5_13959);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:1998:1: rule__SourcePattern__PatternAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__SourcePattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2002:1: ( ( ruleQualifiedName ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2003:1: ( ruleQualifiedName )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2003:1: ( ruleQualifiedName )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2004:1: ruleQualifiedName
            {
             before(grammarAccess.getSourcePatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SourcePattern__PatternAssignment_03990);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2013:1: rule__SourcePattern__FilterAssignment_1 : ( ruleFilterPattern ) ;
    public final void rule__SourcePattern__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2017:1: ( ( ruleFilterPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2018:1: ( ruleFilterPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2018:1: ( ruleFilterPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2019:1: ruleFilterPattern
            {
             before(grammarAccess.getSourcePatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_14021);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2028:1: rule__FilterPattern__StringPatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FilterPattern__StringPatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2032:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2033:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2033:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2034:1: RULE_STRING
            {
             before(grammarAccess.getFilterPatternAccess().getStringPatternSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_14052); 
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2043:1: rule__TargetPattern__PatternAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__TargetPattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2047:1: ( ( ruleQualifiedName ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2048:1: ( ruleQualifiedName )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2048:1: ( ruleQualifiedName )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2049:1: ruleQualifiedName
            {
             before(grammarAccess.getTargetPatternAccess().getPatternQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TargetPattern__PatternAssignment_04083);
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
    // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2058:1: rule__TargetPattern__FilterAssignment_1 : ( ruleFilterPattern ) ;
    public final void rule__TargetPattern__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2062:1: ( ( ruleFilterPattern ) )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2063:1: ( ruleFilterPattern )
            {
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2063:1: ( ruleFilterPattern )
            // ../fr.inria.atlanmod.neoemf.prefetching.ui/src-gen/fr/inria/atlanmod/neoemf/ui/contentassist/antlr/internal/InternalPrefetching.g:2064:1: ruleFilterPattern
            {
             before(grammarAccess.getTargetPatternAccess().getFilterFilterPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFilterPattern_in_rule__TargetPattern__FilterAssignment_14114);
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
    public static final BitSet FOLLOW_ruleCache_in_entryRuleCache121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCache128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__0_in_ruleCache154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_entryRuleCacheProperties181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCacheProperties188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__0_in_ruleCacheProperties214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0_in_rulePlan274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterRule_in_entryRuleAfterRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__0_in_ruleAfterRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_entryRulePrefetchingRule361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefetchingRule368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__0_in_rulePrefetchingRule394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_entryRuleSourcePattern421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourcePattern428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0_in_ruleSourcePattern454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0_in_ruleFilterPattern514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_entryRuleTargetPattern541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPattern548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__0_in_ruleTargetPattern574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheType__Alternatives_in_ruleCacheType671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefType__Alternatives_in_ruleRefType707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moment__Alternatives_in_ruleMoment743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CacheType__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CacheType__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RefType__Alternatives836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RefType__Alternatives857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RefType__Alternatives878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Moment__Alternatives914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Moment__Alternatives935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0968 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CacheAssignment_0_in_rule__Model__Group__0__Impl998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlansAssignment_1_in_rule__Model__Group__1__Impl1055 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Cache__Group__0__Impl_in_rule__Cache__Group__01090 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Cache__Group__1_in_rule__Cache__Group__01093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Cache__Group__0__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__1__Impl_in_rule__Cache__Group__11152 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Cache__Group__2_in_rule__Cache__Group__11155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__TypeAssignment_1_in_rule__Cache__Group__1__Impl1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__Group__2__Impl_in_rule__Cache__Group__21212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cache__PropertiesAssignment_2_in_rule__Cache__Group__2__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__0__Impl_in_rule__CacheProperties__Group__01276 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1_in_rule__CacheProperties__Group__01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CacheProperties__Group__0__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__1__Impl_in_rule__CacheProperties__Group__11338 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2_in_rule__CacheProperties__Group__11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CacheProperties__Group__1__Impl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__2__Impl_in_rule__CacheProperties__Group__21400 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3_in_rule__CacheProperties__Group__21403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__RefTypeAssignment_2_in_rule__CacheProperties__Group__2__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__3__Impl_in_rule__CacheProperties__Group__31460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__4_in_rule__CacheProperties__Group__31463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CacheProperties__Group__3__Impl1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__4__Impl_in_rule__CacheProperties__Group__41522 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__5_in_rule__CacheProperties__Group__41525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__SizeAssignment_4_in_rule__CacheProperties__Group__4__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CacheProperties__Group__5__Impl_in_rule__CacheProperties__Group__51582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CacheProperties__Group__5__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Plan__Group__0__Impl1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11715 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__PlanIdAssignment_1_in_rule__Plan__Group__1__Impl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__21775 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__21778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__AfterAssignment_2_in_rule__Plan__Group__2__Impl1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__31836 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__31839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Plan__Group__3__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__41898 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__41901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__RulesAssignment_4_in_rule__Plan__Group__4__Impl1928 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__51959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Plan__Group__5__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__0__Impl_in_rule__AfterRule__Group__02030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__1_in_rule__AfterRule__Group__02033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AfterRule__Group__0__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__Group__1__Impl_in_rule__AfterRule__Group__12092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AfterRule__PlanIdAssignment_1_in_rule__AfterRule__Group__1__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__0__Impl_in_rule__PrefetchingRule__Group__02153 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__1_in_rule__PrefetchingRule__Group__02156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__MomentAssignment_0_in_rule__PrefetchingRule__Group__0__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__1__Impl_in_rule__PrefetchingRule__Group__12213 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__2_in_rule__PrefetchingRule__Group__12216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__SourcePatternAssignment_1_in_rule__PrefetchingRule__Group__1__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__2__Impl_in_rule__PrefetchingRule__Group__22274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__3_in_rule__PrefetchingRule__Group__22277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrefetchingRule__Group__2__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__3__Impl_in_rule__PrefetchingRule__Group__32336 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__4_in_rule__PrefetchingRule__Group__32339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__TargetPatternAssignment_3_in_rule__PrefetchingRule__Group__3__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__4__Impl_in_rule__PrefetchingRule__Group__42396 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__5_in_rule__PrefetchingRule__Group__42399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__0_in_rule__PrefetchingRule__Group__4__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group__5__Impl_in_rule__PrefetchingRule__Group__52457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__0_in_rule__PrefetchingRule__Group__5__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__0__Impl_in_rule__PrefetchingRule__Group_4__02527 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__1_in_rule__PrefetchingRule__Group_4__02530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__ProbabilityAssignment_4_0_in_rule__PrefetchingRule__Group_4__0__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_4__1__Impl_in_rule__PrefetchingRule__Group_4__12587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PrefetchingRule__Group_4__1__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__0__Impl_in_rule__PrefetchingRule__Group_5__02650 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__1_in_rule__PrefetchingRule__Group_5__02653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrefetchingRule__Group_5__0__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__1__Impl_in_rule__PrefetchingRule__Group_5__12712 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__2_in_rule__PrefetchingRule__Group_5__12715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__SubRulesAssignment_5_1_in_rule__PrefetchingRule__Group_5__1__Impl2742 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__PrefetchingRule__Group_5__2__Impl_in_rule__PrefetchingRule__Group_5__22773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrefetchingRule__Group_5__2__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__0__Impl_in_rule__SourcePattern__Group__02838 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1_in_rule__SourcePattern__Group__02841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__PatternAssignment_0_in_rule__SourcePattern__Group__0__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__Group__1__Impl_in_rule__SourcePattern__Group__12898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourcePattern__FilterAssignment_1_in_rule__SourcePattern__Group__1__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__0__Impl_in_rule__FilterPattern__Group__02960 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1_in_rule__FilterPattern__Group__02963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FilterPattern__Group__0__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__1__Impl_in_rule__FilterPattern__Group__13022 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2_in_rule__FilterPattern__Group__13025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__StringPatternAssignment_1_in_rule__FilterPattern__Group__1__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterPattern__Group__2__Impl_in_rule__FilterPattern__Group__23082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FilterPattern__Group__2__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__0__Impl_in_rule__TargetPattern__Group__03147 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__1_in_rule__TargetPattern__Group__03150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__PatternAssignment_0_in_rule__TargetPattern__Group__0__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__Group__1__Impl_in_rule__TargetPattern__Group__13207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPattern__FilterAssignment_1_in_rule__TargetPattern__Group__1__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03269 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3355 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCache_in_rule__Model__CacheAssignment_03517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_rule__Model__PlansAssignment_13548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheType_in_rule__Cache__TypeAssignment_13579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheProperties_in_rule__Cache__PropertiesAssignment_23610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefType_in_rule__CacheProperties__RefTypeAssignment_23641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CacheProperties__SizeAssignment_43672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plan__PlanIdAssignment_13703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterRule_in_rule__Plan__AfterAssignment_23734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_rule__Plan__RulesAssignment_43765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AfterRule__PlanIdAssignment_13800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoment_in_rule__PrefetchingRule__MomentAssignment_03835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourcePattern_in_rule__PrefetchingRule__SourcePatternAssignment_13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetPattern_in_rule__PrefetchingRule__TargetPatternAssignment_33897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrefetchingRule__ProbabilityAssignment_4_03928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefetchingRule_in_rule__PrefetchingRule__SubRulesAssignment_5_13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SourcePattern__PatternAssignment_03990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_rule__SourcePattern__FilterAssignment_14021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FilterPattern__StringPatternAssignment_14052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TargetPattern__PatternAssignment_04083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_rule__TargetPattern__FilterAssignment_14114 = new BitSet(new long[]{0x0000000000000002L});

}