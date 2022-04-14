package Builder;

public class NutritionFactsEx {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts
                .Builder(240, 8)    // 필수값 입력
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();           // build() 가 객체를 생성해 돌려준다.

        System.out.println(cocaCola.toString());
    }
}
