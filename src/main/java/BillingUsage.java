import java.io.Serializable;

public class BillingUsage implements Serializable {

    private final String tenantIdentityId;
    private final Double size;
    private final String unit;

    public BillingUsage(String tenantIdentityId, double size, String unit) {
        this.size = size;
        this.tenantIdentityId = tenantIdentityId;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "ColdStoreUsage [tenantIdentityId="
                + tenantIdentityId
                + ", size="
                + size
                + ", unit="
                + unit
                + "]";
    }
}
