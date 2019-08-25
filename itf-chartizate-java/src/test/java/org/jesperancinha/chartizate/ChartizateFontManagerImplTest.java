package org.jesperancinha.chartizate;

import static java.lang.Character.UnicodeBlock.BASIC_LATIN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.jesperancinha.chartizate.ChartizateUnicodes.getAllUniCodeBlocksJava;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.awt.*;
import java.lang.Character.UnicodeBlock;
import java.util.List;

public class ChartizateFontManagerImplTest {

    @Test
    public void testGetCharacterWidth() {
        final ChartizateFontManager<Font> manager = new ChartizateFontManagerImpl("Arial", 10);

        assertThat(manager.getCharacterWidth('a')).isEqualTo(6);
        assertThat(manager.getCharacterWidth('A')).isEqualTo(7);
    }

    @Test
    public void testGetAllUniCodeBlocks() {
        final UnicodeBlock[] testUnicodes = new UnicodeBlock[]{
            BASIC_LATIN,
        };

        final List<UnicodeBlock> result = getAllUniCodeBlocksJava();

        assertThat(result).isNotEmpty();
        assertThat(result).contains(testUnicodes);
    }

    @Test
    public void testGetAllDistributionTypes() {
        final String[] testDistributions = new String[]{
            "Linear",
            "Gaussian",
            "Poisson",
            "Skellam"
        };

        final List<String> result = ChartizateFontManagerImpl.getAllDistributionTypes();

        assertArrayEquals(testDistributions, result.toArray());
    }

    @Test
    public void testGetAllFontTypes() {
        List<String> allFontTypes = ChartizateFontManagerImpl.getAllFontTypes();
        assertThat(allFontTypes).hasAtLeastOneElementOfType(String.class);
    }
}