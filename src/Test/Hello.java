package Test;

/**
 * @author Xiong
 * @create 2021-08-15-15:47
 */
class Hello {
    private int helloPrivate;
    int helloDefault;
    protected int helloProtected;
    public int helloPublic;

    private void methodPrivate(){
        helloPrivate   = 1; //即使最小的权限也能在类内部使用
        helloDefault   = 2;
        helloProtected = 3;
        helloPublic    = 3;
    }
    void methodDefault(){
        helloPrivate   = 1; //即使最小的权限也能在类内部使用
        helloDefault   = 2;
        helloProtected = 3;
        helloPublic    = 3;
    }
    void methodProtected(){
        helloPrivate   = 1; //即使最小的权限也能在类内部使用
        helloDefault   = 2;
        helloProtected = 3;
        helloPublic    = 3;
    }
    public void methodPublic(){
        helloPrivate   = 1; //即使最小的权限也能在类内部使用
        helloDefault   = 2;
        helloProtected = 3;
        helloPublic    = 3;
    }
}
