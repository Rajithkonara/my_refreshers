package basics.overrideeh;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {

    private final int id;
    private final String name;
    private final int age;

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Student student = (Student) obj;
        return (student.id == this.id);
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
