import java.util.Scanner;
public class system {
    static int index = 0;
    static student[] students = new student[45];
    private static Object student;

    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("-----    欢迎使用学生信息管理系统    -----");
        System.out.println("-------------------------------------");
        for(;;) {
            test();
        }
    }

    public static void test(){
        System.out.println("1、添加学生信息");
        System.out.println("2、删除学生信息");
        System.out.println("3、修改学生信息");
        System.out.println("4、查询学生信息");
        System.out.println("请选择功能并并回车输入");
        Scanner scanner = new Scanner(System.in);
        int shuru = scanner.nextInt();
        switch (shuru) {
            case 1: {
                if (index > students.length - 1) {
                    System.out.println("已满员");
                    return;
                }
                System.out.println("已选择添加学生信息：");
                student text = new student();
                System.out.println("输入学号后按下回车键");
                String id = scanner.next();
                text.setid(id);
                if (index > 0) {
                    for (student stu : students) {
                        if (stu == null) {    //当某个位置为null时，其后的位置都为null,不用再查找了
                            break;
                        }
                        if (stu.getid().equals(text.getid())) {//判断学号是否重复
                            System.out.println("学号不能重复，请重新输入学号：");
                            text.setid(scanner.next());
                            break;
                        }
                    }
                }
                System.out.println("请输入姓名，点击enter键");
                text.setname(scanner.next());
                System.out.println("请输入手机号，点击enter键");
                text.setnumber(scanner.next());
                System.out.println("请输入家庭地址，点击enter键");
                text.setaddress(scanner.next());

                students[index] = (student) student;	//把学生的信息依次填入数组中
                index++;
                System.out.println("添加成功");
                break;
            }
            case 2:{
                System.out.println("·删除学生信息");
                System.out.println("请输入要删除学生的学号：");
                String id = scanner.next();

                index=0;
                for(student student:students) {
                    if(student == null) {
                        break;
                    }
                    if(student.getid().equals(id)) { //找到了要删除的学生
                        while(index<students.length-1) {
                            students[index] = students[index+1]; //把要删除学生其后的学生依次向前移一位
                            index++;
                        }
                        students[students.length-1] = null; //最后一个学生向前移一位了，所以最后一位就是null；若没有学生，此处虽看似多余，但却可以减少判断每次循环的判断
                        System.out.println("删除成功，已返回！");
                        return;
                    }
                    index++;
                }

                System.out.println("未找到学号为"+id+"的学生，无法删除");
                return;
            }
            case 3:{
                System.out.println("·修改学生信息");
                System.out.println("请输入要修改的学生的学号：");
                String id = scanner.next();

                for(student student:students) {
                    if(student == null) {
                        break;
                    }
                    if(student.getid().equals(id)) {
                        System.out.println("请输入新的姓名，点击enter键");
                        student.setname(scanner.next());
                        System.out.println("请输入新的手机号，点击enter键");
                        student.setnumber(scanner.next());
                        System.out.println("请输入新的家庭地址，点击enter键");
                        student.setaddress(scanner.next());
                        System.out.println("修改成功，已返回！");
                        return;
                    }
                }

                System.out.println("未查到学号为"+id+"的学生，无法修改！");
                return;
            }
            case 4:{

                boolean flag = false;
                System.out.println("·查询学生信息");
                System.out.println("请输入要查询学生的姓名：");
                String name = scanner.next();

                for(student student: students) {
                    if(student == null) {
                        break;
                    }
                    if(student.getName().equals(name)) {
                        System.out.println(student);
                        flag = true;
                    }
                }

                if(!flag) {
                    System.out.println("姓名为"+name+"的学生不存在");
                    return;
                }
                break;
            }
            default:
                System.out.println("系统未找到"+shuru+"操作项");
        }

    }

        }


