
public class Chapter7to2 {
	public static void main(String[] args) {
		String color = "green"; {
			switch(color){
			case("red"):
				System.out.println("赤信号です");
			break;
			case("yellow"):
				System.out.println("黄信号です");
			break;
			case("blue"):
				System.out.println("青信号です");
			break;
			default:
				System.out.println("信号の色ではありません");
			}
		}
	}
}


//public class Chapter07 {
//    public static void main(String[] args) {
//        String color = "yellow"; // 例としてyellowで初期化。他の色でも良い
//        switch(color) {
//          case "red" :
//            System.out.println("赤信号です");
//            break;
//          case "yellow" :
//            System.out.println("黄信号です");
//            break;
//          case "blue" :
//            System.out.println("青信号です");
//            break;
//          default:
//            System.out.println("信号の色ではありません");
//        }
//    }
//}