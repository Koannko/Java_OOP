package observer;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {
    private String title;
    private String description;
    private VacancyType vacancyType;

    public Vacancy(String title, String description, VacancyType vacancyType) {
        this.title = title;
        this.description = description;
        this.vacancyType = vacancyType;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public VacancyType getJobType() {
        return vacancyType;
    }
}

