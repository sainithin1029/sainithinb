abstract class Department{
    abstract int getDepartmentSize();

    
}
class Example extends Department{
    int size;
    int getDepartmentSize(){
        return size;
    }
}