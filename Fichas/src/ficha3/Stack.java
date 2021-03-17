package ficha3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
public class Stack {
    private List<String> stack;

    //Array list faz a gestão dinâmica do espaço, vai tendo o espaço necessário.
    public Stack() {
        this.stack = new ArrayList<>();
    }

    public Stack(List<String> s) {
        setStack(s);
    }

    public void push(String s) {
        this.stack.add(0, s);
    }

    public String top() {
        if (!empty()) return this.stack.get(0);
        return null;
    }

    public void pop() {
        if (!empty()) this.stack.remove(0);
    }

    boolean empty() {
        return this.stack.isEmpty();
    }

    public int length() {
        return this.stack.size();
    }

    public Stack(obj) {
        this.stack = obj.getStack();
    }

    public List<String> getStack() {
        List<String> res = new ArrayList<>(stack.size());
        for (String s : this.stack) res.add(s);
        return res;
    }

    public void setStack(List<String> stk) {
        this.stack = new ArrayList<>();
        for (String s : stk) this.stack.add(s);
    }

    public Stack clone() {
        return new Stack(this);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != this.getClass()) return false;
        Stack obj = (Stack) o;
        return Objects.equals(stack, obj.stack);
    }

    public String toString() {
        return this.stack.toString();
    }
}
 */
