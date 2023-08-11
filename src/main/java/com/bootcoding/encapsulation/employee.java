package com.bootcoding.encapsulation;

public class employee {
    public static class employe{
        private String Name;
        private int age ;
        private int basic;
        private double DA;
        private double HRA;
        private double gs;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getBasic() {
            return basic;
        }

        public void setBasic(int basic) {
            this.basic = basic;
        }

        public double getDA() {
            return DA;
        }

        public void setDA(int basic) {
            this.DA = basic * 0.1;
        }

        public double getHRA() {
            return HRA;
        }

        public void setHRA(int basic) {
            this.HRA = basic * 0.15;
        }



        public void setGs() {
            this.gs = basic + DA + HRA;
        }

        @Override
        public String toString() {
            return "employe{" +
                    "Name='" + Name + '\'' +
                    ", age=" + age +
                    ", basic=" + basic +
                    ", DA=" + DA +
                    ", HRA=" + HRA +
                    ", gs=" + gs +
                    '}';
        }
    }

    public static  void main(String[] args) {
        employe e1 = new employe();
        e1.setName("prashant");
        e1.setAge(22);
        e1.setBasic(10000);
        e1.setDA(10000);
        e1.setHRA(10000);
        e1.setGs();
        System.out.println(e1.toString());

    }
}
