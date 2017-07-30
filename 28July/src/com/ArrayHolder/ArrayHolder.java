package com.ArrayHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by chhedab on 7/28/2017.
 */
public class ArrayHolder {
    int[] array ;
    ArrayHolder(int[] value){
        this.array = value;
    }

    public void forEach(Consumer<Integer> consumer){
        for(int num : array){
            consumer.accept(num);
        }
    }
    public void modify(Function<Integer, Integer> function){
        for(int i = 0; i < array.length; i++){
            array[i] = function.apply(array[i]);
        }
    }

    public void delete(Predicate<Integer> predicate){
        for (int i = 0; i < array.length; i++){
            if(predicate.test(array[i])){
                array[i] = 0;
            }
        }

    }
        int sum;
    public int fold(BiFunction<Integer, Integer, Integer> bifunc){
       for(int i = 0; i < array.length; i++){
          sum =  bifunc.apply(sum, array[i]);
       }
       return sum;
    }


    }
