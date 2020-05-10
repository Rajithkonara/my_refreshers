package com.rkdevblog.learn.oop.`interface`

import com.rkdevblog.learn.oop.FishAction

// get gold color by GoldColor class

class Plecostomus2(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("Get alge"),
    FishColor by fishColor {

}