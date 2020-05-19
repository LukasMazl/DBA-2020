/* 
 * DBA 2020
 *
 * semestral work
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing MachinecontrollerApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class MachinecontrollerApiTests
    {
        private MachinecontrollerApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new MachinecontrollerApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of MachinecontrollerApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' MachinecontrollerApi
            //Assert.IsInstanceOfType(typeof(MachinecontrollerApi), instance, "instance is a MachinecontrollerApi");
        }

        
        /// <summary>
        /// Test CreateMachineUsingPOST
        /// </summary>
        [Test]
        public void CreateMachineUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateMachineDTO createMachineDTO = null;
            //var response = instance.CreateMachineUsingPOST(createMachineDTO);
            //Assert.IsInstanceOf<CreateMachineResponse> (response, "response is CreateMachineResponse");
        }
        
        /// <summary>
        /// Test DeleteMachineUsingPOST
        /// </summary>
        [Test]
        public void DeleteMachineUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //DeleteMachineDTO deleteMachineDTO = null;
            //var response = instance.DeleteMachineUsingPOST(deleteMachineDTO);
            //Assert.IsInstanceOf<DeteleMachineResponse> (response, "response is DeteleMachineResponse");
        }
        
        /// <summary>
        /// Test UpdateMachineUsingPOST
        /// </summary>
        [Test]
        public void UpdateMachineUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //UpdateMachineDTO updateMachineDTO = null;
            //string vinCode = null;
            //var response = instance.UpdateMachineUsingPOST(updateMachineDTO, vinCode);
            //Assert.IsInstanceOf<UpdateMachineResponse> (response, "response is UpdateMachineResponse");
        }
        
    }

}
