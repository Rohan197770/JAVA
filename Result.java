
    public static class Result {
        public String output1;
        public String output2;
        public String output3;
    }

    public static Result encodeStrings(String input1, String input2, String input3) {
        Result result = new Result();

        String front1, middle1, end1;
        String front2, middle2, end2;
        String front3, middle3, end3;

        int length1 = input1.length();
        int length2 = input2.length();
        int length3 = input3.length();

        if (length1 % 3 == 0) {
            front1 = input1.substring(0, length1 / 3);
            middle1 = input1.substring(length1 / 3, 2 * length1 / 3);
            end1 = input1.substring(2 * length1 / 3);
        } else if (length1 % 3 == 1) {
            front1 = input1.substring(0, length1 / 3);
            middle1 = input1.substring(length1 / 3, 2 * length1 / 3 + 1);
            end1 = input1.substring(2 * length1 / 3 + 1);
        } else {
            front1 = input1.substring(0, length1 / 3 + 1);
            middle1 = input1.substring(length1 / 3 + 1, 2 * length1 / 3 + 1);
            end1 = input1.substring(2 * length1 / 3 + 1);
        }

        if (length2 % 3 == 0) {
            front2 = input2.substring(0, length2 / 3);
            middle2 = input2.substring(length2 / 3, 2 * length2 / 3);
            end2 = input2.substring(2 * length2 / 3);
        } else if (length2 % 3 == 1) {
            front2 = input2.substring(0, length2 / 3);
            middle2 = input2.substring(length2 / 3, 2 * length2 / 3 + 1);
            end2 = input2.substring(2 * length2 / 3 + 1);
        } else {
            front2 = input2.substring(0, length2 / 3 + 1);
            middle2 = input2.substring(length2 / 3 + 1, 2 * length2 / 3 + 1);
            end2 = input2.substring(2 * length2 / 3 + 1);
        }

        if (length3 % 3 == 0) {
            front3 = input3.substring(0, length3 / 3);
            middle3 = input3.substring(length3 / 3, 2 * length3 / 3);
            end3 = input3.substring(2 * length3 / 3);
        } else if (length3 % 3 == 1) {
            front3 = input3.substring(0, length3 / 3);
            middle3 = input3.substring(length3 / 3, 2 * length3 / 3 + 1);
            end3 = input3.substring(2 * length3 / 3 + 1);
        } else {
            front3 = input3.substring(0, length3 / 3 + 1);
            middle3 = input3.substring(length3 / 3 + 1, 2 * length3 / 3 + 1);
            end3 = input3.substring(2 * length3 / 3 + 1);
        }

        result.output1 = front1 + end2 + middle3;
        result.output2 = middle1 + front2 + end3;
        result.output3 = end1 + middle2 + front3;
        result.output3 = toggleCase(result.output3);

        return result;
    }

    private static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhan";
        Result result = encodeStrings(input1, input2, input3);
        System.out.println("Output 1: " + result.output1);
        System.out.println("Output 2: " + result.output2);
        System.out.println("Output 3: " + result.output3);
    }
}
