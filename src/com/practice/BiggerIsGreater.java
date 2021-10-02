package com.practice;

import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String args[]) {

        /*String inputStr[] = {"imllmmcslslkyoegymoa", "fvincndjrurfh", "rtglgzzqxnuflitnlyit", "mhtvaqofxtyrz", "zalqxykemvzzgaka", "wjjulziszbqqdcpdnhdo", "japjbvjlxzkgietkm", "jqczvgqywydkunmjw", "ehdegnmorgafrjxvksc", "tydwixlwghlmqo", "wddnwjneaxbwhwamr", "pnimbesirfbivxl", "mijamkzpiiniveik", "qxtwpdpwexuej", "qtcshorwyck", "xoojiggdcyjrupr", "vcjmvngcdyabcmjz", "xildrrhpca", "rrcntnbqchsfhvijh", "kmotatmrabtcomu", "bnfcejmyotvw", "dnppdkpywiaxddoqx", "tmowsxkrodmkkra", "jfkaehlegohwggf", "ttylsiegnttymtyx", "kyetllczuyibdkwyihrq", "xdhqbvlbtmmtshefjf", "kpdpzzohihzwgdfzgb", "kuywptftapaa", "qfqpegznnyludrv", "ufwogufbzaboaepslikq", "jfejqapjvbdcxtkry", "sypjbvatgidyxodd", "wdpfyqjcpcn", "baabpjckkytudr", "uvwurzjyzbhcqmrypraq", "kvtwtmqygksbim", "ivsjycnooeodwpt", "zqyxjnnitzawipqsm", "blmrzavodtfzyepz", "bmqlhqndacv", "phvauobwkrcfwdecsd", "vpygyqubqywkndhpzw", "yikanhdrjxw", "vnpblfxmvwkflqobrk", "pserilwzxwyorldsxksl", "qymbqaehnyzhfqpqprpl", "fcakwzuqlzglnibqmkd", "jkscckttaeifiksgkmxx", "dkbllravwnhhfjjrce", "imzsyrykfvjt", "tvogoocldlukwfcajvix", "cvnagtypozljpragvlj", "hwcmacxvmus", "rhrzcpprqccf", "clppxvwtaktchqrdif", "qwusnlldnolhq", "yitveovrja", "arciyxaxtvmfgquwb", "pzbxvxdjuuvuv", "nxfowilpdxwlpt", "swzsaynxbytytqtq", "qyrogefleeyt", "iotjgthvslvmjpcchhuf", "knfpyjtzfq", "tmtbfayantmwk", "asxwzygngwn", "rmwiwrurubt", "bhmpfwhgqfcqfldlhs", "yhbidtewpgp", "jwwbeuiklpodvzii", "anjhprmkwibe", "lpwhqaebmr", "dunecynelymcpyonjq", "hblfldireuivzekegit", "uryygzpwifrricwvge", "kzuhaysegaxtwqtvx", "kvarmrbpoxxujhvgpw", "hanhaggqzdpunkugzmhq", "gnwqwsylqeuqr", "qzkjbnyvclrkmdtc", "argsnaqbquv", "obbnlkoaklcx", "ojiilqieycsasvqosycu", "qhlgiwsmtxbffjsxt", "vvrvnmndeogyp", "ibeqzyeuvfzb", "sajpyegttujxyx", "zmdjphzogfldlkgbchnt", "tbanvjmwirxx", "gmdhdlmopzyvddeqyjja", "yxvmvedubzcpd", "soygdzhbckfuk", "gkbekyrhcwc", "wevzqpnqwtpfu", "rbobquotbysufwqjeo", "bpgqfwoyntuhkvwo", "schtabphairewhfmp", "rlmrahlisggguykeu", "fjtfrmlqvsekq"};
        String outputStr[] = {"imllmmcslslkyoegyoam", "fvincndjrurhf", "rtglgzzqxnuflitnlyti", "mhtvaqofxtyzr", "zalqxykemvzzgkaa", "wjjulziszbqqdcpdnhod", "japjbvjlxzkgietmk", "jqczvgqywydkunmwj", "ehdegnmorgafrjxvsck", "tydwixlwghlomq", "wddnwjneaxbwhwarm", "pnimbesirfbixlv", "mijamkzpiiniveki", "qxtwpdpwexuje", "qtcshorwykc", "xoojiggdcyjrurp", "vcjmvngcdyabcmzj", "xildrrpach", "rrcntnbqchsfhvjhi", "kmotatmrabtcoum", "bnfcejmyotwv", "dnppdkpywiaxddoxq", "tmowsxkrodmkrak", "jfkaehlegowfggh", "ttylsiegnttymxty", "kyetllczuyibdkwyiqhr", "xdhqbvlbtmmtshejff", "kpdpzzohihzwgdgbfz", "kuywptftpaaa", "qfqpegznnyludvr", "ufwogufbzaboaepsliqk", "jfejqapjvbdcxtkyr", "sypjbvatgiodddxy", "wdpfyqjcpnc", "baabpjckkyturd", "uvwurzjyzbhcqmryprqa", "kvtwtmqygksbmi", "ivsjycnooeodwtp", "zqyxjnnitzawipsmq", "blmrzavodtfzyezp", "bmqlhqndavc", "phvauobwkrcfwdedcs", "vpygyqubqywkndhwpz", "yikanhdrwjx", "vnpblfxmvwkflqokbr", "pserilwzxwyorldsxlks", "qymbqaehnyzhfqpqrlpp", "fcakwzuqlzglnidbkmq", "jkscckttaeifiksgkxmx", "dkbllravwnhhfjjrec", "imzsyrykfvtj", "tvogoocldlukwfcajvxi", "cvnagtypozljprajglv", "hwcmacxvsmu", "rhrzcpprqcfc", "clppxvwtaktchqrfdi", "qwusnlldnolqh", "yitverajov", "arciyxaxtvmfgqwbu", "pzbxvxdjuuvvu", "nxfowilpdxwltp", "swzsaynxbytyttqq", "qyrogefletey", "iotjgthvslvmjpcchufh", "knfpyjtzqf", "tmtbfayantwkm", "asxwzygnngw", "rmwiwrurutb", "bhmpfwhgqfcqfldlsh", "yhbidtewppg", "jwwbeuiklpodziiv", "anjhprmkwieb", "lpwhqaebrm", "dunecynelymcpyonqj", "hblfldireuivzekegti", "uryygzpwifrriecgvw", "kzuhaysegaxtwqtxv", "kvarmrbpoxxujhvgwp", "hanhaggqzdpunkugzmqh", "gnwqwsylqeurq", "qzkjbnyvclrkmtcd", "argsnaqbqvu", "obbnlkoaklxc", "ojiilqieycsasvqosyuc", "qhlgiwsmtxbffjtsx", "vvrvnmndeopgy", "ibeqzyeuvzbf", "sajpyegttujyxx", "zmdjphzogfldlkgbchtn", "tbanvjmwixrx", "gmdhdlmopzyvddeyajjq", "yxvmvedubzdcp", "soygdzhbckkfu", "gkbekyrhwcc", "wevzqpnqwtpuf", "rbobquotbysufwqjoe", "bpgqfwoyntuhkwov", "schtabphairewhfpm", "rlmrahlisggguykue", "fjtfrmlqvseqk"};

        for(int i=0; i<inputStr.length; i++) {
            String tempStr = BiggerIsGreater.biggerIsGreater(inputStr[i]);
            System.out.println(tempStr);
            if(!tempStr.equalsIgnoreCase(outputStr[i])) {
                System.out.println(inputStr[i] + " -- "+tempStr+" ** Not Matched");
            }
        }*/


//        String tempStr = BiggerIsGreater.biggerIsGreater("ehdegnmorgafrjxvksc");//ehdegnmorgcafjkrsvx
//        System.out.println(tempStr);//ehdegnmorgafrjxvsck

        String str = "tydwixlwghlmqo";
        System.out.println(BiggerIsGreater.biggerIsGreater(str));
    }


    static String biggerIsGreater(String w) {
        StringBuilder result = new StringBuilder(w);
        int start = -1, end = -1;

        for(int i=result.length()-1; i>0; i--) {
            for(int j=i-1; j>=0; j--) {
                if(result.charAt(j) < result.charAt(i)){
                    if(start != -1 && end != -1 && (i<start && j>end)) {
                        start = i;
                        end = j;
                    } else if(start == -1 && end == -1) {
                        start = i;
                        end = j;
                    }
                }
            }
        }

        if(start != -1 && end != -1) {
            char ch = result.charAt(start);
            result.setCharAt(start, result.charAt(end));
            result.setCharAt(end, ch);

            char tempArray[] = result.substring(end+1).toCharArray();
            Arrays.sort(tempArray);
            result.replace(end+1,result.length(), new String(tempArray));

        } else {
            result = new StringBuilder("no answer");
        }

        return result.toString();
    }
}
