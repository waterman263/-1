public class student {
    private String id;
    private  String name;
    private  String number;
    private  String address;
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getnumber(){
        return number;
    }
    public void setnumber(String number){
        this.number=number;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public String okle(){
        return "学生[学号:"+id+"，姓名:"+name+"，电话:"+number+"，地址:"+address+"]";
    }
}
