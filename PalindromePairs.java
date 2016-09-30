/*
Given a list of unique words. Find all pairs of indices (i, j) in the given list, 
so that the concatenation of the two words, i.e. words[i] + words[j] is a palindrome.

Example 1:
Given words = ["bat", "tab", "cat"]
Return [[0, 1], [1, 0]]
The palindromes are ["battab", "tabbat"]
Example 2:
Given words = ["abcd", "dcba", "lls", "s", "sssll"]
Return [[0, 1], [1, 0], [3, 2], [2, 4]]
The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
*/

//NOT EFFICIENT SOLUTION

import java.util.*;

public class PalindromePairs {
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        for (int i=0; i<words.length; i++){
        	for (int j=i+1; j<words.length; j++) {
        		if (i==j) {
        			continue;
        		}
        		String str = words[i] + words[j];
	            String revstr = new StringBuilder(words[i] + words[j]).reverse().toString();

	            if (str.equals(revstr)) {
	            	List<Integer> temp = new LinkedList<Integer>();
	            	temp.add(i);
	            	temp.add(j);
	            	result.add(temp);
	            }

	            str = words[j] + words[i];
	            revstr = new StringBuilder(words[j] + words[i]).reverse().toString();

	            if (str.equals(revstr)) {
	            	List<Integer> temp = new LinkedList<Integer>();
	            	temp.add(j);
	            	temp.add(i);
	            	result.add(temp);
	            }
        	}
        }

        return result;
    }

    public static void main (String args[]) {
    	String[] words = {"eieeebdjfagghdbfchia","gfdeaccfjhgcgg","gbegjcjjihgjc","jcfdgcgjc","fieihihejjcai","ihgbbec","ejdhiadahjbbfhge","dbhjhgdhi","cbjbdhh","bhijghhaid","ffgfdcficeafibifbih","fijeecbifijjdfddhafi","chgjcbaee","hdjiaiafgaeib","ejbbfdgbc","acbh","efg","aedjdijjeacbajefj","heddcjijfcfcjcije","i","hjiee","idjbdgcchcigchf","dgadifhgfhbcdbbbecc","afjhihijeffj","defffbdgceceefdfcb","eiaeidghdifdbggaggfc","bhhadhfidhha","cgdhjaadgjbde","aiaghjaghigea","hdceeehgga","bgadhjhieff","dicebicahecbi","fedebdihigbaeggd","idbifdghbb","hieid","abjeaa","figjbbebjcahcf","dcdbidbdhdfbbebi","ghfbfbife","bbb","hhdj","hdiai","jjhgch","fjefbdcacijcieii","beeagfhiiccaefe","efbegbcicahjcia","ehjhjgedbijjehged","ehhhdajbjiicfh","edbeeidajii","faicgcafhece","ebgahggfjeajbihcd","bciggiajgjfidhiidj","dfhffebbgcjdda","iafchhgadbid","fagacbadfcbbaf","hjjgbgiefgci","hdedjcigdhjbhgahcab","ehfjibdc","aageeicai","fii","jbdcebjfci","jhbibdbchchdab","jacaiabefihfiagaj","hfjedjfjdgebjichgcj","cdeieijdfeaafg","ggcjcdhchhj","jdi","fj","gbdfhddbahg","fa","cdgcjaai","icheejeehfiedjaa","f","dieeg","hfaibdbjigciadaifcb","cgda","c","bfiddgeabefciahe","ieihahicdeijfjdeie","ihfad","gfiijjcaffeicfea","hgafeaiegjcbihbd","aiedijaa","fafagiiajafdhdh","jhihcbiege","jaghhccheejjce","aiahf","hjicjcahiahcgbhcif","dhggbdcddgegac","jc","ccbhebhcehj","ajhgifcfdcdgfehigd","ajfejeahbgfjib","idigcgbbijfe","hfghgbcjahjghf","eji","ibejcgcfdebhhd","jeeigaiadhh","jhbggbfejef","ahidddbfacddfhjhjgg","dhc","efa","hjbehadfbdeahd","jfead","fhhfehgjc","fgjefeijciahfa","ahgabaebdcdii","gjahd","jfideaaiieigbchgjb","djfigbbifefiffchdd","dggefibheadgije","ch","fijgchjcae","jchgihcfhbf","jhied","ceifjjjaihijhajhfeab","dhfdbdcebbacdg","gdai","gfjcajfb","ihbefhddjfjeefgcicje","chajbecjfgcgbf","bdhgfafafheeb","jjhhgidgcfcaf","habfbc","djfbj","ighgebefcegacach","hejdgig","faeejcjgciid","feccehbfacaecbhbgbc","j","hceaa","jbgibjjccbjbjediacda","igdfhjefcjg","adh","addfafaiafceddbbbb","ihjjjhhbig","ebbabghcb","aceiehheccahhjgcjc","edgjjch","ddhbecdgdddhfejbbcai","dfjbiiedeedgiigf","he","jbachifbif","cacgabgghdhhhgbdf","d","gcahejiec","ihajcbg","jjiib","hideihacfhbh","dhbihjchhj","eaididibhbgcaabifhi","chfb","dje","b","beaehdcffj","afjijfaggg","hb","dgcgadfafifh","eihdhhch","faehddchdgahifb","baahieaiddefhh","eedgaejjbhcebbgiih","becbaad","giafhieb","cijjh","efigdfgdh","ffgfbgfiabijhc","aafdcfcjecbebfib","faffejbjhedfibfhf","fd","gjhbi","geeifjbfje","jbghifihabhb","gehffffgicfjaed","ddejhffad","acbfbehgcdjcgidfgj","hbacf","ece","hfabihdhgggjjcgja","hibdjbgdbadeiajchd","aghgafejegcchidide","ddcebfbgihcbjegefj","eahhhbabedgi","jbjcifjhieg","fdfgfaieejh","bfhchaghjjchba","ehiae","heifahghjciahhdh","ig","ihc","hccjcjaiiaa","hdhefbgefjadbiiacf","gajgcjhadd","gfce","eaegbfjeihfebjj","fjjdeicbda","efbbeijgceiiee","ahbjebae","ffa","gjdfijghgdfb","hfgagdbbghcejh","afajbechh","cicigfdbfjccdccegf","ffhdiifadbjdjijc","hdggdjajb","ebdia","gfdjhbj","bgdfc","dfceagabfecbcjbhb","aheeifgiibjigh","ifgdaidba","ciadjfjhd","eggadicdec","g","cheiafaehiefcb","dhhhebhicffiecbehb","ahfhjhfideafc","befcacfeddaiegeghff","bgahbgaibdhbdddje","eedghcafgcfhebdehead","igjgadicjdgbhhbheh","gaecj","iceieaiigb","bdjfhihgafjhcb","jge","ic","dciehedicbaee","fhcfjfdcggbhagea","ecidjgffggbcejecigg","jabi","cficjchbefd","dgcdhhebgfhbgbdca","eeabbfaibdedhfdc","giaicjie","hhfejfgfcbd","bfeccfjgeifjhigdgdhg","cjhjjbchh","cehddjbjbdheaaj","iijj","eciigagdaf","fb","eae","gbegd","dcgecabdgjabe","dd","ddiceefed","fehadhcfbafhfjficj","cfgdihcfa","fcgejba","chchdaeaii","ijfjhjaii","accaeheabiceijhadh","bdad","jgcjaed","bccbejd","ha","cbjjf","cgh","fjfcdfbdhdfbhhb","afi","hcdh","hdchiedjahdh","hcdhbjibhgachcjiiihj","ahjdjgfegafihaaijgfi","daceabdecijcch","ejgdaecjjcbhcbifhea","je","gafihfgbibijdhejadbg","fgbdafddifcgjbecij","fbhhebh","ffbijihbg","hjdfdijaaai","eajaidbjejbai","edfgfhehjdeegba","fjdjjcaidcjegi","beeijibhdfbfiig","hfddejcb","eaaiefha","haifdfjgeiidehad","ddagad","cadfejdfdeijb","hhebgbh","cefid","idgiaebjdcdijg","bjiddgdcfbiddbd","jfgdabdaid","dibfefcdcgdacihfe","fhghhfjjagifadagahgd","jecjjcchjfiaj","eggeiehaeggbdcgdebia","dfh","djdhbdgcgcjjgagdjdib","ddeigbigbjajjdcbiah","bgbaeea","daedcccfaejiiijceeac","heiegcgadageidgfida","ibgeh","cghejcedbbfba","ebfbchddcjhdhhh","dgeejicfdadhhfj","eaahddh","fhaddbaeggcgehf","eebiahbbhfjbba","ifh","ahi","ijigjdhc","hhjcceihjidjhbjab","abghce","ei","fjcbh","gec","aecaecaaicfgddfdjage","gdfgdh","abbijffichbcfadgjgc","ddccjfbedaih","biecdabhih","dhaejgaiecaefdbb","eeccjffjgag","ci","gca","aghhjah","hdfedgjgjicg","djebdhcfehbcgd","fidaefbfffd","dajadgbabheejaf","degeciccaeij","hghfdcadfgaaaaebacj","jidicafdjgchcjeaddg","bhjchgbj","jajb","cjahfgachghdajbjai","igahibghbiejjeeche","dcijchgabhajaijga","biecej","gedfdbhfci","ddjcfahiahcdaijbeh","da","gcehj","bjaedeiedcbf","jjjbacbiigej","jafejfdjeijdhfhacia","afjjhbdfcajdeege","cgj","gjjgiaefefhjhabaad","hfj","hgaajeajeihhbdcfb","gjagdfeffffjg","bfbbbgic","ddjahjeihcgcebec","ijacdhjbhfgggi","jjbjifjfib","jii","adfjeeihgfcdcacfff","ejid","hehcbjhijcddbhc","ehcbjadi","cdbcjiiaaedid","a","jhhajf","eccgjigajcadcdijjhhg","hebcbichdiffdje","ef","cjcjjcigagdeiahaigh","bjeahjeddjgcfbhabde","gjaijjcibaia","hcghdghaba","chadficjhd","ebfbbjgjbehdh","gdhfeijiedh","bgecgf","hcfc","ajbhaehij","idj","gjeafabahabacehhadj","didggidbefag","bbeijgcif","fg","dhheeeiaai","gi","ccbbhjeechjgdbdjgeg","cgdeagc","bjaegifjejdiac","ehebihifehagdcfgd","fgdfgiedgchbffebe","acea","ifhccjhjjdcdcdd","eafabdccg","bciafbaddbiajcfaba","dibhadicbedaedcf","icbjcbgdjcbbbihciac","dchhfaaedgjc","jdid","cgfiecbfhgcdih","acgiahceegjij","gcjibifagcbfcaf","cdejbddbcfggh","eegadhiggd","jhfeihihiggheaeh","eaegfhjigghh","dgdhjdhdfccgjed","dgcdafhggedgihd","hahbghccdjfdaicgjh","dgiedc","cgefaigdahja","geeibedddejiid","hhcbgcddeghjjhahad","ajcfegjdfej","bciefcehjdgacfhiabhb","bejddfchf","icgfihjcfdjbjihgfdf","hfcge","ggici","aiheciafhdij","dggdgadjbeahcbbed","edeeijcbijaaf","jd","hjbe","bafdhehigef","cfiiabjighdgcb","bfegji","aahgcfcfgaafaej","ebeab","cibceag","gbfffdgahjcgb","gdheadhf","h","ebhjjeig","hccacaabheehaeedg","jcag","bddgb","acbfbj","fcgjjhgedgghgc","gchhehadhbdjj","dabah","jeigdbiajiffdcc","af","bhdcce","hcgjjhaajdbbibiaaaef","ghfhgcgjbjhjjaha","ejdegcbfadeefcdg","ddefc","ibhhjebfhfjbgjhafdhg","jhgfbadac","gjiehddfhcjf","ahghjbhdhbgg","ifjeeicjdbbdhge","digei","ibdiafghbegcbd","efjf","fbhgidbjbaacb","hhgccfbi","egiigbaebeh","ifcabgiiie","cee","haejehfabheechj","gchheebifi","dfjjggidicbhgace","ifgaaghfjfbbhaacibj","ibcjhfa","hgajachehijbdbgfh","bgcbbahjgfae","fgadbhhhdfheecace","gacjedibfbhdbcfb","bdgggg","cid","hichc","dgjc","decchcfcfjb","fhaidcii","ja","ijdgiiajbe","hi","efgicgddfhdfied","hjafceb","ajdhjgjeie","caiechgjegegbdbee","dffiaefbefagie","affa","bbcaeffbhefdcfghedab","gjbe","gegfhhiihhfccbba","igcgj","efhbjcfdfdghiebgbbaf","fghddheejjcbadg","ceieiafeacj","acbcdjfejdbgcg","heheffbjagegig","bbecfgjdcfcahj","faebeadiejiheejij","ceijidbiagehh","jfehbijha","iejdiid","gedd","deejaicjcdbaj","hbcjhce","ahfjbe","jjdifbjfcjbb","iihebei","jjbdbjihghifijc","fhcjjifccdddh","jgbahb","deiifabadjadah","eajajijdheggbdjbfcdj","ijdgadceffag","edd","fi","eahfjiidebg","acajeahddji","fdhafdggcggiffbc","diigjihdebabiffcef","jdiiibbhii","chcgcfgcjj","iahicjfcjdddgjjjghi","dffcghijfehfhg","abgjbchcfijg","ddafiadhhciejhbehegi","bheic","jaigbfbbffhcjfddeab","dhcjhigjfdbfged","bifhfc","hgegfgfc","addjfi","iababijcfcbdb","ibgfiba","fgdjaejcfjibdg","jdhjfebjgbda","dehfaegigafcg","cdfbdjgfiggibechejgc","e","diccheec","ggd","aj","hjagfeehafec","agfbcdijdaca","cgcifccjbeegb","fji","dbfejghagca","iicehgdigjb","aiadaaagfbf","diidbddgjjhbfj","cidfigaefbbibdcgbig","ibfegcajcegidc","cehaibgccejieeceebgf","fiacaieiegagf","aijjhfdg","fbgjeheb","chciicbeebedbfgabe","iceicaiiccghgjf","bdfgecag","ejeicfihjcfdabge","dbd","ffie","dhee","jjefdfghaibfegbcbjii","dabbbcf","gfcjaibgiadh","cjcaahi","gddhaeehaafidf","aigbgddib","bdddfaedfcfbb","cifbf","efdibhebc","cfijhghb","fjiibjacegiac","jhijbejahbidcgg","dbjfbgfgdageia","eibbdegdciad","gjh","eddihjjfefee","dbgcjdfedjgacfafai"};
    	List<List<Integer>> result = palindromePairs(words);
    	System.out.println(result);
    }
}