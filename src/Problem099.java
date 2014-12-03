import java.math.BigInteger;

/**
 * Created by sreedish.ps on 19/10/14.
 */
public class Problem099 {
    static String input = "519432,525806\n" +
            "632382,518061\n" +
            "78864,613712\n" +
            "466580,530130\n" +
            "780495,510032\n" +
            "525895,525320\n" +
            "15991,714883\n" +
            "960290,502358\n" +
            "760018,511029\n" +
            "166800,575487\n" +
            "210884,564478\n" +
            "555151,523163\n" +
            "681146,515199\n" +
            "563395,522587\n" +
            "738250,512126\n" +
            "923525,503780\n" +
            "595148,520429\n" +
            "177108,572629\n" +
            "750923,511482\n" +
            "440902,532446\n" +
            "881418,505504\n" +
            "422489,534197\n" +
            "979858,501616\n" +
            "685893,514935\n" +
            "747477,511661\n" +
            "167214,575367\n" +
            "234140,559696\n" +
            "940238,503122\n" +
            "728969,512609\n" +
            "232083,560102\n" +
            "900971,504694\n" +
            "688801,514772\n" +
            "189664,569402\n" +
            "891022,505104\n" +
            "445689,531996\n" +
            "119570,591871\n" +
            "821453,508118\n" +
            "371084,539600\n" +
            "911745,504251\n" +
            "623655,518600\n" +
            "144361,582486\n" +
            "352442,541775\n" +
            "420726,534367\n" +
            "295298,549387\n" +
            "6530,787777\n" +
            "468397,529976\n" +
            "672336,515696\n" +
            "431861,533289\n" +
            "84228,610150\n" +
            "805376,508857\n" +
            "444409,532117\n" +
            "33833,663511\n" +
            "381850,538396\n" +
            "402931,536157\n" +
            "92901,604930\n" +
            "304825,548004\n" +
            "731917,512452\n" +
            "753734,511344\n" +
            "51894,637373\n" +
            "151578,580103\n" +
            "295075,549421\n" +
            "303590,548183\n" +
            "333594,544123\n" +
            "683952,515042\n" +
            "60090,628880\n" +
            "951420,502692\n" +
            "28335,674991\n" +
            "714940,513349\n" +
            "343858,542826\n" +
            "549279,523586\n" +
            "804571,508887\n" +
            "260653,554881\n" +
            "291399,549966\n" +
            "402342,536213\n" +
            "408889,535550\n" +
            "40328,652524\n" +
            "375856,539061\n" +
            "768907,510590\n" +
            "165993,575715\n" +
            "976327,501755\n" +
            "898500,504795\n" +
            "360404,540830\n" +
            "478714,529095\n" +
            "694144,514472\n" +
            "488726,528258\n" +
            "841380,507226\n" +
            "328012,544839\n" +
            "22389,690868\n" +
            "604053,519852\n" +
            "329514,544641\n" +
            "772965,510390\n" +
            "492798,527927\n" +
            "30125,670983\n" +
            "895603,504906\n" +
            "450785,531539\n" +
            "840237,507276\n" +
            "380711,538522\n" +
            "63577,625673\n" +
            "76801,615157\n" +
            "502694,527123\n" +
            "597706,520257\n" +
            "310484,547206\n" +
            "944468,502959\n" +
            "121283,591152\n" +
            "451131,531507\n" +
            "566499,522367\n" +
            "425373,533918\n" +
            "40240,652665\n" +
            "39130,654392\n" +
            "714926,513355\n" +
            "469219,529903\n" +
            "806929,508783\n" +
            "287970,550487\n" +
            "92189,605332\n" +
            "103841,599094\n" +
            "671839,515725\n" +
            "452048,531421\n" +
            "987837,501323\n" +
            "935192,503321\n" +
            "88585,607450\n" +
            "613883,519216\n" +
            "144551,582413\n" +
            "647359,517155\n" +
            "213902,563816\n" +
            "184120,570789\n" +
            "258126,555322\n" +
            "502546,527130\n" +
            "407655,535678\n" +
            "401528,536306\n" +
            "477490,529193\n" +
            "841085,507237\n" +
            "732831,512408\n" +
            "833000,507595\n" +
            "904694,504542\n" +
            "581435,521348\n" +
            "455545,531110\n" +
            "873558,505829\n" +
            "94916,603796\n" +
            "720176,513068\n" +
            "545034,523891\n" +
            "246348,557409\n" +
            "556452,523079\n" +
            "832015,507634\n" +
            "173663,573564\n" +
            "502634,527125\n" +
            "250732,556611\n" +
            "569786,522139\n" +
            "216919,563178\n" +
            "521815,525623\n" +
            "92304,605270\n" +
            "164446,576167\n" +
            "753413,511364\n" +
            "11410,740712\n" +
            "448845,531712\n" +
            "925072,503725\n" +
            "564888,522477\n" +
            "7062,780812\n" +
            "641155,517535\n" +
            "738878,512100\n" +
            "636204,517828\n" +
            "372540,539436\n" +
            "443162,532237\n" +
            "571192,522042\n" +
            "655350,516680\n" +
            "299741,548735\n" +
            "581914,521307\n" +
            "965471,502156\n" +
            "513441,526277\n" +
            "808682,508700\n" +
            "237589,559034\n" +
            "543300,524025\n" +
            "804712,508889\n" +
            "247511,557192\n" +
            "543486,524008\n" +
            "504383,526992\n" +
            "326529,545039\n" +
            "792493,509458\n" +
            "86033,609017\n" +
            "126554,589005\n" +
            "579379,521481\n" +
            "948026,502823\n" +
            "404777,535969\n" +
            "265767,554022\n" +
            "266876,553840\n" +
            "46631,643714\n" +
            "492397,527958\n" +
            "856106,506581\n" +
            "795757,509305\n" +
            "748946,511584\n" +
            "294694,549480\n" +
            "409781,535463\n" +
            "775887,510253\n" +
            "543747,523991\n" +
            "210592,564536\n" +
            "517119,525990\n" +
            "520253,525751\n" +
            "247926,557124\n" +
            "592141,520626\n" +
            "346580,542492\n" +
            "544969,523902\n" +
            "506501,526817\n" +
            "244520,557738\n" +
            "144745,582349\n" +
            "69274,620858\n" +
            "292620,549784\n" +
            "926027,503687\n" +
            "736320,512225\n" +
            "515528,526113\n" +
            "407549,535688\n" +
            "848089,506927\n" +
            "24141,685711\n" +
            "9224,757964\n" +
            "980684,501586\n" +
            "175259,573121\n" +
            "489160,528216\n" +
            "878970,505604\n" +
            "969546,502002\n" +
            "525207,525365\n" +
            "690461,514675\n" +
            "156510,578551\n" +
            "659778,516426\n" +
            "468739,529945\n" +
            "765252,510770\n" +
            "76703,615230\n" +
            "165151,575959\n" +
            "29779,671736\n" +
            "928865,503569\n" +
            "577538,521605\n" +
            "927555,503618\n" +
            "185377,570477\n" +
            "974756,501809\n" +
            "800130,509093\n" +
            "217016,563153\n" +
            "365709,540216\n" +
            "774508,510320\n" +
            "588716,520851\n" +
            "631673,518104\n" +
            "954076,502590\n" +
            "777828,510161\n" +
            "990659,501222\n" +
            "597799,520254\n" +
            "786905,509727\n" +
            "512547,526348\n" +
            "756449,511212\n" +
            "869787,505988\n" +
            "653747,516779\n" +
            "84623,609900\n" +
            "839698,507295\n" +
            "30159,670909\n" +
            "797275,509234\n" +
            "678136,515373\n" +
            "897144,504851\n" +
            "989554,501263\n" +
            "413292,535106\n" +
            "55297,633667\n" +
            "788650,509637\n" +
            "486748,528417\n" +
            "150724,580377\n" +
            "56434,632490\n" +
            "77207,614869\n" +
            "588631,520859\n" +
            "611619,519367\n" +
            "100006,601055\n" +
            "528924,525093\n" +
            "190225,569257\n" +
            "851155,506789\n" +
            "682593,515114\n" +
            "613043,519275\n" +
            "514673,526183\n" +
            "877634,505655\n" +
            "878905,505602\n" +
            "1926,914951\n" +
            "613245,519259\n" +
            "152481,579816\n" +
            "841774,507203\n" +
            "71060,619442\n" +
            "865335,506175\n" +
            "90244,606469\n" +
            "302156,548388\n" +
            "399059,536557\n" +
            "478465,529113\n" +
            "558601,522925\n" +
            "69132,620966\n" +
            "267663,553700\n" +
            "988276,501310\n" +
            "378354,538787\n" +
            "529909,525014\n" +
            "161733,576968\n" +
            "758541,511109\n" +
            "823425,508024\n" +
            "149821,580667\n" +
            "269258,553438\n" +
            "481152,528891\n" +
            "120871,591322\n" +
            "972322,501901\n" +
            "981350,501567\n" +
            "676129,515483\n" +
            "950860,502717\n" +
            "119000,592114\n" +
            "392252,537272\n" +
            "191618,568919\n" +
            "946699,502874\n" +
            "289555,550247\n" +
            "799322,509139\n" +
            "703886,513942\n" +
            "194812,568143\n" +
            "261823,554685\n" +
            "203052,566221\n" +
            "217330,563093\n" +
            "734748,512313\n" +
            "391759,537328\n" +
            "807052,508777\n" +
            "564467,522510\n" +
            "59186,629748\n" +
            "113447,594545\n" +
            "518063,525916\n" +
            "905944,504492\n" +
            "613922,519213\n" +
            "439093,532607\n" +
            "445946,531981\n" +
            "230530,560399\n" +
            "297887,549007\n" +
            "459029,530797\n" +
            "403692,536075\n" +
            "855118,506616\n" +
            "963127,502245\n" +
            "841711,507208\n" +
            "407411,535699\n" +
            "924729,503735\n" +
            "914823,504132\n" +
            "333725,544101\n" +
            "176345,572832\n" +
            "912507,504225\n" +
            "411273,535308\n" +
            "259774,555036\n" +
            "632853,518038\n" +
            "119723,591801\n" +
            "163902,576321\n" +
            "22691,689944\n" +
            "402427,536212\n" +
            "175769,572988\n" +
            "837260,507402\n" +
            "603432,519893\n" +
            "313679,546767\n" +
            "538165,524394\n" +
            "549026,523608\n" +
            "61083,627945\n" +
            "898345,504798\n" +
            "992556,501153\n" +
            "369999,539727\n" +
            "32847,665404\n" +
            "891292,505088\n" +
            "152715,579732\n" +
            "824104,507997\n" +
            "234057,559711\n" +
            "730507,512532\n" +
            "960529,502340\n" +
            "388395,537687\n" +
            "958170,502437\n" +
            "57105,631806\n" +
            "186025,570311\n" +
            "993043,501133\n" +
            "576770,521664\n" +
            "215319,563513\n" +
            "927342,503628\n" +
            "521353,525666\n" +
            "39563,653705\n" +
            "752516,511408\n" +
            "110755,595770\n" +
            "309749,547305\n" +
            "374379,539224\n" +
            "919184,503952\n" +
            "990652,501226\n" +
            "647780,517135\n" +
            "187177,570017\n" +
            "168938,574877\n" +
            "649558,517023\n" +
            "278126,552016\n" +
            "162039,576868\n" +
            "658512,516499\n" +
            "498115,527486\n" +
            "896583,504868\n" +
            "561170,522740\n" +
            "747772,511647\n" +
            "775093,510294\n" +
            "652081,516882\n" +
            "724905,512824\n" +
            "499707,527365\n" +
            "47388,642755\n" +
            "646668,517204\n" +
            "571700,522007\n" +
            "180430,571747\n" +
            "710015,513617\n" +
            "435522,532941\n" +
            "98137,602041\n" +
            "759176,511070\n" +
            "486124,528467\n" +
            "526942,525236\n" +
            "878921,505604\n" +
            "408313,535602\n" +
            "926980,503640\n" +
            "882353,505459\n" +
            "566887,522345\n" +
            "3326,853312\n" +
            "911981,504248\n" +
            "416309,534800\n" +
            "392991,537199\n" +
            "622829,518651\n" +
            "148647,581055\n" +
            "496483,527624\n" +
            "666314,516044\n" +
            "48562,641293\n" +
            "672618,515684\n" +
            "443676,532187\n" +
            "274065,552661\n" +
            "265386,554079\n" +
            "347668,542358\n" +
            "31816,667448\n" +
            "181575,571446\n" +
            "961289,502320\n" +
            "365689,540214\n" +
            "987950,501317\n" +
            "932299,503440\n" +
            "27388,677243\n" +
            "746701,511701\n" +
            "492258,527969\n" +
            "147823,581323\n" +
            "57918,630985\n" +
            "838849,507333\n" +
            "678038,515375\n" +
            "27852,676130\n" +
            "850241,506828\n" +
            "818403,508253\n" +
            "131717,587014\n" +
            "850216,506834\n" +
            "904848,504529\n" +
            "189758,569380\n" +
            "392845,537217\n" +
            "470876,529761\n" +
            "925353,503711\n" +
            "285431,550877\n" +
            "454098,531234\n" +
            "823910,508003\n" +
            "318493,546112\n" +
            "766067,510730\n" +
            "261277,554775\n" +
            "421530,534289\n" +
            "694130,514478\n" +
            "120439,591498\n" +
            "213308,563949\n" +
            "854063,506662\n" +
            "365255,540263\n" +
            "165437,575872\n" +
            "662240,516281\n" +
            "289970,550181\n" +
            "847977,506933\n" +
            "546083,523816\n" +
            "413252,535113\n" +
            "975829,501767\n" +
            "361540,540701\n" +
            "235522,559435\n" +
            "224643,561577\n" +
            "736350,512229\n" +
            "328303,544808\n" +
            "35022,661330\n" +
            "307838,547578\n" +
            "474366,529458\n" +
            "873755,505819\n" +
            "73978,617220\n" +
            "827387,507845\n" +
            "670830,515791\n" +
            "326511,545034\n" +
            "309909,547285\n" +
            "400970,536363\n" +
            "884827,505352\n" +
            "718307,513175\n" +
            "28462,674699\n" +
            "599384,520150\n" +
            "253565,556111\n" +
            "284009,551093\n" +
            "343403,542876\n" +
            "446557,531921\n" +
            "992372,501160\n" +
            "961601,502308\n" +
            "696629,514342\n" +
            "919537,503945\n" +
            "894709,504944\n" +
            "892201,505051\n" +
            "358160,541097\n" +
            "448503,531745\n" +
            "832156,507636\n" +
            "920045,503924\n" +
            "926137,503675\n" +
            "416754,534757\n" +
            "254422,555966\n" +
            "92498,605151\n" +
            "826833,507873\n" +
            "660716,516371\n" +
            "689335,514746\n" +
            "160045,577467\n" +
            "814642,508425\n" +
            "969939,501993\n" +
            "242856,558047\n" +
            "76302,615517\n" +
            "472083,529653\n" +
            "587101,520964\n" +
            "99066,601543\n" +
            "498005,527503\n" +
            "709800,513624\n" +
            "708000,513716\n" +
            "20171,698134\n" +
            "285020,550936\n" +
            "266564,553891\n" +
            "981563,501557\n" +
            "846502,506991\n" +
            "334,1190800\n" +
            "209268,564829\n" +
            "9844,752610\n" +
            "996519,501007\n" +
            "410059,535426\n" +
            "432931,533188\n" +
            "848012,506929\n" +
            "966803,502110\n" +
            "983434,501486\n" +
            "160700,577267\n" +
            "504374,526989\n" +
            "832061,507640\n" +
            "392825,537214\n" +
            "443842,532165\n" +
            "440352,532492\n" +
            "745125,511776\n" +
            "13718,726392\n" +
            "661753,516312\n" +
            "70500,619875\n" +
            "436952,532814\n" +
            "424724,533973\n" +
            "21954,692224\n" +
            "262490,554567\n" +
            "716622,513264\n" +
            "907584,504425\n" +
            "60086,628882\n" +
            "837123,507412\n" +
            "971345,501940\n" +
            "947162,502855\n" +
            "139920,584021\n" +
            "68330,621624\n" +
            "666452,516038\n" +
            "731446,512481\n" +
            "953350,502619\n" +
            "183157,571042\n" +
            "845400,507045\n" +
            "651548,516910\n" +
            "20399,697344\n" +
            "861779,506331\n" +
            "629771,518229\n" +
            "801706,509026\n" +
            "189207,569512\n" +
            "737501,512168\n" +
            "719272,513115\n" +
            "479285,529045\n" +
            "136046,585401\n" +
            "896746,504860\n" +
            "891735,505067\n" +
            "684771,514999\n" +
            "865309,506184\n" +
            "379066,538702\n" +
            "503117,527090\n" +
            "621780,518717\n" +
            "209518,564775\n" +
            "677135,515423\n" +
            "987500,501340\n" +
            "197049,567613\n" +
            "329315,544673\n" +
            "236756,559196\n" +
            "357092,541226\n" +
            "520440,525733\n" +
            "213471,563911\n" +
            "956852,502490\n" +
            "702223,514032\n" +
            "404943,535955\n" +
            "178880,572152\n" +
            "689477,514734\n" +
            "691351,514630\n" +
            "866669,506128\n" +
            "370561,539656\n" +
            "739805,512051\n" +
            "71060,619441\n" +
            "624861,518534\n" +
            "261660,554714\n" +
            "366137,540160\n" +
            "166054,575698\n" +
            "601878,519990\n" +
            "153445,579501\n" +
            "279899,551729\n" +
            "379166,538691\n" +
            "423209,534125\n" +
            "675310,515526\n" +
            "145641,582050\n" +
            "691353,514627\n" +
            "917468,504026\n" +
            "284778,550976\n" +
            "81040,612235\n" +
            "161699,576978\n" +
            "616394,519057\n" +
            "767490,510661\n" +
            "156896,578431\n" +
            "427408,533714\n" +
            "254849,555884\n" +
            "737217,512182\n" +
            "897133,504851\n" +
            "203815,566051\n" +
            "270822,553189\n" +
            "135854,585475\n" +
            "778805,510111\n" +
            "784373,509847\n" +
            "305426,547921\n" +
            "733418,512375\n" +
            "732087,512448\n" +
            "540668,524215\n" +
            "702898,513996\n" +
            "628057,518328\n" +
            "640280,517587\n" +
            "422405,534204\n" +
            "10604,746569\n" +
            "746038,511733\n" +
            "839808,507293\n" +
            "457417,530938\n" +
            "479030,529064\n" +
            "341758,543090\n" +
            "620223,518824\n" +
            "251661,556451\n" +
            "561790,522696\n" +
            "497733,527521\n" +
            "724201,512863\n" +
            "489217,528217\n" +
            "415623,534867\n" +
            "624610,518548\n" +
            "847541,506953\n" +
            "432295,533249\n" +
            "400391,536421\n" +
            "961158,502319\n" +
            "139173,584284\n" +
            "421225,534315\n" +
            "579083,521501\n" +
            "74274,617000\n" +
            "701142,514087\n" +
            "374465,539219\n" +
            "217814,562985\n" +
            "358972,540995\n" +
            "88629,607424\n" +
            "288597,550389\n" +
            "285819,550812\n" +
            "538400,524385\n" +
            "809930,508645\n" +
            "738326,512126\n" +
            "955461,502535\n" +
            "163829,576343\n" +
            "826475,507891\n" +
            "376488,538987\n" +
            "102234,599905\n" +
            "114650,594002\n" +
            "52815,636341\n" +
            "434037,533082\n" +
            "804744,508880\n" +
            "98385,601905\n" +
            "856620,506559\n" +
            "220057,562517\n" +
            "844734,507078\n" +
            "150677,580387\n" +
            "558697,522917\n" +
            "621751,518719\n" +
            "207067,565321\n" +
            "135297,585677\n" +
            "932968,503404\n" +
            "604456,519822\n" +
            "579728,521462\n" +
            "244138,557813\n" +
            "706487,513800\n" +
            "711627,513523\n" +
            "853833,506674\n" +
            "497220,527562\n" +
            "59428,629511\n" +
            "564845,522486\n" +
            "623621,518603\n" +
            "242689,558077\n" +
            "125091,589591\n" +
            "363819,540432\n" +
            "686453,514901\n" +
            "656813,516594\n" +
            "489901,528155\n" +
            "386380,537905\n" +
            "542819,524052\n" +
            "243987,557841\n" +
            "693412,514514\n" +
            "488484,528271\n" +
            "896331,504881\n" +
            "336730,543721\n" +
            "728298,512647\n" +
            "604215,519840\n" +
            "153729,579413\n" +
            "595687,520398\n" +
            "540360,524240\n" +
            "245779,557511\n" +
            "924873,503730\n" +
            "509628,526577\n" +
            "528523,525122\n" +
            "3509,847707\n" +
            "522756,525555\n" +
            "895447,504922\n" +
            "44840,646067\n" +
            "45860,644715\n" +
            "463487,530404\n" +
            "398164,536654\n" +
            "894483,504959\n" +
            "619415,518874\n" +
            "966306,502129\n" +
            "990922,501212\n" +
            "835756,507474\n" +
            "548881,523618\n" +
            "453578,531282\n" +
            "474993,529410\n" +
            "80085,612879\n" +
            "737091,512193\n" +
            "50789,638638\n" +
            "979768,501620\n" +
            "792018,509483\n" +
            "665001,516122\n" +
            "86552,608694\n" +
            "462772,530469\n" +
            "589233,520821\n" +
            "891694,505072\n" +
            "592605,520594\n" +
            "209645,564741\n" +
            "42531,649269\n" +
            "554376,523226\n" +
            "803814,508929\n" +
            "334157,544042\n" +
            "175836,572970\n" +
            "868379,506051\n" +
            "658166,516520\n" +
            "278203,551995\n" +
            "966198,502126\n" +
            "627162,518387\n" +
            "296774,549165\n" +
            "311803,547027\n" +
            "843797,507118\n" +
            "702304,514032\n" +
            "563875,522553\n" +
            "33103,664910\n" +
            "191932,568841\n" +
            "543514,524006\n" +
            "506835,526794\n" +
            "868368,506052\n" +
            "847025,506971\n" +
            "678623,515342\n" +
            "876139,505726\n" +
            "571997,521984\n" +
            "598632,520198\n" +
            "213590,563892\n" +
            "625404,518497\n" +
            "726508,512738\n" +
            "689426,514738\n" +
            "332495,544264\n" +
            "411366,535302\n" +
            "242546,558110\n" +
            "315209,546555\n" +
            "797544,509219\n" +
            "93889,604371\n" +
            "858879,506454\n" +
            "124906,589666\n" +
            "449072,531693\n" +
            "235960,559345\n" +
            "642403,517454\n" +
            "720567,513047\n" +
            "705534,513858\n" +
            "603692,519870\n" +
            "488137,528302\n" +
            "157370,578285\n" +
            "63515,625730\n" +
            "666326,516041\n" +
            "619226,518883\n" +
            "443613,532186\n" +
            "597717,520257\n" +
            "96225,603069\n" +
            "86940,608450\n" +
            "40725,651929\n" +
            "460976,530625\n" +
            "268875,553508\n" +
            "270671,553214\n" +
            "363254,540500\n" +
            "384248,538137\n" +
            "762889,510892\n" +
            "377941,538833\n" +
            "278878,551890\n" +
            "176615,572755\n" +
            "860008,506412\n" +
            "944392,502967\n" +
            "608395,519571\n" +
            "225283,561450\n" +
            "45095,645728\n" +
            "333798,544090\n" +
            "625733,518476\n" +
            "995584,501037\n" +
            "506135,526853\n" +
            "238050,558952\n" +
            "557943,522972\n" +
            "530978,524938\n" +
            "634244,517949\n" +
            "177168,572616\n" +
            "85200,609541\n" +
            "953043,502630\n" +
            "523661,525484\n" +
            "999295,500902\n" +
            "840803,507246\n" +
            "961490,502312\n" +
            "471747,529685\n" +
            "380705,538523\n" +
            "911180,504275\n" +
            "334149,544046\n" +
            "478992,529065\n" +
            "325789,545133\n" +
            "335884,543826\n" +
            "426976,533760\n" +
            "749007,511582\n" +
            "667067,516000\n" +
            "607586,519623\n" +
            "674054,515599\n" +
            "188534,569675\n" +
            "565185,522464\n" +
            "172090,573988\n" +
            "87592,608052\n" +
            "907432,504424\n" +
            "8912,760841\n" +
            "928318,503590\n" +
            "757917,511138\n" +
            "718693,513153\n" +
            "315141,546566\n" +
            "728326,512645\n" +
            "353492,541647\n" +
            "638429,517695\n" +
            "628892,518280\n" +
            "877286,505672\n" +
            "620895,518778\n" +
            "385878,537959\n" +
            "423311,534113\n" +
            "633501,517997\n" +
            "884833,505360\n" +
            "883402,505416\n" +
            "999665,500894\n" +
            "708395,513697\n" +
            "548142,523667\n" +
            "756491,511205\n" +
            "987352,501340\n" +
            "766520,510705\n" +
            "591775,520647\n" +
            "833758,507563\n" +
            "843890,507108\n" +
            "925551,503698\n" +
            "74816,616598\n" +
            "646942,517187\n" +
            "354923,541481\n" +
            "256291,555638\n" +
            "634470,517942\n" +
            "930904,503494\n" +
            "134221,586071\n" +
            "282663,551304\n" +
            "986070,501394\n" +
            "123636,590176\n" +
            "123678,590164\n" +
            "481717,528841\n" +
            "423076,534137\n" +
            "866246,506145\n" +
            "93313,604697\n" +
            "783632,509880\n" +
            "317066,546304\n" +
            "502977,527103\n" +
            "141272,583545\n" +
            "71708,618938\n" +
            "617748,518975\n" +
            "581190,521362\n" +
            "193824,568382\n" +
            "682368,515131\n" +
            "352956,541712\n" +
            "351375,541905\n" +
            "505362,526909\n" +
            "905165,504518\n" +
            "128645,588188\n" +
            "267143,553787\n" +
            "158409,577965\n" +
            "482776,528754\n" +
            "628896,518282\n" +
            "485233,528547\n" +
            "563606,522574\n" +
            "111001,595655\n" +
            "115920,593445\n" +
            "365510,540237\n" +
            "959724,502374\n" +
            "938763,503184\n" +
            "930044,503520\n" +
            "970959,501956\n" +
            "913658,504176\n" +
            "68117,621790\n" +
            "989729,501253\n" +
            "567697,522288\n" +
            "820427,508163\n" +
            "54236,634794\n" +
            "291557,549938\n" +
            "124961,589646\n" +
            "403177,536130\n" +
            "405421,535899\n" +
            "410233,535417\n" +
            "815111,508403\n" +
            "213176,563974\n" +
            "83099,610879\n" +
            "998588,500934\n" +
            "513640,526263\n" +
            "129817,587733\n" +
            "1820,921851\n" +
            "287584,550539\n" +
            "299160,548820\n" +
            "860621,506386\n" +
            "529258,525059\n" +
            "586297,521017\n" +
            "953406,502616\n" +
            "441234,532410\n" +
            "986217,501386\n" +
            "781938,509957\n" +
            "461247,530595\n" +
            "735424,512277\n" +
            "146623,581722\n" +
            "839838,507288\n" +
            "510667,526494\n" +
            "935085,503327\n" +
            "737523,512167\n" +
            "303455,548204\n" +
            "992779,501145\n" +
            "60240,628739\n" +
            "939095,503174\n" +
            "794368,509370\n" +
            "501825,527189\n" +
            "459028,530798\n" +
            "884641,505363\n" +
            "512287,526364\n" +
            "835165,507499\n" +
            "307723,547590\n" +
            "160587,577304\n" +
            "735043,512300\n" +
            "493289,527887\n" +
            "110717,595785\n" +
            "306480,547772\n" +
            "318593,546089\n" +
            "179810,571911\n" +
            "200531,566799\n" +
            "314999,546580\n" +
            "197020,567622\n" +
            "301465,548487\n" +
            "237808,559000\n" +
            "131944,586923\n" +
            "882527,505449\n" +
            "468117,530003\n" +
            "711319,513541\n" +
            "156240,578628\n" +
            "965452,502162\n" +
            "992756,501148\n" +
            "437959,532715\n" +
            "739938,512046\n" +
            "614249,519196\n" +
            "391496,537356\n" +
            "62746,626418\n" +
            "688215,514806\n" +
            "75501,616091\n" +
            "883573,505412\n" +
            "558824,522910\n" +
            "759371,511061\n" +
            "173913,573489\n" +
            "891351,505089\n" +
            "727464,512693\n" +
            "164833,576051\n" +
            "812317,508529\n" +
            "540320,524243\n" +
            "698061,514257\n" +
            "69149,620952\n" +
            "471673,529694\n" +
            "159092,577753\n" +
            "428134,533653\n" +
            "89997,606608\n" +
            "711061,513557\n" +
            "779403,510081\n" +
            "203327,566155\n" +
            "798176,509187\n" +
            "667688,515963\n" +
            "636120,517833\n" +
            "137410,584913\n" +
            "217615,563034\n" +
            "556887,523038\n" +
            "667229,515991\n" +
            "672276,515708\n" +
            "325361,545187\n" +
            "172115,573985\n" +
            "13846,725685";

    public static void main(String[] args) {
        String arr[] = input.split("\n");

        int count =0;
        BigInteger max = new BigInteger("0");
        for(int i=0;i<arr.length;i++){
            String temp[] = arr[i].split(",");
            BigInteger tempInt = new BigInteger(temp[0]).pow(Integer.parseInt(temp[1]));
            System.out.println(tempInt);
            if(max.compareTo(tempInt) == 1){
                max = tempInt;
                count = i;
                System.out.println(count);
            }
        }
        System.out.println(count);
    }
}
