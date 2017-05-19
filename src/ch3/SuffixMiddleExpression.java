package ch3;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *后缀表达式、中缀转后缀
 *
 *
 * https://zh.wikipedia.org/wiki/%E8%B0%83%E5%BA%A6%E5%9C%BA%E7%AE%97%E6%B3%95 （调度场算法）
 */
public class SuffixMiddleExpression {

    public double compute(String[] middle){
        ArrayList<String> strings = this.MiddleToSuffix(middle);

        double result = 0;
        Stack<Double> integers = new Stack<>();
        integers.push(Double.valueOf(strings.get(0)));
        integers.push(Double.valueOf(strings.get(1)));
        for (int i = 2; i <strings.size() ; i++) {
            if (isNumeric(strings.get(i))){
                integers.push(Double.valueOf(strings.get(i)));
            }else{
                if (strings.get(i).equals("(")
                        ||strings.get(i).equals(")"))
                    continue;
                else{
                    Double pop1 = integers.pop();
                    Double pop2 = integers.pop();
                    if ("+".equals(strings.get(i))){
                        pop1 = pop1 + pop2;
                    }else
                    if ("-".equals(strings.get(i))){
                        pop1 = pop2 - pop1;
                    }else
                    if ("*".equals(strings.get(i))){
                        pop1 = pop1 * pop2;
                    }else
                    if ("/".equals(strings.get(i))){
                        pop1 = pop2 / pop1;
                    }else

                    if ("^".equals(strings.get(i))){
                        //pop1 = TestBIgInt.binInt(pop2,pop1);
                        pop1 =  Math.pow(pop2,pop1);
                    }
                    integers.push(pop1);

                }
            }
        }
        result = integers.peek();
        return  result;
    }

    /**
     * 中缀表达式转为后缀
     * 规则：从左到右遍历中缀表达式的每个数字和符号，若是数字就输出，
     * 即成为后缀表达式的一部分；若是符号，则判断其与栈顶符号的优先级，
     * 是右括号或优先级低于找顶符号（乘除优先加减）则栈顶元素依次出找并输出，
     * 并将当前符号进栈，一直到最终输出后缀表达式为止。
     */
    public ArrayList<String> MiddleToSuffix(String[] middle){
        ArrayList<String> results = new ArrayList<>();
        Stack numbers = new Stack();//存放数字
        Stack<String> strings = new Stack<>();//临时存放操作字符

        for (int i = 0; i < middle.length; i++) {
            if (isNumeric(middle[i])){//是数字
                results.add(middle[i]);
            }else{
                if (middle[i].equals(")")){
                    while (true){
                        String stackFirst = strings.peek();
                        if (stackFirst!= null
                                &&!stackFirst.equals("(")
                                && level(stackFirst) >= level(middle[i])){
                            results.add(strings.pop());

                        }else{
                            results.add(strings.pop());
                            results.add(middle[i]);
                            break;
                        }

                    }
                }else
                    while (true){
                        if (strings.empty()){
                            strings.push(middle[i]);
                            break;
                        }
                        String stackFirst = strings.peek();
                        if (stackFirst.equals("(")){
                            strings.push(middle[i]);
                            break;
                        }else{
                            if (level(stackFirst) >= level(middle[i])){
                                results.add(strings.pop());

                            }else{
                                strings.push(middle[i]);
                                break;
                            }
                        }


                    }

            }
        }
        while (!strings.empty()){
            results.add(strings.pop());
        }

        return results;
    }

    /**
     * 判断字符等级
     * @param code
     * @return
     */
    private int level(String code){
        int result =0;
        switch (code){
            case "-":;
            case "+":result =2;break;
            case "/":;
            case "*":result = 3;break;
            case "^":result = 4;break;
            case "(":result = 5;break;
            case ")":result = 1;break;
            default:result = -1;
        }
        return  result;
    }

    /**
     * 判断是否是数字
     * @param str
     * @return
     */
    public boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
}
