package io.github.younghwang.hfdesignpattern.templatemethod;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected boolean customWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("Pouring into a cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
