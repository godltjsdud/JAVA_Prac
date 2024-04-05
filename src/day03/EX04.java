package day03;

public class EX04 {
    public static void main(String[] args) {

        //레시피 - 슈퍼 : getInfo
        //파스타 레시피 - 자식
        //스테이크 레시피 - grill ~~ meat

        Recipe steak = new SteakRecipe("김아무개");
        Recipe pasta = new PastaRecipe("이아무개");

        pasta.getInfo();
        steak.getInfo();

    }
}

abstract class Recipe{
    String name;

    Recipe(String name){
        this.name = name;
    }
    abstract void getInfo();

}


class PastaRecipe extends Recipe{

    PastaRecipe(String name) {
        super(name);
    }

    @Override
    void getInfo() {
        makeSource();
    }

    void makeSource(){
        System.out.println("소스를 만듭니다.");
    }


}

class SteakRecipe extends  Recipe{
    SteakRecipe(String name) {
        super(name);
    }

    @Override
    void getInfo() {
        grill();
    }
    void grill(){
        System.out.println("고기를 그릴에 굽습니다.");
    }

}



