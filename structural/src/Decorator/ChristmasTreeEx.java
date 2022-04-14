package Decorator;

public class ChristmasTreeEx {
    public static void main(String[] args) {
        
        // Christmas tree
        ChristmasTree tree = new DefaultChristmasTree();
        System.out.println(tree.decorate());

        // Christmas tree + Lights
        ChristmasTree treeWithLights = new Lights(
                new DefaultChristmasTree()
        );
        
        System.out.println(treeWithLights.decorate());

        // Christmas tree + Lights + Flowers
        ChristmasTree treeWithLightsAndFlowers = new Flowers(
                new Lights(
                        new DefaultChristmasTree()
                )
        );
        
        System.out.println(treeWithLightsAndFlowers.decorate());
    }
}