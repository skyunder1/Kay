public class Country() {
  //나라 정보의 관한 오브젝트를 만들었던 거 같다.
  String name; //나라이름
  String language; //국가언어
  int papulation; //인구
  String continent; //대륙
  long gdp; //내가 파이낸스를 좋아해서 이것도 넣어봤다. 금액이 크기때문에 long 형 데이터로.

  public void Country() {
    //오브젝트에는 생성자?? 맞나.. 이게 필요하다. 선생님이 말씀하신 걸 기억하기론. 오브젝트 생성자는 클래스 이름과 똑같이.
    //오브젝트는 생성자와 변수, 메소드로 이루어진 것이라 했다. 만약 틀리다면 내가 기억을 잘못하는 것으로 선생님의 가르침과 무관하다
    //비난은 나에게로..
    name = ""; // 초기화는 생활하라고 배웠고 오브젝트 초기화는 생성자 안에서 해야 한다. 그 이유는 나중에 다루도록 하자.
    languege = "";
    papulation = "";
    continent = "";
    gdp = 0;
  }

  public void showInfo() {
    //showInfo 메소드는 말 그대로 출력을 위한 메소드이다.
    System.out.println("name : " + name);
    System.out.println("language : " + language);
    System.out.println("papulation : " + papulation);
    System.out.println("continent : " + continent);
    System.out.println("gdp : " + gdp);
  }
}
