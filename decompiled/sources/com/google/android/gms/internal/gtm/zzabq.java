package com.google.android.gms.internal.gtm;

import androidx.work.impl.Scheduler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzabq implements zzxl {
    LOGSID_NONE(0),
    LOGSID_IP_ADDRESS(1),
    LOGSID_IP_ADDRESS_INTERNAL(2),
    LOGSID_USER_AGENT(3),
    LOGSID_SENSITIVE_TIMESTAMP(4),
    LOGSID_SENSITIVE_LOCATION(5),
    LOGSID_APPROXIMATE_LOCATION(15),
    LOGSID_COARSE_LOCATION(6),
    LOGSID_OTHER_LOCATION(9),
    LOGSID_OTHER_VERSION_ID(7),
    LOGSID_REFERER(8),
    LOGSID_THIRD_PARTY_PARAMETERS(16),
    LOGSID_OTHER_PSEUDONYMOUS_ID(10),
    LOGSID_PREF(11),
    LOGSID_ZWIEBACK(12),
    LOGSID_BISCOTTI(13),
    LOGSID_CUSTOM_SESSION_ID(14),
    LOGSID_OTHER_PERSONAL_ID(20),
    LOGSID_GAIA_ID(21),
    LOGSID_EMAIL(22),
    LOGSID_USERNAME(23),
    LOGSID_PHONE_NUMBER(24),
    LOGSID_GAIA_ID_PUBLIC(207),
    LOGSID_OTHER_AUTHENTICATED_ID(30),
    LOGSID_OTHER_UNAUTHENTICATED_ID(31),
    LOGSID_PARTNER_OR_CUSTOMER_ID(32),
    LOGSID_PUBLISHER_ID(35),
    LOGSID_DASHER_ID(33),
    LOGSID_FOCUS_GROUP_ID(34),
    LOGSID_OTHER_MOBILE_DEVICE_ID(50),
    LOGSID_GSERVICES_ANDROID_ID(51),
    LOGSID_HARDWARE_ID(52),
    LOGSID_MSISDN_ID(53),
    LOGSID_BUILD_SERIAL_ID(54),
    LOGSID_UDID_ID(55),
    LOGSID_ANDROID_LOGGING_ID(56),
    LOGSID_SECURE_SETTINGS_ANDROID_ID(57),
    LOGSID_OTHER_IDENTIFYING_USER_INFO(100),
    LOGSID_USER_INPUT(Scheduler.MAX_GREEDY_SCHEDULER_LIMIT),
    LOGSID_DEMOGRAPHIC_INFO(201),
    LOGSID_GENERIC_KEY(202),
    LOGSID_GENERIC_VALUE(203),
    LOGSID_COOKIE(204),
    LOGSID_URL(205),
    LOGSID_HTTPHEADER(206);

    private static final zzxm zzT = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzabp
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            zzabq zzabqVar = zzabq.LOGSID_NONE;
            if (i == 100) {
                return zzabq.LOGSID_OTHER_IDENTIFYING_USER_INFO;
            }
            switch (i) {
                case 0:
                    return zzabq.LOGSID_NONE;
                case 1:
                    return zzabq.LOGSID_IP_ADDRESS;
                case 2:
                    return zzabq.LOGSID_IP_ADDRESS_INTERNAL;
                case 3:
                    return zzabq.LOGSID_USER_AGENT;
                case 4:
                    return zzabq.LOGSID_SENSITIVE_TIMESTAMP;
                case 5:
                    return zzabq.LOGSID_SENSITIVE_LOCATION;
                case 6:
                    return zzabq.LOGSID_COARSE_LOCATION;
                case 7:
                    return zzabq.LOGSID_OTHER_VERSION_ID;
                case 8:
                    return zzabq.LOGSID_REFERER;
                case 9:
                    return zzabq.LOGSID_OTHER_LOCATION;
                case 10:
                    return zzabq.LOGSID_OTHER_PSEUDONYMOUS_ID;
                case 11:
                    return zzabq.LOGSID_PREF;
                case 12:
                    return zzabq.LOGSID_ZWIEBACK;
                case 13:
                    return zzabq.LOGSID_BISCOTTI;
                case 14:
                    return zzabq.LOGSID_CUSTOM_SESSION_ID;
                case 15:
                    return zzabq.LOGSID_APPROXIMATE_LOCATION;
                case 16:
                    return zzabq.LOGSID_THIRD_PARTY_PARAMETERS;
                default:
                    switch (i) {
                        case 20:
                            return zzabq.LOGSID_OTHER_PERSONAL_ID;
                        case 21:
                            return zzabq.LOGSID_GAIA_ID;
                        case 22:
                            return zzabq.LOGSID_EMAIL;
                        case 23:
                            return zzabq.LOGSID_USERNAME;
                        case 24:
                            return zzabq.LOGSID_PHONE_NUMBER;
                        default:
                            switch (i) {
                                case 30:
                                    return zzabq.LOGSID_OTHER_AUTHENTICATED_ID;
                                case 31:
                                    return zzabq.LOGSID_OTHER_UNAUTHENTICATED_ID;
                                case 32:
                                    return zzabq.LOGSID_PARTNER_OR_CUSTOMER_ID;
                                case 33:
                                    return zzabq.LOGSID_DASHER_ID;
                                case 34:
                                    return zzabq.LOGSID_FOCUS_GROUP_ID;
                                case 35:
                                    return zzabq.LOGSID_PUBLISHER_ID;
                                default:
                                    switch (i) {
                                        case 50:
                                            return zzabq.LOGSID_OTHER_MOBILE_DEVICE_ID;
                                        case 51:
                                            return zzabq.LOGSID_GSERVICES_ANDROID_ID;
                                        case 52:
                                            return zzabq.LOGSID_HARDWARE_ID;
                                        case 53:
                                            return zzabq.LOGSID_MSISDN_ID;
                                        case 54:
                                            return zzabq.LOGSID_BUILD_SERIAL_ID;
                                        case 55:
                                            return zzabq.LOGSID_UDID_ID;
                                        case 56:
                                            return zzabq.LOGSID_ANDROID_LOGGING_ID;
                                        case 57:
                                            return zzabq.LOGSID_SECURE_SETTINGS_ANDROID_ID;
                                        default:
                                            switch (i) {
                                                case Scheduler.MAX_GREEDY_SCHEDULER_LIMIT /* 200 */:
                                                    return zzabq.LOGSID_USER_INPUT;
                                                case 201:
                                                    return zzabq.LOGSID_DEMOGRAPHIC_INFO;
                                                case 202:
                                                    return zzabq.LOGSID_GENERIC_KEY;
                                                case 203:
                                                    return zzabq.LOGSID_GENERIC_VALUE;
                                                case 204:
                                                    return zzabq.LOGSID_COOKIE;
                                                case 205:
                                                    return zzabq.LOGSID_URL;
                                                case 206:
                                                    return zzabq.LOGSID_HTTPHEADER;
                                                case 207:
                                                    return zzabq.LOGSID_GAIA_ID_PUBLIC;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
    };
    private final int zzV;

    zzabq(int i) {
        this.zzV = i;
    }

    public static zzxm zzb() {
        return zzT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzV);
    }

    @Override // com.google.android.gms.internal.gtm.zzxl
    public final int zza() {
        return this.zzV;
    }
}
