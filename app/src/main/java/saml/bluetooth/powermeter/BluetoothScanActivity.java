package saml.bluetooth.powermeter;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

import org.schabi.newpipe.R;
import org.schabi.newpipe.util.ThemeHelper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static org.schabi.newpipe.util.Localization.assureCorrectAppLanguage;

public class BluetoothScanActivity extends AppCompatActivity {
    private BluetoothManager getBluetoothManager() {
        return (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
    }

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        setTheme(ThemeHelper.getSettingsThemeStyle(this));
        assureCorrectAppLanguage(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bluetooth_settings_layout);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final BluetoothManager bluetoothManager = getBluetoothManager();

    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
