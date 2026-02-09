package Classes;
import com.google.gson.annotations.SerializedName;

public record CodigoInternacional(
        @SerializedName("conversion_rates")
        ConversionRates conversion_rates
) {}
