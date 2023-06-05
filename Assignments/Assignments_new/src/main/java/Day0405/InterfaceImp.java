package Day0405;


class InterfaceImp implements Interface_One, Interface_Two{
        @Override
        public void returnYear() {
            System.out.println("2006");
        }
       @Override
       public void returnMake() {
            System.out.println("Honda");
        }

}

class Main {
        public static void main(String args[]) {
            InterfaceImp imp1 = new InterfaceImp();
            InterfaceImp imp2 = new InterfaceImp();
            imp2.returnMake();

            imp1.returnYear();
        }
}

