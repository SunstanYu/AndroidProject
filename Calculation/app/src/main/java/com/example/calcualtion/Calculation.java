package com.example.calcualtion;

public class Calculation {
    public static String calcuationFunction(String currentNumber, String lastNumber, String operator) {
        int currentDataType = 0;
        int lastDataType = 0;
        //0是int，1是double
        if (currentNumber.length() == 0) {
            //equal后operator不会清除
            return lastNumber;
        } else if (operator.length() == 0) {
            return currentNumber;
        }
        if (currentNumber.contains(".")) {
            currentDataType = 1;
        }
        if (lastNumber.contains(".")) {
            lastDataType = 1;
        }
        if (currentDataType == 0 && lastDataType == 0) {
            return operatorCalculation(currentNumber,lastNumber,operator,currentDataType,lastDataType);
        }else if(currentDataType==1&&lastDataType==0){
            return operatorCalculation(currentNumber,lastNumber,operator,currentDataType,lastDataType);
        }else if(currentDataType == 1 && lastDataType == 1){
            return operatorCalculation(currentNumber,lastNumber,operator,currentDataType,lastDataType);
        }else if (currentDataType == 0 && lastDataType == 1){
            return operatorCalculation(currentNumber,lastNumber,operator,currentDataType,lastDataType);
        }
        return "";
    }

    public static String operatorCalculation(String a, String b, String operator, int aType, int bType) {
        String result = "";
        int temp1;
        double temp2;
        if (aType == 0 && bType == 0) {
            int currentNum = Integer.parseInt(a);
            int lastNum = Integer.parseInt(b);
            switch (operator) {
                case "+":
                    temp1 = currentNum + lastNum;
                    result = String.valueOf(temp1);
                    break;
                case "-":
                    temp1 = lastNum - currentNum;
                    result = String.valueOf(temp1);
                    break;
                case "*":
                    temp1 = currentNum * lastNum;
                    result = String.valueOf(temp1);
                    break;
                case "/":
                    temp2 = (double) lastNum / (double)currentNum;
                    result=String.valueOf(temp2);
                    if(result.substring(result.indexOf("."),result.length()).length()>9){
                        result = String.format("%.9f",temp2);
                    }else {
                        result = String.valueOf(temp2);
                    }
                    break;
            }
        } else if (aType == 1 && bType == 0) {
            double currentNum = Double.parseDouble(a);
            int lastNum = Integer.parseInt(b);
            switch (operator) {
                case "+":
                    temp2 = currentNum + lastNum;
                    result = String.valueOf(temp2);
                    break;
                case "-":
                    temp2 = lastNum - currentNum;
                    result = String.valueOf(temp2);
                    break;
                case "*":
                    temp2 = currentNum * lastNum;
                    result = String.valueOf(temp2);
                    break;
                case "/":
                    temp2 = (double) lastNum / currentNum;
                    result=String.valueOf(temp2);
                    if(result.substring(result.indexOf("."),result.length()).length()>9){
                        result = String.format("%.9f",temp2);
                    }else {
                        result = String.valueOf(temp2);
                    }
                    break;
            }
        } else if (aType == 1 && bType == 1) {
            double currentNum = Double.parseDouble(a);
            double lastNum = Double.parseDouble(b);
            switch (operator) {
                case "+":
                    temp2 = currentNum + lastNum;
                    result = String.valueOf(temp2);
                    break;
                case "-":
                    temp2 = lastNum - currentNum;
                    result = String.valueOf(temp2);
                    break;
                case "*":
                    temp2 = currentNum * lastNum;
                    result = String.valueOf(temp2);
                    break;
                case "/":
                    temp2 = lastNum / currentNum;
                    result=String.valueOf(temp2);
                    if(result.substring(result.indexOf("."),result.length()).length()>9){
                        result = String.format("%.9f",temp2);
                    }else {
                        result = String.valueOf(temp2);
                    }
                    break;
            }
        } else if (aType == 0 && bType == 1) {
            int currentNum = Integer.parseInt(a);
            double lastNum = Double.parseDouble(b);
            switch (operator) {
                case "+":
                    temp2 = currentNum + lastNum;
                    result = String.valueOf(temp2);
                    break;
                case "-":
                    temp2 = lastNum - currentNum;
                    result = String.valueOf(temp2);
                    break;
                case "*":
                    temp2 = currentNum * lastNum;
                    result = String.valueOf(temp2);
                    break;
                case "/":
                    temp2 = lastNum / (double) currentNum;
                    result=String.valueOf(temp2);
                    if(result.substring(result.indexOf("."),result.length()).length()>9){
                        result = String.format("%.9f",temp2);
                    }else {
                        result = String.valueOf(temp2);
                    }
                    break;
            }
        }
        return result;
    }
}