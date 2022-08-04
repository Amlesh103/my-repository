import java.io.IOException;
class Test{
public static void main(String[] args){
Test t = new Test();
try{
t.check();
}catch(Exception e){
System.out.println("catch block 1");
}
}
void check() throws Exception{
try{
throw new IOException();
}catch(IOException e){
System.out.println("catch block 2");
throw new Exception();
}
catch(Exception e){
System.out.println("catch block 3");
}
finally{
System.out.println("finally returning");
}
}
}