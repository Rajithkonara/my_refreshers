package com.rkdevblog.learn.generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalsCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}