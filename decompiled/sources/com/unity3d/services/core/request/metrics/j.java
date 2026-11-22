package com.unity3d.services.core.request.metrics;

import java.util.Map;

/* JADX INFO: compiled from: TSIMetric.java */
/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static d a(Long l, Map<String, String> map) {
        return new d("native_initialization_time_failure", l, map);
    }

    public static d b(Long l, Map<String, String> map) {
        return new d("native_initialization_time_success", l, map);
    }

    public static d c() {
        return new d("native_missing_game_session_id", null, null);
    }

    public static d d() {
        return new d("native_missing_state_id", null, null);
    }

    public static d e() {
        return new d("native_missing_token", null, null);
    }

    public static d a() {
        return new d("native_emergency_switch_off", null, null);
    }

    public static d b() {
        return new d("native_initialization_started", null, null);
    }

    public static d c(Long l, Map<String, String> map) {
        return new d("native_token_availability_latency_config", l, map);
    }

    public static d d(Long l, Map<String, String> map) {
        return new d("native_token_availability_latency_webview", l, map);
    }

    public static d e(Long l, Map<String, String> map) {
        return new d("native_token_resolution_request_latency", l, map);
    }

    public static d a(Long l) {
        return new d("native_device_info_collection_latency", l, null);
    }

    public static d b(Long l) {
        return new d("native_device_info_compression_latency", l, null);
    }

    public static d c(Long l) {
        return new d("native_privacy_resolution_request_latency_failure", l, null);
    }

    public static d d(Long l) {
        return new d("native_privacy_resolution_request_latency_success", l, null);
    }

    public static d a(Map<String, String> map) {
        return new d("native_async_token_available", null, map);
    }

    public static d b(Map<String, String> map) {
        return new d("native_async_token_null", null, map);
    }

    public static d c(Map<String, String> map) {
        return new d("native_generated_token_available", null, map);
    }

    public static d d(Map<String, String> map) {
        return new d("native_generated_token_null", null, map);
    }
}
