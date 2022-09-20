package LossCoupling_Decoupling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiFilter implements MovieFilters{

    @Override
    public List<String> getRecommandations() {
        List<String> arr = new ArrayList<>();
        for (String movie:
                ContentFiltering.getSpecialRecommandations(" ")) {
            arr.add(movie);
        }
        arr = arr.stream().filter(s -> s.length()<10).collect(Collectors.toList());
        return arr;
    }
}
