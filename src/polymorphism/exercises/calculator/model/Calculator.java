package polymorphism.exercises.calculator.model;

import polymorphism.exercises.calculator.enums.Cache;
import polymorphism.exercises.calculator.enums.Operator;
import polymorphism.exercises.calculator.enums.Result;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {
    private Long cache;
    private Long result;
    private final Deque<Long> memory;
    Operator operator;
    Cache cacheState;
    Result resultState;

    public Calculator() {
        this.cache = null;
        this.result = null;
        this.memory = new ArrayDeque<>();
        this.operator = Operator.NONE;
        this.cacheState = Cache.UNLOCKED;
        this.resultState = Result.LOCKED;
    }

    public Long getCache() {
        return this.cache;
    }

    public void setCache(Long cache) {
        this.cache = cache;
    }

    public Long getResult() {
        return this.result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public Deque<Long> getMemory() {
        return this.memory;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Cache getCacheState() {
        return this.cacheState;
    }

    public void setCacheState(Cache cacheState) {
        this.cacheState = cacheState;
    }

    public Result getResultState() {
        return this.resultState;
    }

    public void setResultState(Result resultState) {
        this.resultState = resultState;
    }
}
