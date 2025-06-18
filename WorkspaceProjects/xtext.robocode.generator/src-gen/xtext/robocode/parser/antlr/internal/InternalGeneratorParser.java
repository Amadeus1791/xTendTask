package xtext.robocode.parser.antlr.internal;

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
import xtext.robocode.services.GeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Arena'", "'{'", "'robot'", "','", "'}'", "'Robot'", "'eventsHandled'", "'('", "')'", "'runActions'", "'infiniteLoopActions'", "'Event'", "'eventType'", "'actions'", "'Action'", "'comment'", "'setter'", "'getter'", "'functionName'", "'parameters'", "'AdvancedRobot'", "'RangeControlRobot'", "'BulletHit'", "'BulletMissed'", "'Death'", "'HitByBullet'", "'HitRobot'", "'HitWall'", "'ScannedRobot'", "'Win'", "'Custom'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenerator.g"; }



     	private GeneratorGrammarAccess grammarAccess;

        public InternalGeneratorParser(TokenStream input, GeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Arena";
       	}

       	@Override
       	protected GeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArena"
    // InternalGenerator.g:65:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalGenerator.g:65:46: (iv_ruleArena= ruleArena EOF )
            // InternalGenerator.g:66:2: iv_ruleArena= ruleArena EOF
            {
             newCompositeNode(grammarAccess.getArenaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArena=ruleArena();

            state._fsp--;

             current =iv_ruleArena; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArena"


    // $ANTLR start "ruleArena"
    // InternalGenerator.g:72:1: ruleArena returns [EObject current=null] : (otherlv_0= 'Arena' otherlv_1= '{' (otherlv_2= 'robot' otherlv_3= '{' ( (lv_robot_4_0= ruleRobot ) ) (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleArena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_robot_4_0 = null;

        EObject lv_robot_6_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:78:2: ( (otherlv_0= 'Arena' otherlv_1= '{' (otherlv_2= 'robot' otherlv_3= '{' ( (lv_robot_4_0= ruleRobot ) ) (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // InternalGenerator.g:79:2: (otherlv_0= 'Arena' otherlv_1= '{' (otherlv_2= 'robot' otherlv_3= '{' ( (lv_robot_4_0= ruleRobot ) ) (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // InternalGenerator.g:79:2: (otherlv_0= 'Arena' otherlv_1= '{' (otherlv_2= 'robot' otherlv_3= '{' ( (lv_robot_4_0= ruleRobot ) ) (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // InternalGenerator.g:80:3: otherlv_0= 'Arena' otherlv_1= '{' (otherlv_2= 'robot' otherlv_3= '{' ( (lv_robot_4_0= ruleRobot ) ) (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getArenaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGenerator.g:88:3: (otherlv_2= 'robot' otherlv_3= '{' ( (lv_robot_4_0= ruleRobot ) ) (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGenerator.g:89:4: otherlv_2= 'robot' otherlv_3= '{' ( (lv_robot_4_0= ruleRobot ) ) (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getRobotKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalGenerator.g:97:4: ( (lv_robot_4_0= ruleRobot ) )
                    // InternalGenerator.g:98:5: (lv_robot_4_0= ruleRobot )
                    {
                    // InternalGenerator.g:98:5: (lv_robot_4_0= ruleRobot )
                    // InternalGenerator.g:99:6: lv_robot_4_0= ruleRobot
                    {

                    						newCompositeNode(grammarAccess.getArenaAccess().getRobotRobotParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_robot_4_0=ruleRobot();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArenaRule());
                    						}
                    						add(
                    							current,
                    							"robot",
                    							lv_robot_4_0,
                    							"xtext.robocode.Generator.Robot");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:116:4: (otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGenerator.g:117:5: otherlv_5= ',' ( (lv_robot_6_0= ruleRobot ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getArenaAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGenerator.g:121:5: ( (lv_robot_6_0= ruleRobot ) )
                    	    // InternalGenerator.g:122:6: (lv_robot_6_0= ruleRobot )
                    	    {
                    	    // InternalGenerator.g:122:6: (lv_robot_6_0= ruleRobot )
                    	    // InternalGenerator.g:123:7: lv_robot_6_0= ruleRobot
                    	    {

                    	    							newCompositeNode(grammarAccess.getArenaAccess().getRobotRobotParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_robot_6_0=ruleRobot();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArenaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"robot",
                    	    								lv_robot_6_0,
                    	    								"xtext.robocode.Generator.Robot");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArena"


    // $ANTLR start "entryRuleRobot"
    // InternalGenerator.g:154:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalGenerator.g:154:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalGenerator.g:155:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalGenerator.g:161:1: ruleRobot returns [EObject current=null] : (this_Robot_Impl_0= ruleRobot_Impl | this_AdvancedRobot_Impl_1= ruleAdvancedRobot_Impl | this_RangeControlRobot_2= ruleRangeControlRobot ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        EObject this_Robot_Impl_0 = null;

        EObject this_AdvancedRobot_Impl_1 = null;

        EObject this_RangeControlRobot_2 = null;



        	enterRule();

        try {
            // InternalGenerator.g:167:2: ( (this_Robot_Impl_0= ruleRobot_Impl | this_AdvancedRobot_Impl_1= ruleAdvancedRobot_Impl | this_RangeControlRobot_2= ruleRangeControlRobot ) )
            // InternalGenerator.g:168:2: (this_Robot_Impl_0= ruleRobot_Impl | this_AdvancedRobot_Impl_1= ruleAdvancedRobot_Impl | this_RangeControlRobot_2= ruleRangeControlRobot )
            {
            // InternalGenerator.g:168:2: (this_Robot_Impl_0= ruleRobot_Impl | this_AdvancedRobot_Impl_1= ruleAdvancedRobot_Impl | this_RangeControlRobot_2= ruleRangeControlRobot )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGenerator.g:169:3: this_Robot_Impl_0= ruleRobot_Impl
                    {

                    			newCompositeNode(grammarAccess.getRobotAccess().getRobot_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Robot_Impl_0=ruleRobot_Impl();

                    state._fsp--;


                    			current = this_Robot_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerator.g:178:3: this_AdvancedRobot_Impl_1= ruleAdvancedRobot_Impl
                    {

                    			newCompositeNode(grammarAccess.getRobotAccess().getAdvancedRobot_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdvancedRobot_Impl_1=ruleAdvancedRobot_Impl();

                    state._fsp--;


                    			current = this_AdvancedRobot_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGenerator.g:187:3: this_RangeControlRobot_2= ruleRangeControlRobot
                    {

                    			newCompositeNode(grammarAccess.getRobotAccess().getRangeControlRobotParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeControlRobot_2=ruleRangeControlRobot();

                    state._fsp--;


                    			current = this_RangeControlRobot_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleRobot_Impl"
    // InternalGenerator.g:199:1: entryRuleRobot_Impl returns [EObject current=null] : iv_ruleRobot_Impl= ruleRobot_Impl EOF ;
    public final EObject entryRuleRobot_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot_Impl = null;


        try {
            // InternalGenerator.g:199:51: (iv_ruleRobot_Impl= ruleRobot_Impl EOF )
            // InternalGenerator.g:200:2: iv_ruleRobot_Impl= ruleRobot_Impl EOF
            {
             newCompositeNode(grammarAccess.getRobot_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot_Impl=ruleRobot_Impl();

            state._fsp--;

             current =iv_ruleRobot_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRobot_Impl"


    // $ANTLR start "ruleRobot_Impl"
    // InternalGenerator.g:206:1: ruleRobot_Impl returns [EObject current=null] : ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleRobot_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eventsHandled_6_0 = null;

        EObject lv_eventsHandled_8_0 = null;

        EObject lv_runActions_12_0 = null;

        EObject lv_runActions_14_0 = null;

        EObject lv_infiniteLoopActions_18_0 = null;

        EObject lv_infiniteLoopActions_20_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:212:2: ( ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalGenerator.g:213:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalGenerator.g:213:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalGenerator.g:214:3: () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalGenerator.g:214:3: ()
            // InternalGenerator.g:215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobot_ImplAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRobot_ImplAccess().getRobotKeyword_1());
            		
            // InternalGenerator.g:225:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGenerator.g:226:4: (lv_name_2_0= ruleEString )
            {
            // InternalGenerator.g:226:4: (lv_name_2_0= ruleEString )
            // InternalGenerator.g:227:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobot_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobot_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.robocode.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRobot_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGenerator.g:248:3: (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenerator.g:249:4: otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobot_ImplAccess().getEventsHandledKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobot_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGenerator.g:257:4: ( (lv_eventsHandled_6_0= ruleEvent ) )
                    // InternalGenerator.g:258:5: (lv_eventsHandled_6_0= ruleEvent )
                    {
                    // InternalGenerator.g:258:5: (lv_eventsHandled_6_0= ruleEvent )
                    // InternalGenerator.g:259:6: lv_eventsHandled_6_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getRobot_ImplAccess().getEventsHandledEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_eventsHandled_6_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobot_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eventsHandled",
                    							lv_eventsHandled_6_0,
                    							"xtext.robocode.Generator.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:276:4: (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGenerator.g:277:5: otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRobot_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGenerator.g:281:5: ( (lv_eventsHandled_8_0= ruleEvent ) )
                    	    // InternalGenerator.g:282:6: (lv_eventsHandled_8_0= ruleEvent )
                    	    {
                    	    // InternalGenerator.g:282:6: (lv_eventsHandled_8_0= ruleEvent )
                    	    // InternalGenerator.g:283:7: lv_eventsHandled_8_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobot_ImplAccess().getEventsHandledEventParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_eventsHandled_8_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobot_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eventsHandled",
                    	    								lv_eventsHandled_8_0,
                    	    								"xtext.robocode.Generator.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobot_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:306:3: (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenerator.g:307:4: otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRobot_ImplAccess().getRunActionsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getRobot_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGenerator.g:315:4: ( (lv_runActions_12_0= ruleAction ) )
                    // InternalGenerator.g:316:5: (lv_runActions_12_0= ruleAction )
                    {
                    // InternalGenerator.g:316:5: (lv_runActions_12_0= ruleAction )
                    // InternalGenerator.g:317:6: lv_runActions_12_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRobot_ImplAccess().getRunActionsActionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_runActions_12_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobot_ImplRule());
                    						}
                    						add(
                    							current,
                    							"runActions",
                    							lv_runActions_12_0,
                    							"xtext.robocode.Generator.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:334:4: (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGenerator.g:335:5: otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRobot_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGenerator.g:339:5: ( (lv_runActions_14_0= ruleAction ) )
                    	    // InternalGenerator.g:340:6: (lv_runActions_14_0= ruleAction )
                    	    {
                    	    // InternalGenerator.g:340:6: (lv_runActions_14_0= ruleAction )
                    	    // InternalGenerator.g:341:7: lv_runActions_14_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobot_ImplAccess().getRunActionsActionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_runActions_14_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobot_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"runActions",
                    	    								lv_runActions_14_0,
                    	    								"xtext.robocode.Generator.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getRobot_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:364:3: (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGenerator.g:365:4: otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getRobot_ImplAccess().getInfiniteLoopActionsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getRobot_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGenerator.g:373:4: ( (lv_infiniteLoopActions_18_0= ruleAction ) )
                    // InternalGenerator.g:374:5: (lv_infiniteLoopActions_18_0= ruleAction )
                    {
                    // InternalGenerator.g:374:5: (lv_infiniteLoopActions_18_0= ruleAction )
                    // InternalGenerator.g:375:6: lv_infiniteLoopActions_18_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRobot_ImplAccess().getInfiniteLoopActionsActionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_infiniteLoopActions_18_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobot_ImplRule());
                    						}
                    						add(
                    							current,
                    							"infiniteLoopActions",
                    							lv_infiniteLoopActions_18_0,
                    							"xtext.robocode.Generator.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:392:4: (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGenerator.g:393:5: otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getRobot_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGenerator.g:397:5: ( (lv_infiniteLoopActions_20_0= ruleAction ) )
                    	    // InternalGenerator.g:398:6: (lv_infiniteLoopActions_20_0= ruleAction )
                    	    {
                    	    // InternalGenerator.g:398:6: (lv_infiniteLoopActions_20_0= ruleAction )
                    	    // InternalGenerator.g:399:7: lv_infiniteLoopActions_20_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobot_ImplAccess().getInfiniteLoopActionsActionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_infiniteLoopActions_20_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobot_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"infiniteLoopActions",
                    	    								lv_infiniteLoopActions_20_0,
                    	    								"xtext.robocode.Generator.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getRobot_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getRobot_ImplAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRobot_Impl"


    // $ANTLR start "entryRuleEvent"
    // InternalGenerator.g:430:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalGenerator.g:430:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalGenerator.g:431:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalGenerator.g:437:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' otherlv_2= '{' (otherlv_3= 'eventType' ( (lv_eventType_4_0= ruleEventType ) ) )? (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_eventType_4_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_actions_9_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:443:2: ( ( () otherlv_1= 'Event' otherlv_2= '{' (otherlv_3= 'eventType' ( (lv_eventType_4_0= ruleEventType ) ) )? (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalGenerator.g:444:2: ( () otherlv_1= 'Event' otherlv_2= '{' (otherlv_3= 'eventType' ( (lv_eventType_4_0= ruleEventType ) ) )? (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalGenerator.g:444:2: ( () otherlv_1= 'Event' otherlv_2= '{' (otherlv_3= 'eventType' ( (lv_eventType_4_0= ruleEventType ) ) )? (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalGenerator.g:445:3: () otherlv_1= 'Event' otherlv_2= '{' (otherlv_3= 'eventType' ( (lv_eventType_4_0= ruleEventType ) ) )? (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalGenerator.g:445:3: ()
            // InternalGenerator.g:446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenerator.g:460:3: (otherlv_3= 'eventType' ( (lv_eventType_4_0= ruleEventType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGenerator.g:461:4: otherlv_3= 'eventType' ( (lv_eventType_4_0= ruleEventType ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getEventTypeKeyword_3_0());
                    			
                    // InternalGenerator.g:465:4: ( (lv_eventType_4_0= ruleEventType ) )
                    // InternalGenerator.g:466:5: (lv_eventType_4_0= ruleEventType )
                    {
                    // InternalGenerator.g:466:5: (lv_eventType_4_0= ruleEventType )
                    // InternalGenerator.g:467:6: lv_eventType_4_0= ruleEventType
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getEventTypeEventTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_eventType_4_0=ruleEventType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"eventType",
                    							lv_eventType_4_0,
                    							"xtext.robocode.Generator.EventType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenerator.g:485:3: (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGenerator.g:486:4: otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventAccess().getActionsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGenerator.g:494:4: ( (lv_actions_7_0= ruleAction ) )
                    // InternalGenerator.g:495:5: (lv_actions_7_0= ruleAction )
                    {
                    // InternalGenerator.g:495:5: (lv_actions_7_0= ruleAction )
                    // InternalGenerator.g:496:6: lv_actions_7_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actions_7_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_7_0,
                    							"xtext.robocode.Generator.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:513:4: (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGenerator.g:514:5: otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEventAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGenerator.g:518:5: ( (lv_actions_9_0= ruleAction ) )
                    	    // InternalGenerator.g:519:6: (lv_actions_9_0= ruleAction )
                    	    {
                    	    // InternalGenerator.g:519:6: (lv_actions_9_0= ruleAction )
                    	    // InternalGenerator.g:520:7: lv_actions_9_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actions_9_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_9_0,
                    	    								"xtext.robocode.Generator.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEString"
    // InternalGenerator.g:551:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGenerator.g:551:47: (iv_ruleEString= ruleEString EOF )
            // InternalGenerator.g:552:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGenerator.g:558:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGenerator.g:564:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGenerator.g:565:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGenerator.g:565:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGenerator.g:566:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerator.g:574:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAction"
    // InternalGenerator.g:585:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGenerator.g:585:47: (iv_ruleAction= ruleAction EOF )
            // InternalGenerator.g:586:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGenerator.g:592:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? ( ( (lv_isSetter_4_0= 'setter' ) ) | ( (lv_isGetter_5_0= 'getter' ) ) )? otherlv_6= 'functionName' ( (lv_functionName_7_0= ruleEString ) ) (otherlv_8= 'parameters' ( (lv_parameters_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isSetter_4_0=null;
        Token lv_isGetter_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_comment_3_0 = null;

        AntlrDatatypeRuleToken lv_functionName_7_0 = null;

        AntlrDatatypeRuleToken lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:598:2: ( (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? ( ( (lv_isSetter_4_0= 'setter' ) ) | ( (lv_isGetter_5_0= 'getter' ) ) )? otherlv_6= 'functionName' ( (lv_functionName_7_0= ruleEString ) ) (otherlv_8= 'parameters' ( (lv_parameters_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalGenerator.g:599:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? ( ( (lv_isSetter_4_0= 'setter' ) ) | ( (lv_isGetter_5_0= 'getter' ) ) )? otherlv_6= 'functionName' ( (lv_functionName_7_0= ruleEString ) ) (otherlv_8= 'parameters' ( (lv_parameters_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalGenerator.g:599:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? ( ( (lv_isSetter_4_0= 'setter' ) ) | ( (lv_isGetter_5_0= 'getter' ) ) )? otherlv_6= 'functionName' ( (lv_functionName_7_0= ruleEString ) ) (otherlv_8= 'parameters' ( (lv_parameters_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalGenerator.g:600:3: otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? ( ( (lv_isSetter_4_0= 'setter' ) ) | ( (lv_isGetter_5_0= 'getter' ) ) )? otherlv_6= 'functionName' ( (lv_functionName_7_0= ruleEString ) ) (otherlv_8= 'parameters' ( (lv_parameters_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGenerator.g:608:3: (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGenerator.g:609:4: otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getCommentKeyword_2_0());
                    			
                    // InternalGenerator.g:613:4: ( (lv_comment_3_0= ruleEString ) )
                    // InternalGenerator.g:614:5: (lv_comment_3_0= ruleEString )
                    {
                    // InternalGenerator.g:614:5: (lv_comment_3_0= ruleEString )
                    // InternalGenerator.g:615:6: lv_comment_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"comment",
                    							lv_comment_3_0,
                    							"xtext.robocode.Generator.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenerator.g:633:3: ( ( (lv_isSetter_4_0= 'setter' ) ) | ( (lv_isGetter_5_0= 'getter' ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalGenerator.g:634:4: ( (lv_isSetter_4_0= 'setter' ) )
                    {
                    // InternalGenerator.g:634:4: ( (lv_isSetter_4_0= 'setter' ) )
                    // InternalGenerator.g:635:5: (lv_isSetter_4_0= 'setter' )
                    {
                    // InternalGenerator.g:635:5: (lv_isSetter_4_0= 'setter' )
                    // InternalGenerator.g:636:6: lv_isSetter_4_0= 'setter'
                    {
                    lv_isSetter_4_0=(Token)match(input,27,FOLLOW_21); 

                    						newLeafNode(lv_isSetter_4_0, grammarAccess.getActionAccess().getIsSetterSetterKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "isSetter", true, "setter");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGenerator.g:649:4: ( (lv_isGetter_5_0= 'getter' ) )
                    {
                    // InternalGenerator.g:649:4: ( (lv_isGetter_5_0= 'getter' ) )
                    // InternalGenerator.g:650:5: (lv_isGetter_5_0= 'getter' )
                    {
                    // InternalGenerator.g:650:5: (lv_isGetter_5_0= 'getter' )
                    // InternalGenerator.g:651:6: lv_isGetter_5_0= 'getter'
                    {
                    lv_isGetter_5_0=(Token)match(input,28,FOLLOW_21); 

                    						newLeafNode(lv_isGetter_5_0, grammarAccess.getActionAccess().getIsGetterGetterKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "isGetter", true, "getter");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getFunctionNameKeyword_4());
            		
            // InternalGenerator.g:668:3: ( (lv_functionName_7_0= ruleEString ) )
            // InternalGenerator.g:669:4: (lv_functionName_7_0= ruleEString )
            {
            // InternalGenerator.g:669:4: (lv_functionName_7_0= ruleEString )
            // InternalGenerator.g:670:5: lv_functionName_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getFunctionNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_functionName_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"functionName",
            						lv_functionName_7_0,
            						"xtext.robocode.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerator.g:687:3: (otherlv_8= 'parameters' ( (lv_parameters_9_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGenerator.g:688:4: otherlv_8= 'parameters' ( (lv_parameters_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getParametersKeyword_6_0());
                    			
                    // InternalGenerator.g:692:4: ( (lv_parameters_9_0= ruleEString ) )
                    // InternalGenerator.g:693:5: (lv_parameters_9_0= ruleEString )
                    {
                    // InternalGenerator.g:693:5: (lv_parameters_9_0= ruleEString )
                    // InternalGenerator.g:694:6: lv_parameters_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getParametersEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameters_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_9_0,
                    							"xtext.robocode.Generator.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAdvancedRobot_Impl"
    // InternalGenerator.g:720:1: entryRuleAdvancedRobot_Impl returns [EObject current=null] : iv_ruleAdvancedRobot_Impl= ruleAdvancedRobot_Impl EOF ;
    public final EObject entryRuleAdvancedRobot_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvancedRobot_Impl = null;


        try {
            // InternalGenerator.g:720:59: (iv_ruleAdvancedRobot_Impl= ruleAdvancedRobot_Impl EOF )
            // InternalGenerator.g:721:2: iv_ruleAdvancedRobot_Impl= ruleAdvancedRobot_Impl EOF
            {
             newCompositeNode(grammarAccess.getAdvancedRobot_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdvancedRobot_Impl=ruleAdvancedRobot_Impl();

            state._fsp--;

             current =iv_ruleAdvancedRobot_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdvancedRobot_Impl"


    // $ANTLR start "ruleAdvancedRobot_Impl"
    // InternalGenerator.g:727:1: ruleAdvancedRobot_Impl returns [EObject current=null] : ( () otherlv_1= 'AdvancedRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleAdvancedRobot_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eventsHandled_6_0 = null;

        EObject lv_eventsHandled_8_0 = null;

        EObject lv_runActions_12_0 = null;

        EObject lv_runActions_14_0 = null;

        EObject lv_infiniteLoopActions_18_0 = null;

        EObject lv_infiniteLoopActions_20_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:733:2: ( ( () otherlv_1= 'AdvancedRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalGenerator.g:734:2: ( () otherlv_1= 'AdvancedRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalGenerator.g:734:2: ( () otherlv_1= 'AdvancedRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalGenerator.g:735:3: () otherlv_1= 'AdvancedRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalGenerator.g:735:3: ()
            // InternalGenerator.g:736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAdvancedRobot_ImplAccess().getAdvancedRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAdvancedRobot_ImplAccess().getAdvancedRobotKeyword_1());
            		
            // InternalGenerator.g:746:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGenerator.g:747:4: (lv_name_2_0= ruleEString )
            {
            // InternalGenerator.g:747:4: (lv_name_2_0= ruleEString )
            // InternalGenerator.g:748:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAdvancedRobot_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdvancedRobot_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.robocode.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAdvancedRobot_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGenerator.g:769:3: (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGenerator.g:770:4: otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getAdvancedRobot_ImplAccess().getEventsHandledKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getAdvancedRobot_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGenerator.g:778:4: ( (lv_eventsHandled_6_0= ruleEvent ) )
                    // InternalGenerator.g:779:5: (lv_eventsHandled_6_0= ruleEvent )
                    {
                    // InternalGenerator.g:779:5: (lv_eventsHandled_6_0= ruleEvent )
                    // InternalGenerator.g:780:6: lv_eventsHandled_6_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getAdvancedRobot_ImplAccess().getEventsHandledEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_eventsHandled_6_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdvancedRobot_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eventsHandled",
                    							lv_eventsHandled_6_0,
                    							"xtext.robocode.Generator.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:797:4: (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGenerator.g:798:5: otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAdvancedRobot_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGenerator.g:802:5: ( (lv_eventsHandled_8_0= ruleEvent ) )
                    	    // InternalGenerator.g:803:6: (lv_eventsHandled_8_0= ruleEvent )
                    	    {
                    	    // InternalGenerator.g:803:6: (lv_eventsHandled_8_0= ruleEvent )
                    	    // InternalGenerator.g:804:7: lv_eventsHandled_8_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getAdvancedRobot_ImplAccess().getEventsHandledEventParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_eventsHandled_8_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAdvancedRobot_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eventsHandled",
                    	    								lv_eventsHandled_8_0,
                    	    								"xtext.robocode.Generator.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getAdvancedRobot_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:827:3: (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGenerator.g:828:4: otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getAdvancedRobot_ImplAccess().getRunActionsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getAdvancedRobot_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGenerator.g:836:4: ( (lv_runActions_12_0= ruleAction ) )
                    // InternalGenerator.g:837:5: (lv_runActions_12_0= ruleAction )
                    {
                    // InternalGenerator.g:837:5: (lv_runActions_12_0= ruleAction )
                    // InternalGenerator.g:838:6: lv_runActions_12_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getAdvancedRobot_ImplAccess().getRunActionsActionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_runActions_12_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdvancedRobot_ImplRule());
                    						}
                    						add(
                    							current,
                    							"runActions",
                    							lv_runActions_12_0,
                    							"xtext.robocode.Generator.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:855:4: (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGenerator.g:856:5: otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAdvancedRobot_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGenerator.g:860:5: ( (lv_runActions_14_0= ruleAction ) )
                    	    // InternalGenerator.g:861:6: (lv_runActions_14_0= ruleAction )
                    	    {
                    	    // InternalGenerator.g:861:6: (lv_runActions_14_0= ruleAction )
                    	    // InternalGenerator.g:862:7: lv_runActions_14_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getAdvancedRobot_ImplAccess().getRunActionsActionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_runActions_14_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAdvancedRobot_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"runActions",
                    	    								lv_runActions_14_0,
                    	    								"xtext.robocode.Generator.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getAdvancedRobot_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:885:3: (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGenerator.g:886:4: otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getAdvancedRobot_ImplAccess().getInfiniteLoopActionsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getAdvancedRobot_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGenerator.g:894:4: ( (lv_infiniteLoopActions_18_0= ruleAction ) )
                    // InternalGenerator.g:895:5: (lv_infiniteLoopActions_18_0= ruleAction )
                    {
                    // InternalGenerator.g:895:5: (lv_infiniteLoopActions_18_0= ruleAction )
                    // InternalGenerator.g:896:6: lv_infiniteLoopActions_18_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getAdvancedRobot_ImplAccess().getInfiniteLoopActionsActionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_infiniteLoopActions_18_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdvancedRobot_ImplRule());
                    						}
                    						add(
                    							current,
                    							"infiniteLoopActions",
                    							lv_infiniteLoopActions_18_0,
                    							"xtext.robocode.Generator.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:913:4: (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGenerator.g:914:5: otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getAdvancedRobot_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGenerator.g:918:5: ( (lv_infiniteLoopActions_20_0= ruleAction ) )
                    	    // InternalGenerator.g:919:6: (lv_infiniteLoopActions_20_0= ruleAction )
                    	    {
                    	    // InternalGenerator.g:919:6: (lv_infiniteLoopActions_20_0= ruleAction )
                    	    // InternalGenerator.g:920:7: lv_infiniteLoopActions_20_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getAdvancedRobot_ImplAccess().getInfiniteLoopActionsActionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_infiniteLoopActions_20_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAdvancedRobot_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"infiniteLoopActions",
                    	    								lv_infiniteLoopActions_20_0,
                    	    								"xtext.robocode.Generator.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getAdvancedRobot_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getAdvancedRobot_ImplAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAdvancedRobot_Impl"


    // $ANTLR start "entryRuleRangeControlRobot"
    // InternalGenerator.g:951:1: entryRuleRangeControlRobot returns [EObject current=null] : iv_ruleRangeControlRobot= ruleRangeControlRobot EOF ;
    public final EObject entryRuleRangeControlRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeControlRobot = null;


        try {
            // InternalGenerator.g:951:58: (iv_ruleRangeControlRobot= ruleRangeControlRobot EOF )
            // InternalGenerator.g:952:2: iv_ruleRangeControlRobot= ruleRangeControlRobot EOF
            {
             newCompositeNode(grammarAccess.getRangeControlRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeControlRobot=ruleRangeControlRobot();

            state._fsp--;

             current =iv_ruleRangeControlRobot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRangeControlRobot"


    // $ANTLR start "ruleRangeControlRobot"
    // InternalGenerator.g:958:1: ruleRangeControlRobot returns [EObject current=null] : ( () otherlv_1= 'RangeControlRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleRangeControlRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eventsHandled_6_0 = null;

        EObject lv_eventsHandled_8_0 = null;

        EObject lv_runActions_12_0 = null;

        EObject lv_runActions_14_0 = null;

        EObject lv_infiniteLoopActions_18_0 = null;

        EObject lv_infiniteLoopActions_20_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:964:2: ( ( () otherlv_1= 'RangeControlRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalGenerator.g:965:2: ( () otherlv_1= 'RangeControlRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalGenerator.g:965:2: ( () otherlv_1= 'RangeControlRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalGenerator.g:966:3: () otherlv_1= 'RangeControlRobot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )? (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )? (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalGenerator.g:966:3: ()
            // InternalGenerator.g:967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeControlRobotAccess().getRangeControlRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeControlRobotAccess().getRangeControlRobotKeyword_1());
            		
            // InternalGenerator.g:977:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGenerator.g:978:4: (lv_name_2_0= ruleEString )
            {
            // InternalGenerator.g:978:4: (lv_name_2_0= ruleEString )
            // InternalGenerator.g:979:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRangeControlRobotAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeControlRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.robocode.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRangeControlRobotAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGenerator.g:1000:3: (otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGenerator.g:1001:4: otherlv_4= 'eventsHandled' otherlv_5= '(' ( (lv_eventsHandled_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getRangeControlRobotAccess().getEventsHandledKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getRangeControlRobotAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGenerator.g:1009:4: ( (lv_eventsHandled_6_0= ruleEvent ) )
                    // InternalGenerator.g:1010:5: (lv_eventsHandled_6_0= ruleEvent )
                    {
                    // InternalGenerator.g:1010:5: (lv_eventsHandled_6_0= ruleEvent )
                    // InternalGenerator.g:1011:6: lv_eventsHandled_6_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getRangeControlRobotAccess().getEventsHandledEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_eventsHandled_6_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeControlRobotRule());
                    						}
                    						add(
                    							current,
                    							"eventsHandled",
                    							lv_eventsHandled_6_0,
                    							"xtext.robocode.Generator.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:1028:4: (otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGenerator.g:1029:5: otherlv_7= ',' ( (lv_eventsHandled_8_0= ruleEvent ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRangeControlRobotAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGenerator.g:1033:5: ( (lv_eventsHandled_8_0= ruleEvent ) )
                    	    // InternalGenerator.g:1034:6: (lv_eventsHandled_8_0= ruleEvent )
                    	    {
                    	    // InternalGenerator.g:1034:6: (lv_eventsHandled_8_0= ruleEvent )
                    	    // InternalGenerator.g:1035:7: lv_eventsHandled_8_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRangeControlRobotAccess().getEventsHandledEventParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_eventsHandled_8_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRangeControlRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eventsHandled",
                    	    								lv_eventsHandled_8_0,
                    	    								"xtext.robocode.Generator.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRangeControlRobotAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:1058:3: (otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGenerator.g:1059:4: otherlv_10= 'runActions' otherlv_11= '{' ( (lv_runActions_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRangeControlRobotAccess().getRunActionsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getRangeControlRobotAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGenerator.g:1067:4: ( (lv_runActions_12_0= ruleAction ) )
                    // InternalGenerator.g:1068:5: (lv_runActions_12_0= ruleAction )
                    {
                    // InternalGenerator.g:1068:5: (lv_runActions_12_0= ruleAction )
                    // InternalGenerator.g:1069:6: lv_runActions_12_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRangeControlRobotAccess().getRunActionsActionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_runActions_12_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeControlRobotRule());
                    						}
                    						add(
                    							current,
                    							"runActions",
                    							lv_runActions_12_0,
                    							"xtext.robocode.Generator.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:1086:4: (otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGenerator.g:1087:5: otherlv_13= ',' ( (lv_runActions_14_0= ruleAction ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRangeControlRobotAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGenerator.g:1091:5: ( (lv_runActions_14_0= ruleAction ) )
                    	    // InternalGenerator.g:1092:6: (lv_runActions_14_0= ruleAction )
                    	    {
                    	    // InternalGenerator.g:1092:6: (lv_runActions_14_0= ruleAction )
                    	    // InternalGenerator.g:1093:7: lv_runActions_14_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getRangeControlRobotAccess().getRunActionsActionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_runActions_14_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRangeControlRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"runActions",
                    	    								lv_runActions_14_0,
                    	    								"xtext.robocode.Generator.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getRangeControlRobotAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:1116:3: (otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGenerator.g:1117:4: otherlv_16= 'infiniteLoopActions' otherlv_17= '{' ( (lv_infiniteLoopActions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getRangeControlRobotAccess().getInfiniteLoopActionsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getRangeControlRobotAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGenerator.g:1125:4: ( (lv_infiniteLoopActions_18_0= ruleAction ) )
                    // InternalGenerator.g:1126:5: (lv_infiniteLoopActions_18_0= ruleAction )
                    {
                    // InternalGenerator.g:1126:5: (lv_infiniteLoopActions_18_0= ruleAction )
                    // InternalGenerator.g:1127:6: lv_infiniteLoopActions_18_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRangeControlRobotAccess().getInfiniteLoopActionsActionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_infiniteLoopActions_18_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeControlRobotRule());
                    						}
                    						add(
                    							current,
                    							"infiniteLoopActions",
                    							lv_infiniteLoopActions_18_0,
                    							"xtext.robocode.Generator.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:1144:4: (otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGenerator.g:1145:5: otherlv_19= ',' ( (lv_infiniteLoopActions_20_0= ruleAction ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getRangeControlRobotAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGenerator.g:1149:5: ( (lv_infiniteLoopActions_20_0= ruleAction ) )
                    	    // InternalGenerator.g:1150:6: (lv_infiniteLoopActions_20_0= ruleAction )
                    	    {
                    	    // InternalGenerator.g:1150:6: (lv_infiniteLoopActions_20_0= ruleAction )
                    	    // InternalGenerator.g:1151:7: lv_infiniteLoopActions_20_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getRangeControlRobotAccess().getInfiniteLoopActionsActionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_infiniteLoopActions_20_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRangeControlRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"infiniteLoopActions",
                    	    								lv_infiniteLoopActions_20_0,
                    	    								"xtext.robocode.Generator.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getRangeControlRobotAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getRangeControlRobotAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRangeControlRobot"


    // $ANTLR start "ruleEventType"
    // InternalGenerator.g:1182:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'BulletHit' ) | (enumLiteral_1= 'BulletMissed' ) | (enumLiteral_2= 'Death' ) | (enumLiteral_3= 'HitByBullet' ) | (enumLiteral_4= 'HitRobot' ) | (enumLiteral_5= 'HitWall' ) | (enumLiteral_6= 'ScannedRobot' ) | (enumLiteral_7= 'Win' ) | (enumLiteral_8= 'Custom' ) ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalGenerator.g:1188:2: ( ( (enumLiteral_0= 'BulletHit' ) | (enumLiteral_1= 'BulletMissed' ) | (enumLiteral_2= 'Death' ) | (enumLiteral_3= 'HitByBullet' ) | (enumLiteral_4= 'HitRobot' ) | (enumLiteral_5= 'HitWall' ) | (enumLiteral_6= 'ScannedRobot' ) | (enumLiteral_7= 'Win' ) | (enumLiteral_8= 'Custom' ) ) )
            // InternalGenerator.g:1189:2: ( (enumLiteral_0= 'BulletHit' ) | (enumLiteral_1= 'BulletMissed' ) | (enumLiteral_2= 'Death' ) | (enumLiteral_3= 'HitByBullet' ) | (enumLiteral_4= 'HitRobot' ) | (enumLiteral_5= 'HitWall' ) | (enumLiteral_6= 'ScannedRobot' ) | (enumLiteral_7= 'Win' ) | (enumLiteral_8= 'Custom' ) )
            {
            // InternalGenerator.g:1189:2: ( (enumLiteral_0= 'BulletHit' ) | (enumLiteral_1= 'BulletMissed' ) | (enumLiteral_2= 'Death' ) | (enumLiteral_3= 'HitByBullet' ) | (enumLiteral_4= 'HitRobot' ) | (enumLiteral_5= 'HitWall' ) | (enumLiteral_6= 'ScannedRobot' ) | (enumLiteral_7= 'Win' ) | (enumLiteral_8= 'Custom' ) )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt29=1;
                }
                break;
            case 34:
                {
                alt29=2;
                }
                break;
            case 35:
                {
                alt29=3;
                }
                break;
            case 36:
                {
                alt29=4;
                }
                break;
            case 37:
                {
                alt29=5;
                }
                break;
            case 38:
                {
                alt29=6;
                }
                break;
            case 39:
                {
                alt29=7;
                }
                break;
            case 40:
                {
                alt29=8;
                }
                break;
            case 41:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalGenerator.g:1190:3: (enumLiteral_0= 'BulletHit' )
                    {
                    // InternalGenerator.g:1190:3: (enumLiteral_0= 'BulletHit' )
                    // InternalGenerator.g:1191:4: enumLiteral_0= 'BulletHit'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getBulletHitEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getBulletHitEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerator.g:1198:3: (enumLiteral_1= 'BulletMissed' )
                    {
                    // InternalGenerator.g:1198:3: (enumLiteral_1= 'BulletMissed' )
                    // InternalGenerator.g:1199:4: enumLiteral_1= 'BulletMissed'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getBulletMissedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getBulletMissedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenerator.g:1206:3: (enumLiteral_2= 'Death' )
                    {
                    // InternalGenerator.g:1206:3: (enumLiteral_2= 'Death' )
                    // InternalGenerator.g:1207:4: enumLiteral_2= 'Death'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getDeathEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getDeathEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGenerator.g:1214:3: (enumLiteral_3= 'HitByBullet' )
                    {
                    // InternalGenerator.g:1214:3: (enumLiteral_3= 'HitByBullet' )
                    // InternalGenerator.g:1215:4: enumLiteral_3= 'HitByBullet'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getHitByBulletEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getHitByBulletEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGenerator.g:1222:3: (enumLiteral_4= 'HitRobot' )
                    {
                    // InternalGenerator.g:1222:3: (enumLiteral_4= 'HitRobot' )
                    // InternalGenerator.g:1223:4: enumLiteral_4= 'HitRobot'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getHitRobotEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getHitRobotEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGenerator.g:1230:3: (enumLiteral_5= 'HitWall' )
                    {
                    // InternalGenerator.g:1230:3: (enumLiteral_5= 'HitWall' )
                    // InternalGenerator.g:1231:4: enumLiteral_5= 'HitWall'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getHitWallEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEventTypeAccess().getHitWallEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGenerator.g:1238:3: (enumLiteral_6= 'ScannedRobot' )
                    {
                    // InternalGenerator.g:1238:3: (enumLiteral_6= 'ScannedRobot' )
                    // InternalGenerator.g:1239:4: enumLiteral_6= 'ScannedRobot'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getScannedRobotEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEventTypeAccess().getScannedRobotEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGenerator.g:1246:3: (enumLiteral_7= 'Win' )
                    {
                    // InternalGenerator.g:1246:3: (enumLiteral_7= 'Win' )
                    // InternalGenerator.g:1247:4: enumLiteral_7= 'Win'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getWinEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEventTypeAccess().getWinEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGenerator.g:1254:3: (enumLiteral_8= 'Custom' )
                    {
                    // InternalGenerator.g:1254:3: (enumLiteral_8= 'Custom' )
                    // InternalGenerator.g:1255:4: enumLiteral_8= 'Custom'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getCustomEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEventTypeAccess().getCustomEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleEventType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000328000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000003FE00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040008000L});

}