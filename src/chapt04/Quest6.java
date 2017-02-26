package chapt04;
/** Created by a on 2/26/17.
 1) mQ1 mP1;
 2) mQuestl mP1;
 3) помилка компіляції в рядку //1;
 4) помилка компіляції в рядку //2;
 5) помилка компіляції в рядку //3.
 */
class Q {
    void mQ(int i){
        System.out.println("mQ" + i);
    }
}
class Quest6 extends Q {
    public void mQ(int i){
        System.out.println("mQuest" + i);
    }
    public void mP(int i){
        System.out.println("mP" + i);
    }
    public static void main(String args[]){
//        Q ob = new Quest6(); //1
//        Q ob = new Q(); //1
        Quest6 ob = new Quest6(); //1
        ob.mQ(1); //2
//        ob.mP(1); //3
    }
}