package saml.bluetooth.powermeter;

import android.os.Bundle;

import org.schabi.newpipe.R;
import org.schabi.newpipe.util.ThemeHelper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static org.schabi.newpipe.util.Localization.assureCorrectAppLanguage;

public class BluetoothScanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        setTheme(ThemeHelper.getSettingsThemeStyle(this));
        assureCorrectAppLanguage(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bluetooth_settings_layout);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
