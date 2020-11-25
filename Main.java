class Main 
{
  public static void main(String[] args) 
  {
    Sugar tree = new Sugar("tree", false);
   
    tree.cutOutShape("tree", 10);

    tree.areBaked(350, 12);

    tree.isDecorated();

    Sugar aCookie = new Sugar();

    aCookie.isDecorated();
  }
}