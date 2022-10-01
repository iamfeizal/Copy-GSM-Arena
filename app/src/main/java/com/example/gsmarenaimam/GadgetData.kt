package com.example.gsmarenaimam

object GadgetData {
    private var data = arrayOf(
        arrayOf(
            "Apple iPhone 13 Pro Max",
            "DxOMark: 137" +
                    "\nAnTuTu: 824959",
            R.drawable.apple_iphone_13_pro_max_01,
            "Processor: Apple A15 Bionic (5 nm)\n" +
                    "\nCamera:" +
                    "\n12 MP, f/1.5, 26mm (wide), 1.9µm, dual pixel PDAF, sensor-shift OIS\n" +
                    "12 MP, f/2.8, 77mm (telephoto), PDAF, OIS, 3x optical zoom\n" +
                    "12 MP, f/1.8, 13mm, 120˚ (ultrawide), PDAF\n"
        ),
        arrayOf(
            "Asus ROG Phone6 Pro",
            "DxOMark: -" +
                    "\nAnTuTu: 1114647",
            R.drawable.asus_rog_phone6_pro_01,
            "Processor: Snapdragon 8+ Gen 1 (4 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.9, (wide), 1/1.56\", 1.0µm, PDAF\n" +
                    "13 MP, f/2.2, (ultrawide)\n" +
                    "5 MP, (macro)"
        ),
        arrayOf(
            "Google Pixel 6 Pro",
            "DxOMark: 135" +
                    "\nAnTuTu: 685634",
            R.drawable.google_pixel_6_pro_1,
            "Processor: Google Tensor (5 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.9, 25mm (wide), 1/1.31\", 1.2µm, Dual Pixel PDAF, Laser AF, OIS\n" +
                    "48 MP, f/3.5, 104mm (telephoto), 1/2\", 0.8µm, PDAF, OIS, 4x optical zoom\n" +
                    "12 MP, f/2.2, 17mm, 114˚ (ultrawide), 1.25µm"
        ),
        arrayOf(
            "Honor Magic4 Ultimate",
            "DxOMark: 146" +
                    "\nAnTuTu: -",
            R.drawable.honor_magic4_ultimate_1,
            "Processor: Snapdragon 8 Gen 1 (4 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.6, 23mm (wide), 1/1.12\", 1.4µm, PDAF, Laser AF\n" +
                    "64 MP, f/2.2, 126˚ (ultrawide), 1/2.0\", 0.7µm\n" +
                    "64 MP, f/3.5, 90mm (periscope telephoto), 1/2.0\", 0.7µm, PDAF, OIS, 3.5x optical zoom\n" +
                    "50 MP, f/2.0, (wide), 1/2.5\", PDAF"
        ),
        arrayOf(
            "Huawei Mate40 Pro",
            "DxOMark: 136" +
                    "\nAnTuTu: -",
            R.drawable.huawei_mate40_pro_1,
            "Processor: Kirin 9000 5G (5 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.9, 23mm (wide), 1/1.28\", 1.22µm, multi-directional PDAF, Laser AF\n" +
                    "12 MP, f/3.4, 125mm (periscope telephoto), PDAF, OIS, 5x optical zoom\n" +
                    "20 MP, f/1.8, 18mm (ultrawide), PDAF"
        ),
        arrayOf(
            "Huawei P50 Pro",
            "DxOMark: 144" +
                    "\nAnTuTu: 652672",
            R.drawable.huawei_p50_pro_01,
            "Processor: Kirin 9000 (5 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.8, 23mm (wide), PDAF, Laser AF, OIS\n" +
                    "64 MP, f/3.5, 90mm (periscope telephoto), PDAF, OIS, 3.5x optical zoom, 7x lossless zoom\n" +
                    "13 MP, f/2.2, 13mm (ultrawide), AF\n" +
                    "40 MP, f/1.6, 23mm (B/W), AF"
        ),
        arrayOf(
            "Oppo Find X3 Pro",
            "DxOMark: 131" +
                    "\nAnTuTu: 721442",
            R.drawable.oppo_find_x3_pro_1,
            "Processor: Snapdragon 888 5G (5 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.8, 26mm (wide), 1/1.56\", 1.0µm, multi-directional PDAF, OIS\n" +
                    "13 MP, f/2.4, 52mm (telephoto), 1/3.4\", 1.0µm, 2x optical zoom, PDAF\n" +
                    "50 MP, f/2.2, 16mm, 110˚ (ultrawide), 1/1.56\", 1.0µm, multi-directional PDAF\n" +
                    "3 MP, f/3.0, (microscope), AF, ring flash, 60x magnification"
        ),
        arrayOf(
            "Realme GT2 Pro",
            "DxOMark: 120" +
                    "\nAnTuTu: 948587",
            R.drawable.realme_gt2_pro_1,
            "Processor: Snapdragon 8 Gen 1 (4 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.8, 24mm (wide), 1/1.56\", 1.0µm, multi-directional PDAF, OIS\n" +
                    "50 MP, f/2.2, 15mm, 150˚ (ultrawide), 1/2.76\", 0.64µm\n" +
                    "3 MP, f/3.3, 20mm (microscope), AF, 40x magnification"
        ),
        arrayOf(
            "Samsung Galaxy S22 Ultra 5G",
            "DxOMark: 131" +
                    "\nAnTuTu: 915283",
            R.drawable.samsung_galaxy_s22_ultra_5g_1,
            "Processor: " +
                    "\nExynos 2200 (4 nm) - Europe" +
                    "\nQualcomm SM8450 Snapdragon 8 Gen 1 (4 nm) - ROW\n" +
                    "\nCamera:" +
                    "\n108 MP, f/1.8, 23mm (wide), 1/1.33\", 0.8µm, PDAF, Laser AF, OIS\n" +
                    "10 MP, f/4.9, 230mm (periscope telephoto), 1/3.52\", 1.12µm, dual pixel PDAF, OIS, 10x optical zoom\n" +
                    "10 MP, f/2.4, 70mm (telephoto), 1/3.52\", 1.12µm, dual pixel PDAF, OIS, 3x optical zoom\n" +
                    "12 MP, f/2.2, 13mm, 120˚ (ultrawide), 1/2.55\", 1.4µm, dual pixel PDAF, Super Steady video"
        ),
        arrayOf(
            "Vivo X70 Pro",
            "DxOMark: 135" +
                    "\nAnTuTu: -",
            R.drawable.vivo_x70_pro_1,
            "Processor: " +
                    "\nMediaTek MT6893 Dimensity 1200 (6 nm) - International" +
                    "\nExynos 1080 (5 nm) - China\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.8, (wide), 1/1.56\", 1.0µm, PDAF, Laser AF, gimbal OIS\n" +
                    "8 MP, f/3.4, 125mm (periscope telephoto), 1/4.4\", 1.0µm, PDAF, OIS, 5x optical zoom\n" +
                    "12 MP, f/2.0, 50mm (telephoto), 1/2.93\", 1.22µm, PDAF, 2x optical zoom\n" +
                    "12 MP, f/2.2, 16mm, 116˚ (ultrawide), 1/3.1\", 1.12µm, AF"
        ),
        arrayOf(
            "Xiaomi 12 Pro",
            "DxOMark: 131" +
                    "\nAnTuTu: 985527",
            R.drawable.xiaomi_12_pro_1,
            "Processor: Snapdragon 8 Gen 1 (4 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/1.9, 24mm (wide), 1/1.28\", 1.22µm, Dual Pixel PDAF, OIS\n" +
                    "50 MP, f/1.9, 48mm (telephoto), PDAF, 2x optical zoom\n" +
                    "50 MP, f/2.2, 115˚ (ultrawide)"
        ),
        arrayOf(
            "Xiaomi 12S Ultra",
            "DxOMark: 138" +
                    "\nAnTuTu: -",
            R.drawable.xiaomi_12s_ultra_1,
            "Processor: Snapdragon 8+ Gen 1 (4 nm)\n" +
                    "\nCamera:" +
                    "\n50.3 MP, f/1.9, 23mm (wide), 1.0\", 1.6µm, Dual Pixel PDAF, Laser AF, OIS\n" +
                    "48 MP, f/4.1, 120mm (periscope telephoto), 1/2.0\", 0.8µm, PDAF, OIS, 5x optical zoom\n" +
                    "48 MP, f/2.2, 13mm, 128˚ (ultrawide), 1/2.0\", 0.8µm, Dual-Pixel PDAF\n" +
                    "TOF 3D, (depth)"
        ),
        arrayOf(
            "Mi 11 Ultra 5G",
            "DxOMark: 143" +
                    "\nAnTuTu: 772274",
            R.drawable.xiaomi_mi11_ultra_5g_k1_1,
            "Processor: Snapdragon 888 5G (5 nm)\n" +
                    "\nCamera:" +
                    "\n50 MP, f/2.0, 24mm (wide), 1/1.12\", 1.4µm, Dual Pixel PDAF, Laser AF, OIS\n" +
                    "48 MP, f/4.1, 120mm (periscope telephoto), 1/2.0\", 0.8µm, PDAF, OIS, 5x optical zoom\n" +
                    "48 MP, f/2.2, 12mm, 128˚ (ultrawide), 1/2.0\", 0.8µm, PDAF"
        ),
        arrayOf(
            "Poco F4 GT",
            "DxOMark: -" +
                    "\nAnTuTu: 980588",
            R.drawable.xiaomi_poco_f4_gt_1,
            "Processor: Snapdragon 8 Gen 1 (4 nm)\n" +
                    "\nCamera:" +
                    "\n64 MP, f/1.9, 26mm (wide), 1/1.73\", 0.8µm, PDAF\n" +
                    "8 MP, f/2.2, 120˚ (ultrawide)\n" +
                    "2 MP, f/2.4, (macro)"
        )
    )

    val listData: ArrayList<Gadget>
        get() {
            val list = ArrayList<Gadget>()
            for (aData in data) {
                val gadget = Gadget()
                gadget.name = aData[0] as String
                gadget.rate = aData[1] as String
                gadget.photo = aData[2] as Int
                gadget.overview = aData[3] as String

                list.add(gadget)
            }
            return list
        }
}