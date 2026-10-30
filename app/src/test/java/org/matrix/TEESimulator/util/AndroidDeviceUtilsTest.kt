package org.matrix.TEESimulator.util

import org.junit.Assert.assertEquals
import org.junit.Test

class AndroidDeviceUtilsTest {
    @Test
    fun usesCachedOsVersionBeforeSdkMapping() {
        assertEquals(150000, AndroidDeviceUtils.resolveOsVersion(150000, 37))
        assertEquals(170000, AndroidDeviceUtils.resolveOsVersion(170000, 36))
    }

    @Test
    fun mapsAndroidVersionsWhenCacheIsMissing() {
        assertEquals(170000, AndroidDeviceUtils.resolveOsVersion(null, 37))
        assertEquals(160000, AndroidDeviceUtils.resolveOsVersion(null, 36))
        assertEquals(150000, AndroidDeviceUtils.resolveOsVersion(null, 35))
        assertEquals(130000, AndroidDeviceUtils.resolveOsVersion(null, 33))
        assertEquals(160000, AndroidDeviceUtils.resolveOsVersion(null, 999))
    }
}
