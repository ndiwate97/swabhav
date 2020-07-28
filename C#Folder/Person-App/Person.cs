using System;
using System.Collections.Generic;
using System.Text;

namespace Person_App
{
    class Person
    {
        private string name;
        private int age;
        private string gender;
        private float weight;
        private float height;

        public Person(string name, int age, string gender, float weight, float height)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.weight = weight;
            this.height = height;
        }

        public string GetName() => name;

        public int GetAge() => age;

        public string Getgender() => gender;

        public float GetWeight() => weight;

        public float GetHeight() => height;

        public void DoWorkOut()
        {
            float currentweight = (float)(weight  - (weight * 0.2));
            weight = currentweight;
        }

        public void DoEat()
        {
            float currentweight = (float)(weight + (weight * 0.05));
            weight = currentweight;
        }

    }
}
