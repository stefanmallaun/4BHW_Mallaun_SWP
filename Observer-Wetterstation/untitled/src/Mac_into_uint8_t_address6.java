import java.util.Arrays;

public class Mac_into_uint8_t_address6 {
    public static void main(String[] args) {
        String macAddress = "98:D3:41:F5:F6:6B";
        byte[] address = new byte[6];

        // Remove colons from the MAC address
        macAddress = macAddress.replace(":", "");

        // Parse the hexadecimal string into a byte array
        for (int i = 0; i < 6; i++) {
            address[i] = (byte) Integer.parseInt(macAddress.substring(i*2, i*2+2), 16);
        }

        // Print the byte array to verify the conversion
        System.out.println(Arrays.toString(address));
    }
}