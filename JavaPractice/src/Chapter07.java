
public class Chapter07 {
	public static void main(String[] args) {
		int val = 11;

		if (val <= 5) {
			System.out.println("とても近いです");
		}
		else if (val >= 5) {
			System.out.println("近いです");
		}
		else if (val <= 10) {
			System.out.println("遠いです");
		}
		else if (val <= 15) {
			System.out.println(	"とても遠いです");
		}
	}
}


//答え

//public class Chapter07 {
//    public static void main(String[] args) {
//        int distance = 12; // 例として12で初期化。他の数値でも良い
//        if (distance <= 5) {
//            System.out.println("とても近いです");
//        } else if (distance <= 10) {
//            System.out.println("近いです");
//         } else if (distance <= 15) {
//            System.out.println("遠いです");
//        } else {
//            System.out.println("とても遠いです");
//        }
//    }
//}

//上限を関所としてやるようなイメージか...