package BruhMoment;

import org.javacord.api.entity.message.embed.EmbedBuilder;

public class Rules {
    EmbedBuilder g1 = new EmbedBuilder()
            .setDescription("**<G1> <Drive Team>** Each Drive Team shall include up to two Drivers, one Coach, and one Human Player\n" +
            "`(however only one Human Player may represent an Alliance)`. Electronic communications `(cell phone, two-way\n" +
            "radio, Wi-Fi, Bluetooth, etc.)` by Drive Team members after an Alliance has been called from the queue to the\n" +
            "Playing Field for its Match are not allowed. The first instance of violating this rule will result in a warning, with\n" +
            "any following instances during the tournament resulting in a Minor Penalty. Items that may be mistaken by a\n" +
            "casual observer as being in violation should not be brought to the Playing Field. The Driver Station is exempt\n" +
            "from this rule but must be used only for operating the Robot.")
            .setFooter("Notes:");
    EmbedBuilder g2 = new EmbedBuilder()
            .setDescription("**<G2> Playing Field Access** - Team members cannot enter the Playing Field for any reason other than to\n" +
            "place/retrieve their Robots. Teams may not measure, test, or adjust Field or Game Elements. Inspection of the\n" +
            "Playing Field elements by Team members to determine Scoring is not allowed. The consequences for violating\n" +
            "this rule are:\n")
            .addField("a)"," Minor Penalty for violation of this rule during Match setup or following the end of the Match.")
            .addField("b)","Major Penalty for violations of this rule that delay the start of the Match.\n")
            .addField("c)"," Violations of this rule outside of normal Match play result in a Yellow Card.")
            .setFooter("Note:");
    EmbedBuilder g3 = new EmbedBuilder()
            .setDescription("**<G3> Pre-Match Robot Placement** – At the beginning of a Match, each Alliance Robot must be set up on the\n" +
            "Playing Field according to section 4.5.1 Pre-Match in the Game Manual Part 2. After Robots are set up on the\n" +
            "Playing Field, Drive Teams must stand Completely Inside their respective Alliance or Human Player Station.")
            .addField("a)","During the Qualification Matches, the blue Alliance Robots are set up on the Playing Field first, unless\n" +
            "the red Alliance waives their right to set up on the Playing Field second. ")
            .addField("b)","During the Elimination Matches, the 3rd and 4th seeded Alliance Robots are set up on the Playing Field\n" +
            "first, unless the higher seeded Alliance waives their right to set up on the Playing Field second. Alliance\n" +
            "color doesn’t change the seeding of a Team during the Elimination Matches. If the 4th seed defeats the 1\n" +
            "st seed in the Semi-Finals, they will still have to place their Robot on the field first in the Finals because\n" +
            "their seeding will be lower than the 2nd or 3rd seed.")
            .addField("c)","During Elimination Matches, 3 Team Alliances may only place Robots that are intended to compete in\n" +
                    "that Match. Once two Robots are placed for the two Teams competing in a Match, the Alliance cannot\n" +
                    "swap in the 3rd Alliance’s Robot for a Robot already placed.\n")
            .addField("d)","Teams may implicitly waive their right to place their Robots on the Playing Field last by placing their\n" +
                    "Robots on the Playing Field before or with the opposing Alliance. There is no need to tell the referees;\n" +
                    "Teams waive their right by the act of placing their Robots on the Playing Field.\n")
            .addField("e)","Teams that unnecessarily delay the beginning of a Match and/or field reset will incur a Minor Penalty for\n" +
                    "each offense. ")
            .setFooter("Note: Drive Teams are expected to stage their Robots for a Match, and remove it from the Playing\n" +
                    "Field afterwards, safely and swiftly. Drive Team efforts that either intentionally or unintentionally\n" +
                    "delay the start of a Match or the Playing Field reset are not allowed. Examples include, but are\n" +
                    "not limited to:\n" +
                    "• Late arrival to the Playing Field.\n" +
                    "• Robot maintenance once on the Playing Field.");
    EmbedBuilder g4 = new EmbedBuilder().setDescription("**<G4> Robot Starting Volume** – Before the start of a Match, each Robot in its starting location must not\n" +
            "exceed a volume of 18 inches (457.2 mm) by 18 inches (457.2 mm) by 18 inches (457.2 mm) unless otherwise\n" +
            "allowed or restricted by Game Specific Rules detailed in section 4.6.3. The Pre-Loaded Scoring Element may\n" +
            "extend Outside the 18-inch (457.2 mm) cube volume constraint. An offending Robot will be removed from the\n" +
            "Playing Field, is considered a no-show, and receives no Ranking and TieBreaker Points for the Match.\n" +
            "After the start of a Match, the Robot may extend in any dimension unless restricted by the Game-Specific rules\n" +
            "detailed in section 4.6.3.");
    EmbedBuilder g5 = new EmbedBuilder().setDescription("**<G5> Robot Setup/Alignment** – Teams may align their Robots during Pre-Match setup if they do so with legal\n" +
            "components that are part of the Robot and can be reset to be within the 18-inch (457.2 mm) cube starting\n" +
            "volume constraint. A single member of the Drive Team may also align the Robot by sight if they are next to the\n" +
            "Robot and does not delay the start of a Match. A Minor Penalty will be assessed to the Team for violation of\n" +
            "this rule. ");
    EmbedBuilder g6 = new EmbedBuilder().setDescription("**<G6> Alliance and Human Player Stations** – During a Match, the Drivers, Coaches, and Human Players\n" +
            "must remain In their Stations.")
            .addField("a)","The first instance of leaving the Station will result in a warning, with any following instances resulting in\n" +
                    "a Minor Penalty. Leaving the Station for safety reasons will not result in a warning or Penalty.")
            .addField("b)","Opposing Alliances’ Drive Teams on the same side of the Field cannot distract and/or interfere with\n" +
                    "each other nor of the off-field Scoring Elements. Violation of this rule will result in an immediate Major\n" +
                    "Penalty and a possible Yellow Card.")
            .setFooter("Note: The Intent of this rule is to prevent Team members from leaving their assigned Station during\n" +
                    "a Match to gain a competitive advantage. For example; moving to another part of the Field for\n" +
                    "better viewing, reaching into the Field, etc. Simply breaking the plane of the Station during\n" +
                    "normal Match play is not a Penalty.");
    EmbedBuilder g7 = new EmbedBuilder().setDescription("**<G7> Starting Gameplay Early** – Robots that start playing the game (Autonomous or Driver-Controlled\n" +
            "Period) prior to the start of a Match Period receive a Minor Penalty. Referees have the option of issuing a\n" +
            "Major Penalty in place of the Minor Penalty if the early start results in a competitive advantage for the offending\n" +
            "Alliance.");
    EmbedBuilder g8 = new EmbedBuilder().setDescription("**<G8> Late Start of the Autonomous Period** – Teams participating in the Autonomous Period are expected to\n" +
            "press the ”start with 30-second” button on their Driver Station Android device and then place the Driver Station\n" +
            "in a hands-off location without delay when field personnel signal the start of the Autonomous Period. A Minor\n" +
            "Penalty is assessed for violating this rule. Referees have the option of issuing a Major Penalty in place of the\n" +
            "Minor Penalty if the late start results in a competitive advantage for the offending Alliance. ");
    EmbedBuilder g9 = new EmbedBuilder().setDescription("**<G9> Robot Control During Autonomous Period** - During the Autonomous Period, Drive Teams may not\n" +
            "directly or indirectly control or interact with Robots or Driver Stations. Early stopping of the Robot while running\n" +
            "its Autonomous code is not allowed, except in cases of personal or equipment safety. A Major Penalty will be\n" +
            "assessed for violating this rule");
    EmbedBuilder g10 = new EmbedBuilder().setDescription("**<G10> Parked** – Robots must Park at the end of the Autonomous and Driver-Controlled Periods when\n" +
            "competition personnel or timer software announce the end of a Match period. Drive Teams should make their\n" +
            "best effort to stop gameplay immediately when the End of the Period game sound begins. Robots that are not\n" +
            "Parked following an approximate one second grace period after the conclusion of the game sound receive a\n" +
            "Minor Penalty and the actions of the Robot do not count towards their Alliance’s Score. Referees have the\n" +
            "option of issuing a Major Penalty in place of the Minor Penalty if the late stop results in a competitive\n" +
            "advantage (other than Scoring) for the offending Alliance.\n" +
            "Scoring Elements that were Launched (unless disallowed by Game Specific rules) before the End of the Period\n" +
            "are eligible to be counted as Scored. Other Robot Scoring achievements that occur after the announced end of\n" +
            "the Autonomous Period and before the start of the Driver-Controlled Period do not count towards the Score for\n" +
            "the Autonomous or Driver-Controlled Periods. ");
    EmbedBuilder g11 = new EmbedBuilder().setDescription("**<G11> Drive Team Contact with the Playing Field or Robot** – During a Match, the Drive Team is prohibited\n" +
            "from making contact with the Playing Field, any Robot, or any Game Element (except for allowed Human Player\n" +
            "activities). The first instance of contact will result in a warning, with any following instances resulting in a Minor\n" +
            "Penalty. Contact that affects Scoring and/or gameplay will result in issuance of a Yellow Card at the discretion\n" +
            "of the referees. Contact with the Playing Field, a Game Element, or a Robot for safety reasons will not result in\n" +
            "a warning or Penalty. ")
            .setFooter("Note: For example, a Game Element is launched from a Robot on the Playing Field and it\n" +
                    "Inadvertently hits a Team member in the Alliance Station and is deflected back onto\n" +
                    "the field. The Team would not receive a Penalty because the Team member was\n" +
                    "protecting him/herself (safety). However, if that same Game Element is caught and/or\n" +
                    "directed to a specific location on the Playing Field, the Team may be issued a Penalty.");
    EmbedBuilder g12 = new EmbedBuilder().setDescription("**<G12> Autonomous to Driver-Controlled Period Transition** – At the conclusion of the Autonomous Period,\n" +
            "Robots will remain in a hands-off state. Field personnel will not enter the field and will not touch Robots on the\n" +
            "field during the Autonomous to Driver-Controlled transition. Drive Teams will have 5 seconds to pick up their\n" +
            "Driver Station. The scoring system display will provide visual and audio cues for Drive Teams to pick up their\n" +
            "Driver Stations. After the 5 seconds, there will be a 3-2-1 countdown and the Driver-Controlled Period of the\n" +
            "Match will begin.");
    EmbedBuilder g13 = new EmbedBuilder().setDescription("**<G13> Drive Team Coach Driver Station Control** – During the Driver-Controlled Period, Robots must be\n" +
            "remotely operated only by the Drivers using the Gamepads connected to the Team’s Driver Station and/or by\n" +
            "software running on the on-board Robot control system. The first instance of Coach controlling a Robot (for\n" +
            "example, operating a Gamepad) will result in a warning, with any following instances resulting in a Major\n" +
            "Penalty. During the Driver-Controlled Period, Drive Team Coaches and/or Drivers are allowed to hold the\n" +
            "Team’s Driver Station Android device and interact with it to select an Op Mode, view information displayed on\n" +
            "the screen, and initialize, start, stop, and reset the Robot.");
    EmbedBuilder g14 = new EmbedBuilder().setDescription("**<G14> Certifying the Score at Match End** – Scores will be tracked by field personnel throughout the\n" +
            "Autonomous and Driver-Controlled Periods of the Match. At the end of the Match, the final Score will be\n" +
            "certified as quickly as possible. A change in state of a Game Element or Robot at the end of the Match after its\n" +
            "final Score is recorded will not change an already-recorded Score. Scoring Elements will not be recounted at\n" +
            "the end of the Match. ");
    EmbedBuilder g15 = new EmbedBuilder().setDescription("**<G15> Robots Deliberately Detaching Parts** – Robots may not deliberately detach parts during a Match or\n" +
            "leave mechanisms on the Playing Field unless permitted by a Game Specific Rule. Possessed or Controlled\n" +
            "Scoring Elements are not considered to be a part of the Robot for the purpose of this rule. The consequence of\n" +
            "deliberately detaching a part is a Minor Penalty if it does not Block an opposing Alliance Robot, Alliancespecific Scoring Element or Scoring Area. If a deliberately detached component or mechanism affects\n" +
            "gameplay by any Robot, the offending Robot will receive a Major Penalty and will be issued a Yellow Card.\n" +
            "Robot parts that are released but remain connected by a tether are considered detached for the purposes of\n" +
            "this rule.")
            .setFooter("Tethered components that move independently of the main Robot are considered a\n" +
                    "detached component and are illegal.");
    EmbedBuilder g16 = new EmbedBuilder().setDescription("**<G16> Robots Grasping Game Elements** – Robots may not grab, grasp and/or attach to any Game Element,\n" +
            "Robot, or structure other than Scoring Elements, unless specifically allowed by game-specific rule(s) listed in\n" +
            "section 4.6.3. The first instance will result in a warning with any following violations resulting in a Major Penalty.\n");
    EmbedBuilder g17 = new EmbedBuilder().setDescription("**<G17> Destruction, Damage, Tipping, etc.** – Robot actions aimed at the destruction, damage, tipping over, or\n" +
            "entanglement of Robots or Game Elements are not in the spirit of the FIRST Tech Challenge and are not\n" +
            "allowed unless permitted by Game Specific rules. However, FIRST Tech Challenge games are highly\n" +
            "interactive. Robot-to-Robot contact and defensive gameplay should be expected. Some tipping, entanglement,\n" +
            "and damage may occur as a part of normal gameplay. If the tipping, entanglement, or damage is ruled to be\n" +
            "deliberate or chronic, the offending Team will receive a Major Penalty and a Yellow Card. ");
    EmbedBuilder g18 = new EmbedBuilder().setDescription("**<G18> Pinning, Trapping, or Blocking Robots** – A Robot cannot cause an opposing Alliance Robot to\n" +
            "become Pinned, Trapped, or Blocked. If a referee determines this rule is violated, the offending Alliance will\n" +
            "receive a Minor Penalty for every five seconds that they are in violation. If a referee declares a Pinning,\n" +
            "Trapping, or Blocking warning during the Match, the offending Robot must immediately move away at least 3\n" +
            "feet (0.9 m), approximately 1.5 floor Tiles, from the Pinned, Trapped, or Blocked Robot. A Robot cannot incur this type of Penalty during the Autonomous Period unless it is determined by the Referee\n" +
            "to be part of a deliberate strategy and will be penalized as described above. If the violation happens during the\n" +
            "Autonomous Period, the first action done by the offending Robot during the Driver-Controlled Period must be to\n" +
            "move away from the Pinned, Trapped, or Blocked Robot or a Minor Penalty will be assessed immediately and\n" +
            "again for every five-seconds that they are in violation. Game-specific rule(s) listed in section 4.6.3 that further\n" +
            "define Pinning, Trapping, or Blocking take precedence over this general game rule.").setFooter("The intent of this Rule is that Drive Teams begin to immediately move their Robots away\n" +
            "and have a five second grace period to move the required distance, and not that they are\n" +
            "permitted to intentionally Block for up to five seconds.\n");
    EmbedBuilder g19 = new EmbedBuilder().setDescription("**<G19> Forcing an Opponent to Break a Rule** – The actions of an Alliance or their Robots shall not cause an\n" +
            "opposing Alliance or Robot to break a rule and thus incur Penalties. Any forced rule violations committed by\n" +
            "the affected Alliance shall be excused, and no Penalties will be assigned.");
    EmbedBuilder g20 = new EmbedBuilder().setDescription("**<G20> Removing Game Elements from the Playing Field** – Robots may not deliberately remove Game\n" +
            "Elements from the Playing Field during a Match. Game Elements that Inadvertently fall Outside the Playing\n" +
            "Field will be returned to the Playing Field by field personnel at the earliest safe and convenient opportunity at a\n" +
            "non-Scoring location approximately where it left the field. Game Elements removed from the Playing Field in an\n" +
            "attempt to Score are also not subject to this Penalty. Teams deliberately removing Game Elements from the\n" +
            "Playing Field will incur a Minor Penalty per Game Element removed from the Playing Field. Game-specific\n" +
            "rule(s) listed in section 4.6.3 that allow the removal of specified Scoring Elements from the Playing Field take\n" +
            "precedence over this general game rule. ");
    EmbedBuilder g21 = new EmbedBuilder().setDescription("**<G21> Scoring Elements in Contact with Robots** – Scoring Elements in a Scoring Area that are in contact\n" +
            "with or Controlled by a Robot on the corresponding Alliance for the Scoring Area have zero Score value.\n" +
            "Game-specific rule(s) listed in section 4.6.3 that allow Robot contact with Scoring Elements take precedence\n" +
            "over this general game rule.");
    EmbedBuilder g22 = new EmbedBuilder().setDescription("**<G22> Post-Match Removal of Game Elements from Robots** – Robots must be designed to permit easy\n" +
            "removal of Game Elements from the Robot after the Match. Robots should also be able to be removed from the\n" +
            "Playing Field without damaging the Playing Field. A Minor Penalty will be assessed for violations of this rule.\n" +
            "The intent of this rule is to have timely removal of Robots from the Playing Field following a Match.").setFooter("Note: Drive Teams are expected to stage their Robots for a Match, and remove them\n" +
            "from the Playing Field afterwards, safely and swiftly. Drive Team efforts that\n" +
            "either intentionally or unintentionally delay the start of a Match or the Playing\n" +
            "Field reset are not allowed. Examples include, but are not limited to:\n" +
            "• Failing to exit the Playing Field once instructed by a Referee.\n" +
            "• Failing to remove Driver Stations in a timely manner.");
    EmbedBuilder g23 = new EmbedBuilder().setDescription("**<G23> Robot Manipulation of Scoring Elements** – Scoring Elements that are Controlled or Possessed by a\n" +
            "Robot are part of the Robot except when determining the location of the Robot.\n").setFooter("For Example: If a Robot possesses a Scoring Element, and only that Scoring\n" +
            "Element breaks the plane of a Scoring Area, the Robot does not receive points\n" +
            "for being In that Area. ");
    EmbedBuilder g24 = new EmbedBuilder().setDescription("**<G24> Robot or Scoring Elements In Two or More Scoring Areas** – Robots or Scoring Elements that are In\n" +
            "two or more Scoring Areas earn points only for the highest value achievement. If the achievement values are\n" +
            "equal, only one achievement counts as Scored. Exceptions to this general rule may be specified in the\n" +
            "Gameplay section (4.5) or in the game-specific rules.");
    EmbedBuilder g25 = new EmbedBuilder().setDescription("**<G25> Disabled Robot Eligibility** - If a referee Disables a Robot, it will not be eligible to Score or earn points\n" +
            "for the remainder of the Match. A Disabled Robot (whether referee induced or failure) does not earn Penalties\n" +
            "after becoming Disabled. Game-specific rule(s) listed in section 4.6.3 take precedence over this general game\n" +
            "rule.");
    EmbedBuilder g26 = new EmbedBuilder().setDescription("**<G26> Playing Field Tolerances** – Tournament provided Playing Field and Game Elements will start each\n" +
            "Match with tolerances that may vary by as much as +/-1.0 inch (25.4 mm). Teams must design their Robots\n" +
            "accordingly.\n");
    EmbedBuilder g27 =new EmbedBuilder().setDescription("**<G27> Match Replay** – Matches are replayed at the discretion of the Head Referee only for a failure of a nonTeam supplied Game or Field Element or verified Wi-Fi interference that was likely to have impacted which\n" +
            "Alliance won the Match.\n" +
            "Unexpected Robot behavior will not result in a Match replay. Team-induced failures, such as low battery\n" +
            "conditions, processor sleep time-outs, Robot mechanical, electrical, software, or communication failures, etc.\n" +
            "are NOT valid justifications for a replaying of a Match.");
    EmbedBuilder g28 = new EmbedBuilder().setDescription("**<G28> Egregious Behavior** – Egregious Robot or Team member behavior at the Playing Field, as determined\n" +
            "by the referees, will result in a Major Penalty and issuance of a Yellow Card and/or Red Card. Subsequent\n" +
            "violations will result in Team Disqualification from the tournament. Egregious behavior includes, but is not\n" +
            "limited to, repeated and/or flagrant violation of game rules, unsafe behavior or actions, and uncivil behavior\n" +
            "towards Drive Team, competition personnel, or event attendees.");
    EmbedBuilder g29 = new EmbedBuilder().setDescription("**<G29> Illegal Usage of Game Elements** - Robots may not deliberately use Game Elements to ease or\n" +
            "amplify the difficulty of any Scoring or game activity. A Major Penalty will be assessed for violations of this rule.\n" +
            "Continued violations of this rule will escalate to Yellow Cards quickly.\n");
    EmbedBuilder g30 = new EmbedBuilder().setDescription("**<G30> Inadvertent and Inconsequential** - Robot actions that violate a rule may be ruled at the referee’s\n" +
            "discretion to be Inconsequential and Inadvertent and will not be Penalized. ");
    EmbedBuilder gs1 = new EmbedBuilder().setDescription("**<GS1> Human Player Supplied Stones and Capstones** – The Human Player may deliver Stones or\n" +
            "Capstones into their Alliance’s Depot only during the Driver-Controlled Period with the following restrictions:\n")
            .addField("a)","Only one Scoring Element may be Delivered at a time.\n")
            .addField("b)","A Human Player may not Deliver Stones and/or Capstones prior to the start of the Driver-Controlled\n" +
                    "Period.")
            .addField("c)","Stones and Capstones may only be hand-delivered to the Alliance’s Depot. Teams may not bring tools\n" +
                    "or devices to the Playing Field for handling the Stones or Capstones. Accommodations and exceptions\n" +
                    "for a Human Players with disabilities or extenuating circumstances will be made at the discretion of the\n" +
                    "event coordinator.\n")
            .addField("d)"," A Human Player cannot break the vertical plane of the Perimeter Wall when there is a Robot or Scoring\n" +
                    "Element already in the Depot.")
            .addField("e)", "A Human Player cannot hand-deliver a Stone or Capstone into the Playing Field when there is a Robot\n" +
                    "or Scoring Element already in the Depot.")
            .addField("f)","Any Stones that are hand-delivered by the Human Player from the Stone Supply during Autonomous\n" +
                    "are not eligible to receive points.\n")
            .addField("g)","Stones and/or Capstones must be In the Depot and Completely On the Playing Field floor prior to being\n" +
                    "Controlled by a Robot.\n")
            .setFooter("Note: A Disabled Robot In an Alliance Depot is not considered a safety hazard to the Human Player,\n" +
                    "therefore Stones and Capstones may continue to be placed. The rule <GS6> Yellow Card\n" +
                    "consequence applies to the Disabled opposing Alliance Robot In the Depot.\n"+" The intent of this rule is to prevent Robot to human contact and is meant to ensure Human\n" +
                    "Player safety. ");
    EmbedBuilder gs2 = new EmbedBuilder().setDescription("**<GS2> Autonomous Period Interference** – During the Autonomous Period, Robots may not interfere with the\n" +
            "opposing Alliance’s Scoring attempts or contact/disrupt the Stones or Skystones in the opposing Alliance’s\n" +
            "Quarry. A Major Penalty will be assessed for each violation of this rule and any Scoring by the offen");
    EmbedBuilder gs3 = new EmbedBuilder().setDescription("**<GS3> Control/Possession Limits of Stones/Capstones** – Once a Match begins; a Robot may Control or\n" +
            "Possess a maximum of one (1) Stone and/or one (1) Capstone.")
            .addField("a)","Plowing through any quantity of Stones or Capstones is allowed but herding or directing multiple\n" +
            "Stones or Capstones to gain a strategic advantage (i.e., Scoring, accessibility, defense) is not allowed.\n" +
            "The Penalty for Controlling or Possessing more than the allowed quantity is an immediate Minor\n" +
            "Penalty for each Stone or Capstone above the limit plus an additional Minor Penalty per Stone or\n" +
            "Capstone for each 5-second interval that this situation continues. A double Major Penalty will be\n" +
            "assessed for each Stone or Capstone Scored while a Robot Controls or Possesses more than the\n" +
            "allowed quantity. Continued violation of this rule will escalate to Yellow Cards quickly. ")
            .addField("b)","Stones and Capstones In the Foundation are exempt from the Control/Possession Limit. ")
            .addField("c)","Controlling or Possessing an opposing Alliance’s Capstone is a Major Penalty.");
    EmbedBuilder gs4 = new EmbedBuilder().setDescription("**<GS4> Launching of Game Elements** – Game Elements may not be Launched by a Robot or Human Player.\n" +
            "A Minor Penalty will be assessed for every Launched Game Element.");
    EmbedBuilder gs5 = new EmbedBuilder().setDescription("**<GS5> Foundation Scoring Interference** – Robots may not be In their opposing Alliance’s Foundation at any\n" +
            "time. Robots may not interfere with an opposing Alliance Robot that is In their Foundation. The first instance\n" +
            "will result in an immediate Major Penalty and an additional Minor Penalty assessed for every five seconds that\n" +
            "the rule violation persists. Additional occurrences of violations of this rule will escalate to Yellow Cards quickly.")
            .setFooter("Note: The intent of this rule is to prevent game strategies aimed at interfering with Scoring and\n" +
                    "not for Inadvertent and Inconsequential intrusion.");
    EmbedBuilder gs6 = new EmbedBuilder().setDescription("**<GS6> Blocking Access to the Depot** – Robots may not be In or Block access to the opposing Alliance’s\n" +
            "Depot. Inconsequential violations of this rule during the Autonomous Period will be handled per rule <G30>.\n" +
            "The first instance will result in a warning with any following violations resulting in a Major Penalty and an\n" +
            "additional Minor Penalty assessed for every five seconds that the rule violation persists. If the referee declares\n" +
            "a Blocking access warning, the offending Robot must move away at least 3 feet (0.9 m), approximately 1.5\n" +
            "floor Tiles from the Blocked Depot. Failure to move the required 3 feet (0.9 m) within 5 seconds is considered an additional violation and will incur the Penalties described above. Additional occurrences of violations of this\n" +
            "rule will escalate to Yellow Cards quickly.")
            .setFooter("Note: A Disabled Robot In a Depot is not considered a safety hazard, therefore Stones and Capstones may\n" +
                    "continue to be placed. However, a Disabled Robot In the opposing Alliance’s Depot still earns a Yellow Card\n" +
                    "due to the possibility of a severe disruption to the ability of the owner of the Depot to play the game. The intent of this rule is to allow Robot access to and from their Alliance’s Depot. See\n" +
                    "definition of Blocking and Trapping in section 4.4.");
    EmbedBuilder gs7 = new EmbedBuilder().setDescription("**<GS7> Skybridge Specific Penalties** –\n" +
            "a) Robots may not grab, grasp, or hang on the Skybridge pipes. Each occurrence will result in a Major\n" +
            "Penalty.\n" +
            "b) Robots may not move from one Zone to another via the opposing Alliance’s Skybridge section. Each\n" +
            "occurrence will result in an immediate Major Penalty.\n" +
            "c) Robots may not prevent an Opposing Alliance Robot from moving between one Zone to another via the\n" +
            "Neutral Skybridge. This is considered Blocking and will be penalized per <G18>.");
    EmbedBuilder gs8 = new EmbedBuilder().setDescription("**<GS8> Controlling the Opposing Alliance’s Foundation** – Robots may not Control the opposing Alliance’s\n" +
            "Foundation when the Foundation is In the opposing Alliance’s Building Site or at any time during End Game.\n" +
            "The first instance will result in an immediate Major Penalty and an additional Minor Penalty assessed for every\n" +
            "five seconds that the rule violation persists. Additional occurrences of violations of this rule will escalate to\n" +
            "Yellow Cards quickly.\n");
    EmbedBuilder gs9 = new EmbedBuilder().setDescription("**<GS9> Descoring** – Robots may not remove or reposition Stones/Capstones from their opposing Alliance’s\n" +
            "Foundation when the Foundation is In the opposing Alliance’s Building Site or at any time during End Game. A\n" +
            "double Minor Penalty will be assessed for each Stone that is de-scored. If a Capstone is de-scored, a Major\n" +
            "Penalty will also be assessed.\n").setFooter("Drive Teams should exercise care when operating around an opposing Alliance’s\n" +
            "Foundation to avoid De-scoring.");
    EmbedBuilder gs10 = new EmbedBuilder().setDescription("**<GS10> Foundation Movement** – Foundations must remain Completely In the Building Zone. A Minor\n" +
            "Penalty will be assessed for every 5 seconds that the Foundation is not Completely In the Building Zone.\n");
    EmbedBuilder gs11 = new EmbedBuilder().setDescription("**<GS11> Skybridge Safety** – Never step/jump over any section of the Skybridge. The first instance will result\n" +
            "in a warning to the entire Team. The next instance will be a Minor Penalty. The next instance will be a Major\n" +
            "Penalty. Further violations beyond will be considered Egregious Behavior.");
    EmbedBuilder gs12 = new EmbedBuilder().setDescription("**<GS12> Drive Teams Touching Robots or Driver Stations after Quarry Randomization** – Drive Teams are\n" +
            "not allowed to touch or interact with their Robots or Driver Station once field personnel have begun the\n" +
            "randomization process. If this occurs, a Minor Penalty will be assessed, and the affected Robot is not eligible\n" +
            "to earn the Stone Delivery Score in the Autonomous Period. This Penalty only affects the offending Team. The\n" +
            "non-offending Alliance partner Robot remains eligible for the Stone Delivery Scoring achievement.");
}


